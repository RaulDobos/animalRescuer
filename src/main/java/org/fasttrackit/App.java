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

        System.out.println();

        System.out.println("Give a name to your dog:");

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("You entered the name " + name);

        Dog dog = new Dog(name);

        dog.age = 2;
        dog.healthLevel = 8;     //from 1 to 10
        dog.hungerLevel = 3;     //from 1 to 10
        dog.hapinessLevel = 5;   //from 1 to 10
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

        System.out.println("Give the adopter a name: ");

        name = scanner1.nextLine();

        System.out.println("and a cash amount:");

        int money = scanner1.nextInt();

        Adopter adopter = new Adopter(name, money);

        System.out.println("Adopter properties are the following: ");
        System.out.println("Name: " + adopter.name);
        System.out.println("Money: " + adopter.money);

        System.out.println();

        name = "Pedigree";
        int price = 10;

        DogFood food = new DogFood(name, price);

        food.weight = 1000;     // 1 kg
        food.flavour = "beef";
        food.expirationDate = LocalDate.of(2020, 3, 20);
        food.stock = 3;

        System.out.println();
        System.out.println("Animal food properties are the following: ");
        System.out.println("Name: " + food.name);
        System.out.println("Price: " + food.price);
        System.out.println("Weight: " + food.weight + " g");
        System.out.println("Flavour: " + food.flavour);
        System.out.println("Expiration Date: " + food.expirationDate);
        System.out.println("Stock: " + food.stock);

        System.out.println();

        Activity playing = new Activity();
        playing.name = "playing with a ball";
        playing.grantedHapiness = 4;

        Activity petting = new Activity();
        petting.name = "petting";
        petting.grantedHapiness = 2;

        Activity walking = new Activity();
        walking.name = "walking in the park";
        walking.grantedHapiness = 3;

        System.out.println("Available activities: " + playing.name + ", " + petting.name + ", " + walking.name);

        System.out.println();

        name = "Alex Popa";

        Vet vet = new Vet(name);
        vet.specialization = "Dermatology";

        System.out.println();
        System.out.println("Available Vets: ");
        System.out.println(vet.name + ", " + vet.specialization);

        System.out.println();

        String weather = "rainy";
        int temperature = 20;

        Environment environment = new Environment(weather, temperature);

        System.out.println();
        System.out.println("Environment properties are the following: " + temperature + "°C, " + weather);
        System.out.println();

        Game game = new Game();
        game.dog = dog;
        game.adopter = adopter;
        game.vet = vet;

        adopter.feed(dog, food);

        adopter.doActivity(dog, playing);

    }
}
