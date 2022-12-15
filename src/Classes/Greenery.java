package Classes;

import Enums.Adjective;
import Interfaces.AbleToRustle;
import Interfaces.LooksLike;

public class Greenery implements AbleToRustle, LooksLike {
    @Override
    public void rustle(){
        System.out.println(Adjective.LIGHT.toString()+" трепет прошел по зелени");
    }
    public String looksLike(){
        return "зеленое море";
    }
}
