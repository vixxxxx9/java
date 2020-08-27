package adapter.inheritance;

public class Owner {

    public static void main(String[] args) {
        DomesticAnimal dd = new DomesticDog();

        // もしもAdapterパターンを利用していなければ、Dogを吠えさせるためには、instructではなくcallを呼ばなければならない。
        dd.instruct();

    }
}
