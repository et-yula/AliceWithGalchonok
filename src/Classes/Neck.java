package Classes;

import Enums.Adjective;
import Enums.Adverb;
import Enums.Conjunction;
import Interfaces.AbleToBend;

public class Neck implements AbleToBend {
    protected Person owner;
    protected long length;
    public Neck(Person owner, long length){
        this.owner=owner;
        this.length=length;
    }
    @Override
    public String toString(){
        return this.owner.toString().substring(0,this.owner.toString().length()-1)+"ина шея";
    }
    @Override
    public void toBend(){
        System.out.println(Adverb.LUCKILY + ", оказалось, что " + Adjective.NEW.toString() + " " + this.toString() + " " + Adverb.FABULOUS.toString() + " гнется в любом направлении");
    }
    @Override
    public void toBendZigzag(){
        System.out.println(Conjunction.HEREUPON.toString()+" "+this.owner+" "+ Adverb.SMOOTHLY+" и "+Adverb.GRACEFULLY.toString()+" изогнула свою шею зигзагом");
    }}
