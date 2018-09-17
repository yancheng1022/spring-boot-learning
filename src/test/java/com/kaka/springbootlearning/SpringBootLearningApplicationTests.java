package com.kaka.springbootlearning;

import com.kaka.springbootlearning.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearningApplicationTests {

//    @Autowired
//    Person person;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
//        System.out.println(person );
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //springBoot默认使用的是info级别的
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

}
