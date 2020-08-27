package adapter.inheritance;

public class DomesticDog extends Dog implements DomesticAnimal {
    @Override
    public void instruct() {
        this.call();
    }
}
