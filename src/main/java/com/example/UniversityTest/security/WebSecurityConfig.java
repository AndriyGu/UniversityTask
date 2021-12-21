package com.example.UniversityTest.security;

/*

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
*/

public class WebSecurityConfig{}/*
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true)

public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {


    public WebSecurityConfig() {
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //виключив csrf захист щоб можна було надсилати POST запити
                .cors().and().csrf().disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                //TODO  chek all permits

                .authorizeRequests().antMatchers(
                        "/api/schedule/getScheduleDataStudent/{{firstName}}/{{lastName}}/{{data}}"
                ).permitAll()


                .and()
                .authorizeRequests().antMatchers("/api/**").authenticated()
                .anyRequest().permitAll()
                .and()
        ;
    }
}*/