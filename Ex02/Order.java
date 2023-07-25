package Ex02;

import java.util.ArrayList;
import java.util.List;

import Ex01.Product;

public class Order {

    private List <Product> list;
    private int price;
    private String manName;
    private int quantity;

    public Order(List<Product> list, int price, String manName, int quantity) {
        
        this.list = list;
        for (Product product : list) {
            this.price += product.getPrice();
        }
        this.manName = manName;
        this.quantity = quantity;
    }

   

    public List<Product> getList() {
        return list;
    }

    public int getPrice() {
        return price;
    }

    public String getMan() {
        return manName;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
    public List<String> getNameProductString(){
        List<String> products = new ArrayList<>();
        for (Product product : list) {
            products.add(product.getName());
        }
        return products;
    }
    

    @Override
    public String toString(){
        return "Shopping list: " + getNameProductString() + "\n" + "Shoppong price: " + price + "\n" + "Buyer: " + manName;
    }



   

    
}
