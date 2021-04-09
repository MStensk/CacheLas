package com.example.demo;

import java.util.HashMap;
public class cache {
    user User = new user("3");
    private static HashMap<String, user> hashMap = new HashMap<String, user>();

    public void set(String key, user value) {
        hashMap.put(key,value);
    }
    public void get(String User) {
        hashMap.get(User);
        System.out.println(hashMap.get(User));
    }

    public boolean has(String User){
        if(hashMap.containsKey(User)){
            return true;
        }
        else return false;
    }

    public void delete(String User){
        hashMap.remove(User);
    }

}
