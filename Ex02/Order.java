package Ex02;

import java.util.ArrayList;
import java.util.List;


import Ex01.Product;

public class Order<T extends Product> {

    private List <T> list;
    private int price;
    private Human man;

    public Order(List<T> productList, Human human, int price) {
    this.list = productList;
    this.man = human;
    this.price = price;
  }

   

    public List<T> getList() {
        return list;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMan() {
        return man.getName();
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
        return "Shopping list: " + getNameProductString() + "\n" + "Shoppong price: " + getPrice() + "\n" + "Buyer: " + getMan();
    }



   

    
}
