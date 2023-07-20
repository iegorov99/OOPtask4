import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        Product product1 = new Food("Twix", 45, 100, new GregorianCalendar(2023, 9, 13, 0 , 0), 0.15);
        Product product2 = new Beverage("Cola", 125, 75, new GregorianCalendar(2025, 10, 13, 0, 0), 1.5);
        Product product3 = new Food("Cheetos", 75, 60, new GregorianCalendar(2026, 11, 6, 0, 0), 0.35);

        Automat list = new Automat();

        List<Product> myList = new ArrayList<>();

        myList.add(product1);
        myList.add(product2);
        myList.add(product3);

        list.initProducts(myList);

        String name = "Twix";

        System.out.println(list.getProduct(name).toString());

        HotBeverage product4 = new HotBeverage("Latte", 90, 50, new GregorianCalendar(2023, 3, 19, 0, 0), 
        0.25, 32);
        HotBeverage product5 = new HotBeverage("Latte1", 160, 59, new GregorianCalendar(2023, 6, 17, 0, 0), 
        0.75, 33);
        HotBeverage product6 = new HotBeverage("Latte2", 130, 53, new GregorianCalendar(2023, 7, 16, 0, 0), 
        0.45, 34);
        HotBeverage product7 = new HotBeverage("Latte3", 100, 54, new GregorianCalendar(2023, 8, 15, 0, 0), 
        0.35, 42);
        HotBeverage product8 = new HotBeverage("Latte4", 170, 56, new GregorianCalendar(2023, 9, 14, 0, 0), 
        0.85, 43);
        HotBeverage product9 = new HotBeverage("Latte5", 140, 55, new GregorianCalendar(2023, 10, 13, 0, 0), 
        0.55, 44);
        
        HotBeverageAutomat list2 = new HotBeverageAutomat();

        List<HotBeverage> myList2 = new ArrayList<>();

        myList2.add(product4);
        myList2.add(product5);
        myList2.add(product6);
        myList2.add(product7);
        myList2.add(product8);
        myList2.add(product9);

        list2.initHotBeverage(myList2);

        String name1 = "Latte2";
        double weight = 0.45;
        int temerature = 34;

        System.out.println(list2.getProduct(name1, weight, temerature).toString());
        
    }
}
