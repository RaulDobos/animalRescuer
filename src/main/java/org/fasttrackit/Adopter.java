package org.fasttrackit;
import java.text.*;

public class Adopter {

   private String name;
   private int money;

    public Adopter(String passedNameParameter, int passedMoneyParameter){
        name = passedNameParameter;
        money = passedMoneyParameter;
    }

    public void feed(Animal animal, AnimalFood food){

        boolean ok = false;

        if(animal.getHungerLevel() == 1){
            animal.setHungerLevel(0);
        }
        else if(animal.getHungerLevel() > 1){
            animal.setHungerLevel(animal.getHungerLevel() - 2);
        }

        if(animal.getFavouriteFood().equals(food.getName())){
            if(animal.getHapinessLevel() < 10){          // 10 should be the max hapiness level
                animal.setHapinessLevel(animal.getHapinessLevel() + 1);
                ok = true;
            }
        }

        System.out.println(this.name + " just gave some " + food.getName() + " to " + animal.getName() + ".");
        System.out.println("Hunger level: " + animal.getHungerLevel());

        if(ok){
            System.out.println("Happiness level: " + animal.getHapinessLevel() + "\n");
        }

    }

    public void doActivity(Animal animal, Activity activity){

        if(animal.getFavouriteActivity().equals(activity.getName())){
            if(animal.getHapinessLevel() < 9){                   //10 should be the max happiness level
                animal.setHapinessLevel(animal.getHapinessLevel() + 2);
            }
            else{
                animal.setHapinessLevel(10);
            }
        }
        else{
            if(animal.getHapinessLevel() < 10){
                animal.setHapinessLevel(animal.getHapinessLevel() + 1);
            }
        }

        System.out.println(this.name + " and " + animal.getName() + " did " + "\"" + activity.getName() + "\"" + " activity together.");
        System.out.println("Happiness level: " + animal.getHapinessLevel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
