package com.demo.staff_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service // service annotation reprent the businss logic
@Lazy // lazy initialization
@DependsOn("dBAccessLayer")
public class ServiceLayer {

    @Autowired
    DBAccessLayerDAO accessLayerDAO;

    @Autowired //using interface use qualifier
    @Qualifier("employee")
    UserDAO userdao;
    //Three type of autowiring dependencies:
    // 1. normal
    //2. constructor
    //3. setter method

    @Autowired
    public ServiceLayer(DBAccessLayerDAO accessLayerDAO) {
        this.accessLayerDAO = accessLayerDAO;
    }

    public void serviceCallData(){
        System.out.println("send request from service to db...");
    }

    public DBAccessLayerDAO getAccessLayerDAO() {
        return accessLayerDAO;
    }

    @Autowired
    public void setAccessLayerDAO(DBAccessLayerDAO accessLayerDAO) {
        this.accessLayerDAO = accessLayerDAO;
    }
}
