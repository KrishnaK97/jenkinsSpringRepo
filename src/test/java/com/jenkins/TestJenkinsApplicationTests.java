package com.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info("Test execution started.................");
		Assertions.assertEquals(true, true);

	}

}
