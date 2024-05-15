package com.demo;

import com.demo.aop.AuthenticationAspect;
import com.demo.aop.LoggingAspect;
import com.demo.aop.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "demo")
@EnableAspectJAutoProxy
public class BeanConfig {

//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
//
//    @Bean
//    public Nurse nurse(){
//        return new Nurse();
//    }

    @Bean
    public ShoppingCart shoppingCart(){
        return new ShoppingCart();
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }

    @Bean
    public AuthenticationAspect authenticationAspect(){
        return new AuthenticationAspect();
    }

}
