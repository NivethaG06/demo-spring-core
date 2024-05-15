package com.demo.staff_core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employee")
public class EmployeeDAO implements DAO{
    @Override
    public String fetch() {
        return "";
    }
}
