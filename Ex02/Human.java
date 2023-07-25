package Ex02;

import java.util.ArrayList;
import java.util.List;

import Ex01.Automat;
import Ex01.Product;

public class Human extends Actor{

    private double money;
    private Automat nearestAutomat;

    public Human(String name1, boolean make_order1, boolean take_order1, double money, Automat nearesAutomat) {
        super(name1, make_order1, take_order1);
        this.money = money;
        this.nearestAutomat = nearesAutomat;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    
    @Override
    public void setIsTakeOrder( boolean b) {
        this.TakeOrder = b;
    }

    @Override
    public void setIsMakeOrder(boolean d) {
        this.MakeOrder = d;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }


    public void findNearestAutomat(Automat automat) {
        this.nearestAutomat = automat;
    }

    @Override    
    public ArrayList<Order> makeOrder(List<String> deList) {
        ArrayList <Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : deList) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct);
            if (shoppingProduct != null ){
                shoppingList.add(shoppingProduct);  
            } 
        }
        setIsMakeOrder(true);

        return nearestAutomat.createOrder(shoppingList);
    }
    
}
