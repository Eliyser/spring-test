package com.haien.test.scheduler;

import org.quartz.SchedulerException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author haien
 * @Description 测试quartz
 * @Date 2019/7/13
 **/
public class TestTask {
    public static void main(String[] args) throws SchedulerException {
        /*Scheduler scheduler=(Scheduler)
                new ClassPathXmlApplicationContext("bean.xml")
                        .getBean("testSchedulerFactoryBean");
        //启动调度器
        scheduler.start();*/

        new ClassPathXmlApplicationContext("bean.xml");
    }
}
