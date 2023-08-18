package Ex02;

public abstract class Actor implements ActorBehaviour {     // Принцип единственной ответственности, Принцип
                                                            // открытости/закрытости
    protected String name;
    protected boolean MakeOrder;
    protected boolean TakeOrder;

    public Actor (String name, boolean MakeOrder, boolean TakeOrder) {
        this.name = name;
        this.MakeOrder = MakeOrder;
        this.TakeOrder = TakeOrder;
    }

    public String getName() {
        return name;
    }

    
}
