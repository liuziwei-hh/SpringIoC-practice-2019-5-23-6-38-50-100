package com.example.SpringIoCpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringIoCPracticeApplicationTests {

	@Autowired
	Main main;
	@Test
	public void contextLoads() {
		main.testMain();
	}
}
