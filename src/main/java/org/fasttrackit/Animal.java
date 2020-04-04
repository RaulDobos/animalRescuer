package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int hapinessLevel;
    private String favouriteFood;
    private String favouriteActivity;
    private boolean clean;

    public Animal(){

    }

    public Animal(String passedNameParameter){
        name = passedNameParameter;
    }

    public String getType(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHapinessLevel() {
        return hapinessLevel;
    }

    public void setHapinessLevel(int hapinessLevel) {
        this.hapinessLevel = hapinessLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public void showHappiness(){
    }

    @Override
    public String toString() {
        return "\nAnimal properties are: \n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Health level: " + healthLevel + "\n" +
                "Hunger level: " + hungerLevel + "\n" +
                "Hapiness level: " + hapinessLevel + "\n" +
                "Favourite food: " + favouriteFood +  "\n" +
                "Favourite activity: " + favouriteActivity + "\n";
    }
}
