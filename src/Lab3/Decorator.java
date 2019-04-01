package Lab3;

public abstract class Decorator {
   protected String description;
    protected float cost;

    public Decorator(String description, float cost){
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }
}
