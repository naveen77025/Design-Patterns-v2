package org.example.Creational.Singleton;

public class SingletonThreadSafteyEager {
    int count;
    static SingletonThreadSafteyEager instance=new SingletonThreadSafteyEager();
    private SingletonThreadSafteyEager(){}
    public static  SingletonThreadSafteyEager getInstance(){
        return instance;
    }
}
