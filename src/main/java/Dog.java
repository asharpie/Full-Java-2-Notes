public class Dog extends Mammal{
    /** A subclass of Mammal */
    private boolean pet;
    private String huntingType;
    protected final int Date = 534;
    int age = 93;

    public Dog() {
        pet = false;
        huntingType = "";
    }

    public Dog(boolean pet, String huntingType) {
        this.pet = pet;
        this.huntingType = huntingType;
    }
    public Dog(boolean pet, String huntingType, boolean vert) {
        super(vert);
        this.pet = pet;
        this.huntingType = huntingType;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public String getHuntingType() {
        return huntingType;
    }

    public void setHuntingType(String huntingType) {
        this.huntingType = huntingType;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "pet=" + pet +
                ", huntingType='" + huntingType + '\'' +
                '}';
    }

    public void print(){
        setVertebrate(true);
        super.print();
        System.out.println("This dog is a pet "+ pet);
        System.out.println("The hunting type of dog is " + huntingType);
    }
}