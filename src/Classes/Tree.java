package Classes;

import Classes.Greenery;
import Interfaces.BeSomewhere;

public class Tree implements BeSomewhere {
    protected Greenery foliage;
    protected String sort;
    protected String location;
    public Tree(String sort){
        this.sort=sort;
    }
    @Override
    public boolean ToBeTogether(BeSomewhere thing){
        if (this.location.equals(thing.getLocation())){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public void beThere(String location){
        this.location=location;
        System.out.println(this.toString()+" находился(-ась/-ось) в "+this.getLocation());
    }
    @Override
    public String getLocation(){
        return this.location;
    }
    @Override
    public String toString(){
        return this.sort;
    }
    public void growFoliage(Greenery foliage){
        this.foliage=foliage;
    };
}
