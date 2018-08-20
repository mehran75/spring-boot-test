package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        context.getBeanFactory().getBeanNamesIterator().forEachRemaining(s -> {
            System.out.println("Bean : " + s);
        });
    }
}
