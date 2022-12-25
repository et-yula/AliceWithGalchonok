package Classes;

import Enums.Adjective;

import java.lang.reflect.Field;

public class Apple {
    private String sort;

    public Apple(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return this.sort + " " + Adjective.SWEET + " яблоко";
    }

    public void createMagic(Person person) {
        class Magic {
            private Person person;
            private double chance;

            public Magic(Person person) {
                this.person = person;
            }

            public void setChance() {
                this.chance = Math.random();
            }

            public void checkStatus() {
                setChance();
                if (chance < 0.3) {
                    person.decrease();
                } else {
                    person.growNewNeck();
                }
            }
        }
        Magic magic = new Magic(person);
        magic.checkStatus();
    };
}

