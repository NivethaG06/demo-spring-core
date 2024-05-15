package com.demo.staff_core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Repository;

@Repository // respository annotation is used in db layer
public class DBAccessLayerDAO {

    public void dbFetchData(){
        System.out.println("Fetched data from db...");
    }
}
