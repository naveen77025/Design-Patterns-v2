package org.example.Creational.Prototype;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,StudentPrototype> registry= new HashMap<>();
    public void register(String key,StudentPrototype value){
        registry.put(key,value);
    }
    public StudentPrototype get(String key){
        return registry.get(key);
    }
}
