package dev.lpa;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.print("swish ");
        }else {
            System.out.print("splash ");
        }

    }
}
