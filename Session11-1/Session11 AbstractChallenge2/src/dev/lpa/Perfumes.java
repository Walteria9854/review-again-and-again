package dev.lpa;

public class Perfumes extends ProductForSale{


    public Perfumes(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This Brand" + type + " is awesome");
        System.out.println("The Original price is " + price);
        System.out.println(description);

    }
}
