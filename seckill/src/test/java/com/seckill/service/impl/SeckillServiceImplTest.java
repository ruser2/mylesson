//package com.seckill.service.impl;
//
//import com.seckill.dto.Exposer;
//import com.seckill.dto.SeckillExecution;
//import com.seckill.entity.Seckill;
//import com.seckill.exception.RepeatKillException;
//import com.seckill.exception.SeckillCloseException;
//import com.seckill.service.SeckillService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * @Author: zhouyh
// * @Date: 2018-03-04 17:08
// * @Description:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({
//        "classpath:spring/spring-dao.xml",
//        "classpath:spring/spring-service.xml"
//})
//public class SeckillServiceImplTest {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    private SeckillService seckillService;
//
//    @Test
//    public void TestGetSeckillList() throws Exception {
//        List<Seckill> seckillList = seckillService.getSeckillList();
//        logger.info("list={}", seckillList);
//    }
//
//    @Test
//    public void TestGetById() throws Exception {
//        long seckillId = 1000L;
//        Seckill seckill = seckillService.getById(seckillId);
//        logger.info("seckill={}", seckill);
//    }
//
//    @Test
//    public void TestExportSeckillUril() throws Exception {
//        long seckillId = 1000L;
//        Exposer exposer = seckillService.exportSeckillUril(seckillId);
//        logger.info("exposer={}", exposer);
//    }
//
//    @Test
//    public void TestExecuteSeckill() throws Exception {
//        try {
//            long phone = 18505911611L;
//            long seckillId = 1000L;
//            String md5 = "855f83d783689809d46c6771a13d63b7";
//            SeckillExecution seckillExecution = seckillService.executeSeckill(seckillId, phone, md5);
//            logger.info("seckillExecution={}", seckillExecution);
//        } catch (RepeatKillException e) {
//            logger.error(e.getMessage());
//        } catch (SeckillCloseException e1) {
//            logger.error(e1.getMessage());
//        }
//    }
//
//    //集成测试完整逻辑
//    @Test
//    public void testSeckillLogic()throws Exception{
//        long seckillId = 1001L;
//        Exposer exposer = seckillService.exportSeckillUril(seckillId);
//        if(exposer.isExposed()){
//            logger.info("exposer={}",exposer);
//            try {
//                long phone = 18505911611L;
//                String md5 = exposer.getMd5();
//                SeckillExecution seckillExecution = seckillService.executeSeckill(seckillId, phone, md5);
//                logger.info("seckillExecution={}", seckillExecution);
//            } catch (RepeatKillException e) {
//                logger.error(e.getMessage());
//            } catch (SeckillCloseException e1) {
//                logger.error(e1.getMessage());
//            }
//        }else {
//            logger.warn("exposer={}",exposer);
//        }
//    }
//
//}