package com.demo.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticationPointcut(){
    }

    @Pointcut("within(demo..*)")
    public void authorizationPointcut(){
    }


    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

    @Pointcut("execution(* com.demo.aop.ShoppingCart.quantity(..))")
    public void afterReturningPointcut(){
    }

    @AfterReturning(pointcut = "afterReturningPointcut()" ,returning = "returnValue")
    public void afterReturning(String returnValue){
        System.out.println("After Returning :"+ returnValue);
    }
}
