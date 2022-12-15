package Classes;

import Enums.Adjective;
import Enums.Adverb;
import Enums.Conjunction;
import Interfaces.*;

public abstract class Animal implements AbleToMove, BeSomewhere, AbleToMakeSound, AbleToEat {
    protected String name;
    protected String location;

    @Override
    public void eat(Object meal){
        System.out.println(this.toString()+" съело "+meal.toString());
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

    @Override
    public String toString() {
        return (name);
    }

    @Override
    public void move() {
        System.out.println(this.toString() + " движется в " + this.location);
    }


}
