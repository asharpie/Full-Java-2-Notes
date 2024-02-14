public class Animal {

    private String type;

    public Animal(){
        type = "";
    }

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print(){
        System.out.println("The type of animal " + type);
    }
}