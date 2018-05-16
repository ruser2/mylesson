-- 数据库脚本初始化

-- 创建数据库
CREATE DATABASE seckill;
-- 使用数据库
USE seckill;
-- 创建表
CREATE TABLE seckill (
  seckill_id  BIGINT       NOT NULL  AUTO_INCREMENT
  COMMENT '秒杀库存id',
  name        VARCHAR(120) NOT NULL
  COMMENT '商品明细',
  number      INT          NOT NULL
  COMMENT '库存数量',
  #   一个表中出现多个timestamp并设置其中一个为current_timestamp的时候经常会遇到
  #1293 -Incorrect table definition; there can be only oneTIMESTAMP column with CURRENT_TIMESTAMP in DEFAULT or ON UPDATEclause
  #
  # 原因是当你给一个timestamp设置为on updatecurrent_timestamp的时候，其他的timestamp字段需要显式设定default值
  # 但是如果你有两个timestamp字段，但是只把第一个设定为current_timestamp而第二个没有设定默认值，mysql也能成功建表,但是反过来就不行...
  create_time TIMESTAMP    NOT NULL  DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  start_time  TIMESTAMP    NOT NULL
  COMMENT '秒杀开启时间',
  end_time    TIMESTAMP    NOT NULL
  COMMENT '秒杀结束时间',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8
  COMMENT ='秒杀库存表';

-- 初始化数据
INSERT INTO seckill
(name, number, start_time, end_time)
VALUES
  ('秒杀11111', 100, '2015-01-01 00:000', '2015-01-02 00:000'),
  ('秒杀22222', 200, '2015-01-01 00:000', '2015-01-02 00:000'),
  ('秒杀33333', 300, '2015-01-01 00:000', '2015-01-02 00:000'),
  ('秒杀44444', 400, '2015-01-01 00:000', '2015-01-02 00:000');

-- 秒杀记录明细
-- 用户登录认证相关的信息
CREATE TABLE success_killed (
  seckill_id  BIGINT    NOT NULL
  COMMENT '秒杀库存id',
  user_phone  BIGINT    NOT NULL
  COMMENT '用户电话',
  status      TINYINT   NOT NULL
  COMMENT '状态:-1.invaild;0.success;1.payed;2.sended',
  create_time TIMESTAMP NOT NULL
  COMMENT '',
  PRIMARY KEY (seckill_id, user_phone),
  KEY idx_create_time(create_time)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT ='秒杀成功明细表';
