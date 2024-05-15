package com.demo.staff_core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("user")
public class UserDAO implements DAO{
    @Override
    public String fetch() {
        return "";
    }
}
