package dev.lpa;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Main {

    private static ArrayList<ProductForSale> storeAddInformation = new ArrayList<>();
    public static void main(String[] args) {

        storeAddInformation.add(new Perfumes("florence", 1500, "Not bad with the smell"));
        storeAddInformation.add(new Perfumes("Jo marone", 5000, "The gorgeous smell with scent"));

        proudctList();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 0, 2);
        addItemOrder(order1, 1, 3);

        printOrder(order1);


    }

    public static void proudctList(){
        for(var item : storeAddInformation){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeAddInformation.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){

        double totalSale = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            totalSale += item.product().getSalesPrice(item.qty());
            System.out.printf("Sales Total = $%6.2f %n", totalSale);

        }
    }


}
