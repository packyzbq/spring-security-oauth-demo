package com.example.authenserverdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * MyConfig
 *
 * @author Zhaobq
 * @version 1.0
 * @date 2020/12/18
 */
@Configuration
public class MyConfig {

//    @Bean
//    public TokenStore tokenStore(){
//        return new InMemoryTokenStore();
//    }
}
