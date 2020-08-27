package strategy.context;

import strategy.strategy.AnimalsCall;

public class Animal {

    private String name;
    private AnimalsCall animalscall;

    private Animal() {

    }

    public Animal(String name, AnimalsCall animalscall) {
        this.name = name;
        this.animalscall = animalscall;

    }
    public String call() {
        return animalscall.call();
    }
}
