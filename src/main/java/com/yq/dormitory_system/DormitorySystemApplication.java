package com.yq.dormitory_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.yq.dormitory_system.mapper")
@SpringBootApplication
public class DormitorySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DormitorySystemApplication.class, args);
    }

}
