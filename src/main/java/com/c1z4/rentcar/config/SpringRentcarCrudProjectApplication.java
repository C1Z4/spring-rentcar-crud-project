package com.c1z4.rentcar.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.c1z4.rentcar")
@MapperScan(basePackages = "com.c1z4.rentcar", annotationClass = Mapper.class)
public class SpringRentcarCrudProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRentcarCrudProjectApplication.class, args);
    }

}
