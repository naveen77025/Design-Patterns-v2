package org.example;

import org.example.Creational.AbstractFactory.AbstractFactory;
import org.example.Creational.AbstractFactory.Burger;
import org.example.Creational.AbstractFactory.KFCFactory;
import org.example.Creational.AbstractFactory.Pizaa;
import org.example.Creational.Builder.Student;
import org.example.Creational.FactoryMethod.FactoryMethod;
import org.example.Creational.FactoryMethod.NonVegRes;
import org.example.Creational.FactoryMethod.Product;
import org.example.Creational.FactoryMethod.VegRes;
import org.example.Creational.Prototype.StudentPrototype;
import org.example.Creational.Prototype.StudentRegistry;
import org.example.Creational.Singleton.Singleton;
import org.example.Creational.Singleton.SingletonThreadSaftey;
import org.example.Creational.Singleton.SingletonThreadSafteyEager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    //Singleton
        for(int i=0;i<40;i++){
            new Thread(() -> {
                Singleton s= Singleton.getInstance();
                System.out.println(s);
            }).start();
        }
        // Lazy
        for(int i=0;i<20;i++){
            new Thread(() -> {
                SingletonThreadSaftey s= SingletonThreadSaftey.getInstance();
                System.out.println(s);
            }).start();
        }
        //Eager
        for(int i=0;i<20;i++){
            new Thread(() -> {
                SingletonThreadSafteyEager s= SingletonThreadSafteyEager.getInstance();
                System.out.println(s);
            }).start();
        }
    //Builder
        Student s= new Student.Builder().setName("naveen").setId(1).setBatch("alpha").setPercentage(2.0).build();
        System.out.println(s);
    //prototype
        StudentPrototype studentPrototype= new StudentPrototype();
        studentPrototype.setBatch("alpha");
        studentPrototype.setPsp("60");
        StudentRegistry studentRegistry= new StudentRegistry();
        studentRegistry.register("alphaBatch",studentPrototype);
        StudentPrototype newStudent= studentRegistry.get("alphaBatch").clone();
        newStudent.setId(1);
        newStudent.setName("naveen");
        StudentPrototype newStudent1= studentRegistry.get("alphaBatch").clone();
        newStudent1.setId(2);
        newStudent1.setName("Kumar");
        System.out.println(newStudent1);
        System.out.println(newStudent);
    //FactoryMethod
        FactoryMethod factoryMethod=new VegRes();
        Product pulihora=factoryMethod.createProduct("pulihora");
        FactoryMethod paradise=new NonVegRes();
        Product biryani=paradise.createProduct("chicken");
        pulihora.cook();
        biryani.cook();
    //AbstractMethod
        AbstractFactory KFC=new KFCFactory();
        Pizaa naveensPizza=KFC.createPizza("veg","large","round");
        Burger naveensBurger=KFC.createBurger("veg","large",2);
        naveensPizza.cook();
        naveensBurger.cook();

    }
}