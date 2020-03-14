package org.fasttrackit;
import java.time.LocalDate;

public class AnimalFood {

    String name;
    int price;
    int weight;
    LocalDate expirationDate;
    int stock;
    String flavour;

    public AnimalFood(String passedNameParameter, int passedPriceParameter){
        name = passedNameParameter;
        price = passedPriceParameter;

        System.out.println("(constructor called)");
    }

}
