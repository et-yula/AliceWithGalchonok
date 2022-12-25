package Classes;

import Exceptions.HeroDeathException;
import Interfaces.*;

import java.util.ArrayList;

public abstract class Animal implements AbleToMove, BeSomewhere, AbleToMakeSound, AbleToHunt{
    protected String name;
    protected ArrayList <Animal>surroundingAnimals = new ArrayList<>();
    protected int weight;
    protected long length;
    protected String location;
    public static class BMI{
        public static final int BMI=20;
        public static int getWeight(long length) {
            return (int) Math.round(BMI*Math.pow(length,2));
        }
    }
    public boolean killAndEat(Animal animal){
        if (animal.length<this.length){
            this.weight=this.weight+animal.weight;
            System.out.println(this.toString()+" съела "+animal.toString()+ " и поправилась на "+animal.weight+" килограмм");
            animal=null;
            throw new HeroDeathException("Кое-кого съели.. ");
        } else {
            return false;}
    }

    public void eat(Object meal) {
        System.out.println(this.toString() + " съело" + meal.toString());
    }
    @Override
    public void makeSound() {
        System.out.println(this.toString() + " издает звук");
    }

    @Override
    public void beThere(String location) {
        this.location = location;
        System.out.println(this.toString() + " находился(-ась/-ось) в " + this.getLocation());
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public boolean ToBeTogether(BeSomewhere thing) {
        if (this.location.equals(thing.getLocation())) {
            return true;
        } else {
            return false;
        }
    }
    public void setSurroundingAnimals(Animal animal){
        surroundingAnimals.add(animal);
    }
    public Animal getSurroundingAnimal(int index){
        return this.surroundingAnimals.get(index);
    }

    @Override
    public String toString() {
        return (name);
    }

    @Override
    public void move() {
        System.out.println(this.toString() + " движется в " + this.location);
    }


}
