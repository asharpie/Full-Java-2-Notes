public class Boat {
    // once you know the class attributes
    // IntelliJ makes it easy to write the methods.
    private String make;
    private double cost;

    public Boat() {
        make = "";
        cost = 0.0;
    }

    public Boat(String make, double cost) {
        this.make = make;
        this.cost = cost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Make %s and cost $%.2f", make, cost);
    }

}