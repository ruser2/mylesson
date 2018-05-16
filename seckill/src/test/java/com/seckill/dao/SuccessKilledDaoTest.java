//package com.seckill.dao;
//
//import com.seckill.entity.Seckill;
//import com.seckill.entity.SuccessKilled;
//import com.seckill.mapperparam.SeckillQuery;
//import com.seckill.mapperparam.SuccessKilledQuery;
//import com.seckill.utils.JsonUtil;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
///**
// * @Author: zhouyh
// * @Date: 2018-02-28 18:10
// * @Description:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
////spring 配置文件位置
//@ContextConfiguration({"classpath:spring/spring-dao.xml"})
//public class SuccessKilledDaoTest {
//    @Resource
//    private SuccessKilledDao successKilledDao;
//    @Test
//    public void TestInsertSuccessKill() throws Exception {
//        long id=1001;
//        long phone=15252121221L;
//        System.out.println(successKilledDao.insertSuccessKill(id, phone));
//    }
//
//    @Test
//    public void TestQueryByIdWithSeckill() throws Exception {
//        long id=1000;
//        long phone=15252121222L;
//        System.out.println(JsonUtil.getShowJson(successKilledDao.queryByIdWithSeckill(id, phone)));
//    }
//
//    @Test
//    public void Testquery()throws Exception{
//        SuccessKilledQuery query=new SuccessKilledQuery();
//        SeckillQuery seckill=new SeckillQuery();
//        seckill.setNameLike("秒杀");
//        query.setUserPhone(15252121221L);
//        query.setSeckillId(1001L);
//        query.setSeckill(seckill);
////        query.setSeckillId(1000L);
////        query.setUserPhone(15252121222L);
//        System.out.println(JsonUtil.getShowJson(successKilledDao.query(query)));
//        System.out.println(successKilledDao.query(query).size());
//    }
//}