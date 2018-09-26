package com.amser.raged.oblivion;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
// @SrpingBootApplication adds
// @ configuration tags the class as a source of bean definitions
// @EnableAutoConfiguration tells spring boot to start adding beans based on classpath settings, other beans and various property settings
// @EnableWebMvc is normally added but spring boot adds it automatically when it sees spring-webmvc on the classpath
// @ComponentScan tells spring to look for other components, configurations and services in the package allowing it to find controllers
@SpringBootApplication
public class Oblivion {


// main() method is used by Spring Boot's SpringApplication.run() method to launch an application
    public static void main(String[] args) {
        SpringApplication.run(Oblivion.class, args);
    }


// commandLineRunner marked as @Bean retrieves all the beans that were created either by your app or were automatically added thanks to Spring Boot

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}

