package ru.polovinko.springbootcustomstarter.service;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DeprecatedAnnotationProcessor implements BeanPostProcessor {

    private final List<Class<?>> deprecatedClasses = new ArrayList<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (
                bean.getClass().getPackage().getName().startsWith("ru.polovinko") &&
                bean.getClass().isAnnotationPresent(Deprecated.class)
        ) {
            deprecatedClasses.add(bean.getClass());
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
