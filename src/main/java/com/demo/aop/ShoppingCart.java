package com.demo.aop;

public class ShoppingCart {

    public void checkout(String status){
        System.out.println("Checkout Happened.");
    }

    public int quantity(){
        return 2;
    }
}
