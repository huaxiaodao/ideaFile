package com.lea.min;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.lea.min.mapper")
public class MinApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinApplication.class, args);
    }

}
