//package com.seckill.dao;
//
//import com.seckill.entity.Seckill;
//import com.seckill.entity.SysUser;
//import com.seckill.utils.JsonUtil;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//import java.util.Date;
//import java.util.List;
//
///**
// * @Author: zhouyh
// * @Date: 2018-02-28 18:10
// * @Description:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
////spring 配置文件位置
//@ContextConfiguration({"classpath:spring/spring-dao.xml"})
//public class SeckillDaoTest {
//    @Resource
//    private SeckillDao seckillDao;
//    @Test
//    public void TestReduceNumber() throws Exception {
//        long seckillId = 1000;
//        Date killTime = new Date();
//        System.out.println(seckillDao.reduceNumber(seckillId, killTime));
//    }
//    @Test
//    public  void TestSelectUserById(){
//        SysUser sysUser=new SysUser();
//        sysUser.setId(1L);
//        seckillDao.selectUserById(sysUser);
//        System.out.println(JsonUtil.getShowJson(sysUser));
//    }
//
//
//    @Test
//    public void TestQueryById() throws Exception {
//        long id=1000;
//        Seckill seckill=seckillDao.queryById(id);
//        System.out.println(seckill.getName());
//        System.out.println(JsonUtil.getShowJson(seckill));
//    }
//
//    @Test
//    public void TestQueryAll() throws Exception {
//        int offset = 0;
//        int limit = 8;
//        List<Seckill> seckills=seckillDao.queryAll(offset, limit);
//        for(Seckill seckill:seckills){
//            System.out.println(JsonUtil.getShowJson(seckill));
//        }
//    }
//
//}