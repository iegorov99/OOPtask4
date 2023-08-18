package Ex01;

import java.util.Comparator;

public class FoodComparator implements Comparator<Product> {    // Принцип единственной ответственности,
                                                                // Принцип Разделения интерфейса
    @Override
    public int compare(Product o1, Product o2) {
    if (((Food) o1).getWeight() > ((Food) o2).getWeight()) {
      return 1;
    } else if (((Food) o1).getWeight() < ((Food) o2).getWeight()) {
      return -1;
    } else
      return 0;
  }
}
