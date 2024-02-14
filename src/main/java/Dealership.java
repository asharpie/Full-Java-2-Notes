public class Dealership {

    // attributes
    private Car[] cars;
    private String shipName;
    private int index;

    // constructors
    public Dealership(){
        shipName = "";
        cars = new Car[1000];
        index = 0;
    }

    public Dealership(String sName){
        shipName = sName;
        cars = new Car[1000]; // physical length 1000
        index = 0;
    }
    //setter
    public void setShipName(String sName){
        shipName = sName;
    }

    // add method
    public void addCarsToArray(String make, String type, int year){
        cars[index] = new Car(make, type, year);
        index++;  // logical length whatever number index is
    }

    // getters
    public String getShipName(){
        return shipName;
    }

    public int getLogicalLength(){
        return index;
    }

    // this getter is mostly for junit testing only
    public Car getCarFromArray(int i){
        return cars[i];
    }

    // instead of a toString I'm gonna make a print method
    public void printInfo(){
        System.out.println("Dealership: " + shipName + " has " + index + " cars");
        System.out.println();
        for(int i = 0; i < index; i++){
            System.out.println(cars[i].toString());
        }
        System.out.println();
    }

    // this method is really only used for unit testing
    public Car[] getCarArray() {
        return cars;
    }
}