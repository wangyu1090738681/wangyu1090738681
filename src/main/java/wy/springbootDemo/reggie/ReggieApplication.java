package wy.springbootDemo.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class ReggieApplication {

	public static void main(String[] args) {

		log.info("reggie项目成功启动!");
		SpringApplication.run(ReggieApplication.class, args);
	}

}
