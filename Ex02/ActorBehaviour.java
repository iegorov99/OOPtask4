package Ex02;


import java.util.ArrayList;
import java.util.List;


public interface ActorBehaviour {
    void setIsMakeOrder(boolean b);
    void setIsTakeOrder(boolean d);
    boolean isMakeOrder();
    boolean isTakeOrder();
    ArrayList<Order> makeOrder(List<String> list);
}
