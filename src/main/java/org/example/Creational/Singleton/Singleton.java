package org.example.Creational.Singleton;

public class Singleton {
    int count;
    static Singleton instance;
    private Singleton(){}
    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
