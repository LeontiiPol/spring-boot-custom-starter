package ru.polovinko.springbootcustomstarter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.polovinko.springbootcustomstarter.controller.DeprecatedController;
import ru.polovinko.springbootcustomstarter.service.DeprecatedAnnotationProcessor;
import ru.polovinko.springbootcustomstarter.service.DeprecatedClassesService;
import ru.polovinko.springbootcustomstarter.service.DeprecatedClassesServiceImpl;

@ConditionalOnProperty("deprecated-functionality.enabled")
@Configuration
public class DeprecatedAutoConfiguration {

    @Bean
    public DeprecatedController deprecatedController(@Autowired DeprecatedAnnotationProcessor deprecatedAnnotationProcessor) {
        return new DeprecatedController(deprecatedClassesService(deprecatedAnnotationProcessor));
    }

    @Bean
    public DeprecatedClassesService deprecatedClassesService(DeprecatedAnnotationProcessor deprecatedAnnotationProcessor) {
        return new DeprecatedClassesServiceImpl(deprecatedAnnotationProcessor);
    }

    @Bean
    public DeprecatedAnnotationProcessor deprecatedAnnotationProcessor() {
        return new DeprecatedAnnotationProcessor();
    }
}
