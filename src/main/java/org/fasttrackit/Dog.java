package org.fasttrackit;

public class Dog extends Animal {

    public Dog(){
        super();

    }

    public Dog(String passedNameParameter) {
        super(passedNameParameter);
    }

    @Override
    public String getType() {
        return "dog";
    }

    public void showHappiness(){
        System.out.println("Your dog is happy and is wiggling his tail!");
    }
}
