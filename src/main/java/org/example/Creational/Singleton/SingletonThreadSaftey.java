package org.example.Creational.Singleton;

public class SingletonThreadSaftey {
    int count;
    static SingletonThreadSaftey instance;
    private SingletonThreadSaftey(){}
    public static synchronized SingletonThreadSaftey getInstance(){
        if(instance==null){
            instance=new SingletonThreadSaftey();
        }
        return instance;
    }
}
