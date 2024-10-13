package org.example.springbootcourse;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingBean(ConditionalBean.class)
    public ConditionalBean conditionalBean() {
        return new ConditionalBean("missing bean");
    }
}