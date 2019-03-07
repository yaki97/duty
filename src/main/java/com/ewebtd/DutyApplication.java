package com.ewebtd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})//exclude= {DataSourceAutoConfiguration.class}
@MapperScan(basePackages = "com.ewebtd.mapper")
public class DutyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DutyApplication.class, args);
		System.out.println("启动成功！");
	}
}
