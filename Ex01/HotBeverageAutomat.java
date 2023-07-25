package Ex01;

public class HotBeverageAutomat extends Automat {

    public Product getProduct(String name, double volume, int temerature) {
        for (Product product : listProduct) {
            if (product instanceof HotBeverage)
                if (((HotBeverage) product).getName().equals(name) && ((HotBeverage) product).getVolume() == volume && ((HotBeverage) product).getTemerature() == temerature) {
                    return product;
                }
        }
        return null;
    }
}