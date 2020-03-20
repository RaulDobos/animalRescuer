package org.fasttrackit;

public class Dog extends Animal {

    public Dog(String passedNameParameter) {
        super(passedNameParameter);
    }

    public void showHappiness(){
        System.out.println("Your dog is wiggling his tail!");
    }
}
