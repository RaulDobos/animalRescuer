package org.fasttrackit;

public class Animal {

    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int hapinessLevel;
    String favouriteFood;
    String favouriteActivity;
    boolean clean;

    public Animal(String passedNameParameter){
        name = passedNameParameter;
        System.out.println("(Constructor called)");
    }

}
