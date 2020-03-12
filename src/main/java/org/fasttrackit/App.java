package org.fasttrackit;
import java.time.LocalDate;
import java.util.*;
import java.text.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //LocalDate newDate1 = LocalDate.now().minusMonths(2);
        //LocalDate newDate2 = LocalDate.of(2010, 3, 10);

        System.out.println();

        Dog dog = new Dog();

        dog.name = "Oscar";
        dog.age = 2;
        dog.healthLevel = 8;     //from 1 to 10
        dog.hungerLevel = 3;     //from 1 to 10
        dog.hapinessLevel = 9;   //from 1 to 10
        dog.favouriteActivity = "playing with a ball";
        dog.favouriteFood = "Pedigree";

        System.out.println("Dog properties are the following: ");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Health: " + dog.healthLevel);
        System.out.println("Hunger: " + dog.hungerLevel);
        System.out.println("Hapiness: " + dog.hapinessLevel);
        System.out.println("Favourite activity: " + dog.favouriteActivity);
        System.out.println("Favourite food: " + dog.favouriteFood);

        System.out.println();

        Adopter adopter = new Adopter();
        adopter.name = "Iulia";
        adopter.money = 100;

        System.out.println("Adopter properties are the following: ");
        System.out.println("Name: " + adopter.name);
        System.out.println("Money: " + adopter.money);

        System.out.println();

        DogFood food = new DogFood();
        food.name = "Pedigree";
        food.price = 10;
        food.weight = 1000;     // 1 kg
        food.flavour = "beef";
        food.expirationDate = LocalDate.of(2020, 3, 20);
        food.stock = 3;

        System.out.println("Animal food properties are the following: ");
        System.out.println("Name: " + food.name);
        System.out.println("Price: " + food.price);
        System.out.println("Weight: " + food.weight + " g");
        System.out.println("Flavour: " + food.flavour);
        System.out.println("Expiration Date: " + food.expirationDate);
        System.out.println("Stock: " + food.stock);

        System.out.println();

        Activity activity1 = new Activity();
        activity1.name = "playing with a ball";

        Activity activity2 = new Activity();
        activity2.name = "petting";

        Activity activity3 = new Activity();
        activity3.name = "walking in the park";

        System.out.println("Available activities: " + activity1.name + ", " + activity2.name + ", " + activity3.name);

        System.out.println();

        Vet vet = new Vet();
        vet.name = "Alex Popa";
        vet.specialization = "Dermatology";

        System.out.println("Available Vets: ");
        System.out.println(vet.name + ", " + vet.specialization);

        System.out.println();

        Game game = new Game();
        game.dog = dog;
        game.adopter = adopter;
        game.vet = vet;

    }
}
