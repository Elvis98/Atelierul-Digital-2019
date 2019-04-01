package Lab3;

public abstract class CondimentDecorator extends Decorator {
   protected Decorator decorator;

    public CondimentDecorator (String description, float cost, Decorator decorator){
        super(description, cost);
        this.decorator = decorator;
    }
    public  String getDescription () {
        return getDescription + " "()
    }
}
