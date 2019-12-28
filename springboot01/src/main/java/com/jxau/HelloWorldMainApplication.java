package com.jxau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序，说明一个Spring boot
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //Spring 启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
