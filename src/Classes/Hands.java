package Classes;

import Enums.Adjective;
import Enums.Adverb;

public class Hands {
    public Hands(Person owner){
        this.owner=owner;
    }
    protected Person owner;
    private static final boolean POSSIBILITY=false;
    public void raiseUp(){
        if(POSSIBILITY){
            System.out.println("Ну где же ручки, где же ваши ручки?.. "+this.owner.toString()+" "+ Adverb.SMOOTHLY.toString()+" поднял(-а/о) руки вверх.");
        } else{
            System.out.println("Ну что ж, если поднять руки к голове было "+ Adverb.IMPOSSIBLE.toString()+" можно попробовать наклонить к ним голову");
            owner.toBend(owner.getNeck());
            owner.toBendZigzag(owner.getNeck());
        }
    };
}
