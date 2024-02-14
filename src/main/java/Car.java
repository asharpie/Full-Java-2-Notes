public class Car {

    // attributes
    private String make;
    private String type;
    private int year;

    // empty parameter list Constructor
    public Car(){
        make = "";
        type = "";
        year = 0;
    }
    // on-empty parameter list Constructor
    public Car(String make, String type, int year){
        this.make = make;
        this.type = type;
        this.year = year;
    }

    // setters
    public void setMake(String make){
        this.make = make;
    }
    public void setType(String type){
        this.type = type;
    }

    public void setYear(int year){
        this.year = year;
    }

    // getters
    public String getMake(){
        return make;
    }
    public String getType(){
        return type;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return String.format("Make: %8s  Type: %8s Year: %d", make, type, year);
    }


}
