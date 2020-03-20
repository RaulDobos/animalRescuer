package org.fasttrackit;

public class Cat extends Animal {

    public Cat(String passedNameParameter) {
        super(passedNameParameter);
    }

    public void showHappiness(){
        System.out.println("Your cat is purring!");
    }
}
