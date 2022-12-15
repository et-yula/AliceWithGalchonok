package Classes;

import Enums.Adjective;
import Enums.Adverb;
import Enums.Conjunction;
import Interfaces.AbleToBend;
import Interfaces.LooksLike;
import Interfaces.Reasonable;

public class Person extends Animal implements Reasonable{
    private Neck neck;
    private Hands hands;
    public Person(String name) {
        this.name = name;
        this.neck = new Neck(this,11);
        this.hands=new Hands(this);
    }
    public Hands getHands(){
        return this.hands;
    }
    public Neck getNeck(){
        return this.neck;
    }
    @Override
    public void eat(Object meal){
        System.out.println("Диеты не работают, поэтому "+this.toString()+" решила съесть "+meal.toString());
    }
    @Override
    public void move() {
        System.out.println(this.toString() + " прогуливалась в " + this.location);
    }
    @Override
    public void realize(){
        System.out.println(Conjunction.BUT+" "+this.toString()+" уже поняла, что это просто листва на верхушках деревьев, под которыми она только что гуляла");
    }
    @Override
    public void imagine(LooksLike something){
        System.out.println(Conjunction.AFTER.toString()+" "+this.toString()+" собиралась нырнуть в "+something.looksLike());
        this.realize();
    }
    @Override
    public void speak(){
        System.out.println(Conjunction.AFTER_ALL.toString()+" "+this.toString()+" молвила - я "+ Adverb.ABSOLUTELY.toString()+" выживу..");
    }
    @Override
    public void reconsider() {
        System.out.println(Conjunction.THEREFORE.toString() + " " + this.toString() + " передумала и решила отпрянуть");
    }
    @Override
    public int hashCode(){
        return 0;
    }
    @Override
    public boolean equals(Object obj){
        return this.toString().equals(obj.toString());
    }

    public void growNewNeck() {
        this.neck.length = Math.round(this.neck.length * (Math.random() * 10));
        System.out.println(Adverb.SUDDENLY+" "+this.neck.toString()+" выросла в несколько раз, значит чудеса случаются не только под Новый год..");
        System.out.print(Conjunction.SO_NOW.toString()+" для "+this.toString().substring(0,this.toString().length()-1)+"ы"+" где-то там, далеко внизу, ");
    }
    public void toBend(AbleToBend thing) {
        if (thing == this.getNeck()) {
            thing.toBend();
        }
    }
    public void toBendZigzag(AbleToBend thing){
        if (thing==this.getNeck()){thing.toBendZigzag();}
    }
}

