package Ex01;

import java.util.Calendar;

public class HotBeverage extends Beverage {     // Принцип единственной ответственности, Принцип открытости/закрытости
    private int temerature;

    public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, int temerature){
        super(name,price,quantity,bestBefore,volume);
        this.temerature = temerature;
    }


    public int getTemperature() {
        return temerature;
    }

    public void setTemperature(int temerature) {
        this.temerature = temerature;
    }

    @Override
    public String toString(){
        return "Product [name= " + getName() + ", price= " + getPrice() + ", quantity= " + getQuantity() + ", bestBefore= " 
        + getBestBefore().get(Calendar.YEAR) + "/" + getBestBefore().get(Calendar.MONTH) + "/" + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", volume= " + getVolume() + 
        ", temperature= " + temerature + "]" + "\n";
    }

    
    // public int compareTo(HotBeverage o) {
    //     int result;
    //     result = (this.getTemerature()- o.getTemerature());
    //     return result;
    // }

}
