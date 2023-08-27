package org.example;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
//        product1.name = "Product1";
//        product1.brand = "Brand1";
//        product1.price = 100;
        product1.setPrice(150);

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Product2", "Brand2", 200);
        System.out.println(product2.displayInfo());
        System.out.println(product2.getPrice());
        product2.setPrice(450);
        System.out.println(product2.getPrice());
        System.out.println(product2.displayInfo());


        Product product3 = new Product("Prod");
        System.out.println(product3.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Бутылка1","ООО Молоко",200,1.5,10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Водица", "", 250, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Водица", "", 300, 1.5);
        Product bottleOfWater3 = new BottleOfWater("Водица", "", 150, 0.5);

        Product chocolate1 = new Chocolate("Mars", "OOO",100, 100);
        Product chocolate2 = new Chocolate("Snickers", "OOO",150, 120);
        Product chocolate3 = new Chocolate("Bounty", "OOO AAA",130, 150);
        Product chocolate4 = new Chocolate("Alyonka", "Red October",200, 200);

        System.out.println(chocolate2.displayInfo());


        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);


        VendingMachine vendingMachine = new VendingMachine(products);
//        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Водица", 1.5);
//        if (bottleOfWater != null){
//            System.out.println("Вы получили:");
//            System.out.println(bottleOfWater.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки нет");
//        }
        Chocolate chocolate = vendingMachine.getChocolate("Alyonka", 200);
        if (chocolate != null) {
            System.out.println("Вы получили:");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такого шоколада нет");
        }
    }
}

