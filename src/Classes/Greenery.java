package Classes;

import Enums.Adjective;
import Interfaces.AbleToRustle;
import Interfaces.LooksLike;

public class Greenery implements LooksLike,AbleToRustle {
    @Override
    public String toString(){
        return "зелень";
    }
    @Override
    public String looksLike(){
        return "зеленое море";
    }
    @Override
    public void rustle(){
        System.out.println("Зелень колыхалась");
    }

}
