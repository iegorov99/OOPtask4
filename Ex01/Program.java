package Ex01;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Ex02.Human;

public class Program {
    public static void main(String[] args) {
        
        Product product1 = new Food("Twix", 45, 100, new GregorianCalendar(2023, 9, 13, 0 , 0), 0.15);
        Product product2 = new Beverage("Cola", 125, 75, new GregorianCalendar(2025, 10, 13, 0, 0), 1.5);
        Product product3 = new Food("Cheetos", 75, 60, new GregorianCalendar(2026, 11, 6, 0, 0), 0.35);
        Product product4 = new Food("Mars", 55, 60, new GregorianCalendar(2026, 11, 6, 0, 0), 0.25);
        Product product5 = new Food("PompStix", 85, 60, new GregorianCalendar(2026, 11, 6, 0, 0), 0.45);
        Product product6 = new Food("HrusTeam", 35, 60, new GregorianCalendar(2026, 11, 6, 0, 0), 0.3);
        Product product7 = new Beverage("Pepsi", 155, 75, new GregorianCalendar(2025, 10, 13, 0, 0), 2.0);
        Product product8 = new Beverage("Esentuki", 705, 75, new GregorianCalendar(2025, 10, 13, 0, 0), 0.5);
        Product product9 = new Beverage("Flesh", 50, 75, new GregorianCalendar(2025, 10, 13, 0, 0), 0.45);
        

        Automat list = new Automat();

        List<Product> myList = new ArrayList<>();

        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);
        myList.add(product6);
        myList.add(product7);
        myList.add(product8);
        myList.add(product9);

        list.initProducts(myList);

        // String name = "Twix";

        // System.out.println(list.getProduct(name).toString());

        HotBeverage product10 = new HotBeverage("Latte", 90, 50, new GregorianCalendar(2023, 3, 19, 0, 0), 
        0.25, 32);
        HotBeverage product11 = new HotBeverage("Latte1", 160, 59, new GregorianCalendar(2023, 6, 17, 0, 0), 
        0.75, 33);
        HotBeverage product12 = new HotBeverage("Latte2", 130, 53, new GregorianCalendar(2023, 7, 16, 0, 0), 
        0.45, 34);
        HotBeverage product13 = new HotBeverage("Latte3", 100, 54, new GregorianCalendar(2023, 8, 15, 0, 0), 
        0.35, 42);
        HotBeverage product14 = new HotBeverage("Latte4", 170, 56, new GregorianCalendar(2023, 9, 14, 0, 0), 
        0.85, 43);
        HotBeverage product15 = new HotBeverage("Latte5", 140, 55, new GregorianCalendar(2023, 10, 13, 0, 0), 
        0.55, 44);
        
        HotBeverageAutomat list2 = new HotBeverageAutomat();

        

        myList.add(product10);
        myList.add(product11);
        myList.add(product12);
        myList.add(product13);
        myList.add(product14);
        myList.add(product15);

        list2.initProducts(myList);

        // String name1 = "Latte2";
        // double weight = 0.45;
        // int temerature = 34;

        // System.out.println(list2.getProduct(name1, weight, temerature).toString());


        Human man1 = new Human("Artur", false, false, 1023, list2);

        ArrayList<String> list3 = new ArrayList<>();

        for (Product product : myList) {
            list3.add(product.getName());
        }


        man1.makeOrder(list3);

        

        
    }
}
