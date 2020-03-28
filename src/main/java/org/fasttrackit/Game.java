package org.fasttrackit;

import java.util.*;

public class Game {

    private Adopter adopter;
    private Animal dog;
    private Vet vet;
    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>();
    private Activity[] availableActivities = new Activity[3];



    public void start(){
        initFood();
        initActivities();
        printAvailableFood();
        printAvailableActivities();
    }

    private void initFood(){

        AnimalFood food1 = new AnimalFood("Pedigree");
        availableFood.add(food1);

        AnimalFood food2 = new AnimalFood("Chappie");
        availableFood.add(food2);

        AnimalFood food3 = new AnimalFood("Dog Chow");
        availableFood.add(food3);
    }

    private void printAvailableFood(){
        System.out.println("The available food brands for your pet are the following:");

        int index = 0;
        for(AnimalFood food : availableFood){
            if(food != null){
                System.out.println((index + 1) + ". " + food.getName());
                index++;
            }
        }
    }

    private void initActivities(){
        availableActivities[0] = new Activity("running");

        availableActivities[1] = new Activity("petting");

        availableActivities[2] = new Activity("walking");
    }

    private void printAvailableActivities(){
        System.out.println("The available activities for your pet are the following: ");

        for(int index = 0; index < availableActivities.length; index++){
            if(availableActivities[index] != null){
                System.out.println((index + 1) + ". " + availableActivities[index].getName());
            }
        }
    }



    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
