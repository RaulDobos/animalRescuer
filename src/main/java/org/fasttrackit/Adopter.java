package org.fasttrackit;

public class Adopter {

    String name;
    int money;

    public Adopter(String passedNameParameter, int passedMoneyParameter){
        name = passedNameParameter;
        money = passedMoneyParameter;

        System.out.println("(constructor called)");
    }
}
