package com.haien.test.scheduler;

import com.xiaoleilu.hutool.date.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author haien
 * @Description 跑批类
 * @Date 2019/7/12
 **/
public class MyJob {
    public static final Logger logger=LoggerFactory.getLogger(MyJob.class);

    /**
     * @Author haien
     * @Description 注意：方法不能有返回值，参数好像也不能有
     * @Date 2019/7/13
     * @Param []
     * @return void
     **/
    public void testMethod(){
        logger.info("Auto Execute TestMethod start! Date={}" ,
                new DateTime().toString("YYYY-MM-DD HH:mm:ss"));
        logger.info("*********跑批类**********");
        logger.info("Auto Execute TestMethod end! Date={}" ,
                new DateTime().toString("YYYY-MM-DD HH:mm:ss" ));
    }
}
