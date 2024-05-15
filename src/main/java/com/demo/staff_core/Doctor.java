package com.demo.staff_core;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    public String qualification;

    public Nurse nurse;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("doctor is assisting");
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name Method");
    }

    @PostConstruct
    public void setPostConstructor() {
        System.out.println("Set Post Contructor Method");
    }
}
