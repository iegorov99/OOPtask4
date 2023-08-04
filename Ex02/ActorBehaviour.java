package Ex02;



import java.util.List;

import Ex01.Automat;


public interface ActorBehaviour {
    void setIsMakeOrder(boolean b);
    void setIsTakeOrder(boolean d);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Order makeOrder(List<String> list, Automat automat, Human man);
    List<String> validateOrder(List<String> deList);
}
