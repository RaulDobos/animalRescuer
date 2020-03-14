package org.fasttrackit;

public class Vet {

    String name;
    String specialization;

    //additional properties
    boolean[] availability; // from 1 to 7, the Game should update this array every week

    public Vet(String passedNameParameter){
        name = passedNameParameter;

        System.out.println("(constructor called)");
    }
}
