package com.indu.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@Configuration, @EnableAutoConfiguration, @ComponentScan - automatically included bcz of below @SpringBootApplication
@ImportResource("/config/user-beans.xml")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}