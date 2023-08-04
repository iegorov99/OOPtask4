package Ex01;

import java.util.Comparator;

public class BeverageComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
    if (((Beverage) o1).getVolume() > ((Beverage) o2).getVolume()) {
      return 1;
    } else if (((Beverage) o1).getVolume() < ((Beverage) o2).getVolume()) {
      return -1;
    } else
      return 0;
  }
}
