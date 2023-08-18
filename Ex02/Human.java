package Ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ex01.Automat;
import Ex01.Product;

public class Human extends Actor{       // Принцип единственной ответственности, Принцип открытости/закрытости

    private int money;
    private Automat nearestAutomat;

    public Human(String name1, boolean make_order1, boolean take_order1, int money) {
        super(name1, make_order1, take_order1);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
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

    public Automat getNearAutomat() {
        return nearestAutomat;
    }

    @Override    
    public Order makeOrder(List<String> deList, Automat automat, Human man) {
        ArrayList <Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : deList) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct);
            if (shoppingProduct != null ){
                shoppingList.add(shoppingProduct);  
            } 
        }
        setIsMakeOrder(true);

        return nearestAutomat.createOrder(shoppingList, nearestAutomat, man);
    }

    @Override
    public List<String> validateOrder(List<String> deList) {
       /* Добавить проверку в Order (validateOrder()) до оформления заказа:
        если заказано некоторого товара больше, чем есть в автомате,
        удалить этот товар из заказа (желательно в одну проходку)*/
        Map<String,Integer> temp=new HashMap<String,Integer>();

        for (String prodName : deList) {
            if (temp.containsKey(prodName)){
                temp.put(prodName, temp.get(prodName)+1);
            } else {
                temp.put(prodName,1);
            }
        }

        Product currentProd;
        for (String nameProduct : temp.keySet()) {
            currentProd=nearestAutomat.getProduct(nameProduct);
            if (currentProd==null){
                deList.remove(nameProduct);
                continue;
            }
            if (temp.get(nameProduct)>currentProd.getQuantity()){
                deList.removeIf(n->n.equals(nameProduct));
            }
        }

        return deList;

    }

    
    
}
