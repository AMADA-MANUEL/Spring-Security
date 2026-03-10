package com.example.spring_security_demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//In this class we want to enable spring security
@Configuration
@EnableWebSecurity
public class SpringSecurityAuthentication {
//we want to secure two urls
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
//inside the method I need to define the behaviour of this HTTP security
        http.authorizeHttpRequests(
                (req) -> req.antMatchers("/demo","/demo/one")
        )
    }

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


        UserDetails userTwo = users
                .username("testUserTwo")
                .password("passwordtwo")
                .roles("USER")
                .build();


        return new InMemoryUserDetailsManager(userOne , userTwo);
    }


}
