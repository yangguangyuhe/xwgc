package com.shtel.test.hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shtel.test.hello.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
}
