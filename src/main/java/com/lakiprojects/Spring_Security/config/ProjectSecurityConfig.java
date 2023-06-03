package com.lakiprojects.Spring_Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/api/v1/account/my-account","/api/v1/loan/my-loan").authenticated()
                .antMatchers("/api/v1/notice/my-notices").permitAll()
                .and().formLogin().and().httpBasic();
        return http.build();
    }
}
