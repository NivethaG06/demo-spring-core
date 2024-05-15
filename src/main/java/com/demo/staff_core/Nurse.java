package com.demo.staff_core;


import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    public String qualification;

    @Override
    public void assist() {
        System.out.println("NURSE is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
