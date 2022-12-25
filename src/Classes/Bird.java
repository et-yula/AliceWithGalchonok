package Classes;

import Enums.Adjective;
import Enums.Conjunction;
import Exceptions.HeroDeathException;

public class Bird extends Animal{

    public Bird(String name){
        this.name=name;
        this.length=Math.round(Math.random()*100);
        this.weight=Animal.BMI.getWeight(this.length);
    }
    @Override
    public boolean killAndEat(Animal animal){
        if (animal.length<this.length){
            this.weight=this.weight+animal.weight;
            System.out.println(this.toString()+" съела "+animal.toString()+ " и поправилась на "+animal.weight+" килограмм");
            animal=null;
            throw new HeroDeathException("Кое-кого съели.. "+Conjunction.THEREFORE+" сказке конец, а кто слушал - молодец");
        } else {
            return false;
        }
    }
    public void attack(Animal animal){
        System.out.println("На "+animal.toString().substring(0,animal.toString().length()-1)+"у"+Adjective.FURIOUSLY+" налетела "+Adjective.BIG+" "+this.toString()+" стараясь ударить ее крылом прямо в лицо");
    }

    @Override
    public void move(){
        System.out.println(this.toString()+" летала в "+this.location);
    }
    @Override
    public void makeSound(){
        System.out.println(Conjunction.THEN.toString()+" "+this.toString()+" издала "+ Adjective.LOUD.toString()+" и "+Adjective.WHISTLING.toString()+" звук");
    }
}
