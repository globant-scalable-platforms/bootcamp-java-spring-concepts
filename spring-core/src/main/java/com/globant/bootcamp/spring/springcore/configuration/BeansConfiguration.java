package com.globant.bootcamp.spring.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.globant.bootcamp.spring.springcore.domain.Counter;

@Configuration
public class BeansConfiguration {
    
    @Bean
    @Scope("singleton")
    public Counter counterSingleton() {
        return new Counter(0, "I'm a singleton bean");
    }
    
    @Bean
    @Scope("prototype")
    public Counter counterPrototype() {
        return new Counter(0, "I'm a prototype bean");
    }

}
