public class Fox extends Mammal{
    /** A subclass of Mammal */
    private String type;
    private double weight;

    public Fox() {
        type = "";
        weight = 0.0;
    }
    public Fox(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}