package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.demo.aop.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp){
        String value = jp.getArgs()[0].toString();
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void afterlogger(){
        System.out.println("After Loggers");
    }
}
