package adapter.transfer;

public class BreedingStaff implements DomesticAnimal {

    private Dog dog;

    public BreedingStaff() {
        this.dog = new Dog();
    }

    /**
     * オーナーは、飼育員に指示を出し、指示を受けて飼育員は犬に指示を出す。
     * つまり、犬への指示を飼育員に移譲する。
     */
    @Override
    public void instruct() {
        this.dog.call();
    }
}
