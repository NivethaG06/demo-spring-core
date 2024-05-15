package com.demo.staff_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        // If we dont have xml file -> using annotation bean config -> all component will be converted to
        // camel case eg. UserService class will be converted to userService
        // early loading(default) vs lazy loading - @Lazy
        // @DependsOn annotation is used to give control of initialization - class b can be initialized before class a
        Doctor doctor = (Doctor) ctx.getBean("doctor");
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor.getQualification());

        Doctor doctor1 = (Doctor) ctx.getBean("doctor");
        doctor1.assist();
        System.out.println(doctor1.getQualification());

        System.out.println(doctor.getNurse());
        Nurse nurse = ctx.getBean(Nurse.class);
        nurse.assist();
    }
}
