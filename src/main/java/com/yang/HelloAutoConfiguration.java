package com.yang;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangzihe
 * @date 2022/2/16
 */
@ConditionalOnClass(HelloStarter.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloStarter helloStarter(HelloProperties helloProperties) {
        return new HelloStarter(helloProperties);
    }

}