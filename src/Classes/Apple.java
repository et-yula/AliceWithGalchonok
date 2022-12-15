package Classes;

import Enums.Adjective;

public class Apple{
    private String sort;
    public Apple(String sort){
        this.sort=sort;
    }
    @Override
    public String toString(){
        return this.sort+" "+ Adjective.SWEET+" яблоко";
    }
    public void createMagic(Person person){
        person.growNewNeck();
    }
}
