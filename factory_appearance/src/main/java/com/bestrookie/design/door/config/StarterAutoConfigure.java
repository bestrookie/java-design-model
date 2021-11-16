package com.bestrookie.design.door.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bestrookie
 * @date 2021/11/15 11:52 上午
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {
    @Autowired
    private StarterServiceProperties properties;
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "itstack.door",value = "enable",havingValue = "true")
    StarterService starterService(){
        return new StarterService(properties.getUserStr());
    }
}
