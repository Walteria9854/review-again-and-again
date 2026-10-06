package dev.lpa;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Main {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Funiture("Desk", 3000, "Made it by wood"));

        storeProducts.add(new Funiture("Lamp", 6000, "lighter then I expected"));


        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 1, 2);
        addItemOrder(order1, 0, 1);
        printOrder(order1);


        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemOrder(order2, 3, 5);
        addItemOrder(order2, 0, 1);
        addItemOrder(order2, 2, 5);
        printOrder(order2);
    }

    public static void listProducts(){

        for(var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){

        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}
