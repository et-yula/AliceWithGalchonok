package Classes;

import Enums.Adjective;
import Enums.Conjunction;

public class Bird extends Animal {
    public Bird(String name){
        this.name=name;
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
