package cn.wyb.bootthymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wyb.bootthymeleaf.dao")
public class BootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootThymeleafApplication.class, args);
	}
}
