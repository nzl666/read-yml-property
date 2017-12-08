package com.suyu.config;

import com.suyu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoUser {
    @Autowired
    private User user;

    @Bean
    @ConfigurationProperties(prefix = "suyu.data")
    public User user() {
        User user = new User();
        return user;
    }
}
