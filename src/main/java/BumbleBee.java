
public class BumbleBee extends Insect{

    // class attributes
    private boolean flight;
    private boolean stinger;

    public BumbleBee() {
        // hidden super call to the Insect empty constructor
        flight = false;
        stinger = false;
    }

    public BumbleBee(boolean fly, boolean sting) {
        super(); // call to the Insect empty constructor
        flight = fly;
        stinger = sting;
    }

    public BumbleBee(boolean fly, boolean sting, boolean legs, boolean body, boolean invert) {
        super(legs, body, invert); // call to the Insect non-empty constructor
        flight = fly;
        stinger = sting;
        // or could do the below calling setters of the Insect super class
//        setInvertebrate(invert);
//        setSixLegs(legs);
//        setThreeBodySegments(body);
    }

    public BumbleBee(boolean fly, boolean sting, boolean legs, boolean body, boolean invert, String type) {
        super(legs, body, invert, type); // call to the Insect non-empty constructor
        flight = fly;
        stinger = sting;
    }

    public void setFlight(boolean Flight) {
        flight = Flight;
    }

    public void setStinger(boolean stinger) {
        this.stinger = stinger;
    }

    public boolean getFlight() {
        return flight;
    }

    public boolean getStinger() {
        return stinger;
    }

    public void print () {
        System.out.println("Bumble bees sting " + stinger);
        System.out.println("Bumble bees fly " + flight);
        super.print(); // call to the Insect print method
    }

    @Override
    public int calcLifeSpan(int numLegs) {
        return (numLegs * 3)/2;
    }


    @Override
    public void genHouseNum() {

    }

    @Override
    public String makeNumber(String housingNum) {
        return null;
    }

    @Override
    public void creep() {

    }
}