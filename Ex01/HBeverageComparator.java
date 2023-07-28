package Ex01;

import java.util.Comparator;

public class HBeverageComparator implements Comparator<HotBeverage> {
    public int compare(HotBeverage o1, HotBeverage o2) {
       int resultOfComparing = o1.compareTo(o2);
       return resultOfComparing;
   }
}
