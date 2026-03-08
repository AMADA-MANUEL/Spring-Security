package com.example.spring_security_demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//In this class we want to enable spring security
@Configuration
@EnableWebSecurity
public class SpringSecurityAuthentication {
    //bean is for handling the in memory users
    @Bean
    //this method should return in memory ...
    public InMemoryUserDetailsManager userDetailsManager(){
        //start building user details
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        UserDetails userOne = users
                .username("testUserOne")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userOne);
    }


}
