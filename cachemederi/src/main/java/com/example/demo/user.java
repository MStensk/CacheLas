package com.example.demo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class user {

    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public user(String id){
        this.id = id;
    }

    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
