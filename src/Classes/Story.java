package Classes;

import Classes.*;
import Enums.Adverb;

public class Story {
    Person alice = new Person("Алиса");
    Greenery herbs = new Greenery();
    Tree tree = new Tree("Кедр");
    AppleTree appleTree=new AppleTree("Дикая");
    Apple apple = new Apple("красное");
    Greenery foliage = new Greenery();
    Bird bird= new Bird("Синичка");
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
        alice.move();
        appleTree.growApple(apple);
        alice.eat(apple);
        apple.createMagic(alice);
        herbs.rustle();
        alice.getHands().raiseUp();
        tree.growFoliage(foliage);
        alice.imagine(foliage);
        bird.move();
        bird.makeSound();
        alice.reconsider();
        alice.speak();
    }

}
