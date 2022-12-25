package Classes;

import Enums.Adjective;
import Enums.Adverb;
import Exceptions.InabilityToRaiseUpHandsException;

public class Story {
    Person alice = new Person("Алиса");
    Greenery herbs = new Greenery(){
        @Override
        public void rustle(){
            System.out.println(Adjective.LIGHT.toString()+" трепет прошел по зелени");
        }
    };
    Tree tree = new Tree("Кедр");
    AppleTree appleTree=new AppleTree("Дикая");
    Apple apple = new Apple("красное");
    Greenery foliage = new Greenery();
    Bird bird= new Bird("Голубка");
    public Story(){
    }
    public void go(){
        this.defaultStory();
    }
    private void defaultStory(){
        alice.beThere("волшебный лес Белоснежки");
        tree.beThere(alice.getLocation());
        appleTree.beThere(alice.getLocation());
        bird.beThere(alice.getLocation());
        alice.setSurroundingAnimals(bird);
        bird.setSurroundingAnimals(alice);
        alice.move();
        bird.move();
        appleTree.growApple(apple);
        alice.eat(apple);
        apple.createMagic(alice);
        herbs.rustle();
        try{
            alice.getHands().raiseUp();
        } catch (InabilityToRaiseUpHandsException | NullPointerException e) {
            System.out.println("Ну что ж, если поднять руки к голове было "+ Adverb.IMPOSSIBLE.toString()+" можно попробовать наклонить к ним голову");
            alice.toBend(alice.getNeck());
            alice.toBendZigzag(alice.getNeck());
        }
        tree.growFoliage(foliage);
        alice.imagine(foliage);
        bird.makeSound();
        alice.reconsider();
        bird.attack(alice);
        alice.speak();
    }

}
