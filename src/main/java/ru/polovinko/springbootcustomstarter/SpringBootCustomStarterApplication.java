package ru.polovinko.springbootcustomstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(excludeFilters = @ComponentScan.Filter(RestController.class))
@SpringBootApplication
public class SpringBootCustomStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCustomStarterApplication.class, args);
    }

}
