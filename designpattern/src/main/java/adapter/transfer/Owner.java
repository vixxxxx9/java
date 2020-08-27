package adapter.transfer;

public class Owner {

    public static void main(String[] args) {
        DomesticAnimal staff = new BreedingStaff();

        // オーナーは、犬ではなく飼育員に指示する。
        staff.instruct();
    }
}
