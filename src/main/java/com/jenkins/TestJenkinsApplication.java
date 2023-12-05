package com.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);


    @PostConstruct
    public void init() {
        logger.info("Application started.............");
    }

    public static void main(String[] args) {
        logger.info("Application executed............");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println("...................................................................");
    }

}
