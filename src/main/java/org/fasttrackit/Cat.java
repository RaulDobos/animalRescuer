package org.fasttrackit;

public class Cat extends Animal {

    public Cat(){

    }

    public Cat(String passedNameParameter) {
        super(passedNameParameter);
    }

    public String getType(){
        return "cat";
    }

    public void showHappiness(){
        System.out.println("Your cat is happy and is purring!");
    }
}
