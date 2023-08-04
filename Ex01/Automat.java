package Ex01;

import java.util.ArrayList;

import java.util.List;


import Ex02.Human;
import Ex02.Order;

public class Automat {
    
    protected List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(List<Product> list, String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getListProduct() {
      return listProduct;
    }

    public Order createOrder(List<Product> listHuman, Automat automat, Human human) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    int sum = 0;
    for (Product product : listHuman) {
      shoppingProduct = automat.getProduct(product.getName());
      if (product.equals(shoppingProduct) && automat.getProduct(product.getName()).getQuantity() > 0) {
        shoppingList.add(shoppingProduct);
        sum += automat.getProduct(product.getName()).getPrice();
        (automat.getProduct(product.getName())).setQuantity((automat.getProduct(product.getName())).getQuantity() - 1);
      } else if (product.equals(shoppingProduct) && automat.getProduct(product.getName()).getQuantity() == 0) {
        System.out.println(product.getName() + " нет в наличии");
      }
    }
    human.setIsTakeOrder(true);
    Order order = new Order(shoppingList, human, sum);
    human.setMoney(human.getMoney() - sum);
    return order;
  }
}
