package com.indu.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indu.catalog.controller.CatalogController;
import com.indu.controller.AddMemberController;
import com.indu.controller.LoginController;

//@Configuration, @EnableAutoConfiguration, @ComponentScan - automatically included bcz of below @SpringBootApplication
@ImportResource("/config/user-beans.xml")
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackageClasses= {AddMemberController.class, LoginController.class, CatalogController.class})
public class ApplicationWithMongoDBandCassendra {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationWithMongoDBandCassendra.class, args);
    }
    
    @RequestMapping("/whatisthis")
    public String greeting() {
        return "This is the EurekaClient !";
    }

}