package grapple.learn.springboot.logging;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("logback")
public class SpringbootLoggingApplicationTests {

	@Test
	public void contextLoads() {
		System.getProperties().forEach((x,y) -> System.out.println(x+" : "+y));
	}

}
