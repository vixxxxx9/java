package strategy;

import strategy.context.Animal;
import strategy.strategy.CatsCall;
import strategy.strategy.DogsCall;
import strategy.strategy.PigsCall;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        Animal dog = new Animal("Dog", new DogsCall());
        Animal cat = new Animal("Cat", new CatsCall());
        Animal pig = new Animal("Pig", new PigsCall());

        m.animalsCall(dog);
        m.animalsCall(cat);
        m.animalsCall(pig);
    }

    private void animalsCall(Animal animal) {
        System.out.println(MessageFormat.format("{0} < {1}", animal.call()));
    }
}
