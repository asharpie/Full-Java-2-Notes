
public abstract class Insect extends Animal implements Housing, Creepy{

    // class attributes
    private boolean sixLegs;
    private boolean threeBodySegments;
    private boolean invertebrate;


    public Insect () {
        // by default there is a super(); that calls the constructor of Animal
        sixLegs = false;
        threeBodySegments = false;
        invertebrate = false;
    }

    public Insect(boolean legs, boolean body, boolean invert) {
        sixLegs = legs;
        threeBodySegments = body;
        invertebrate = invert;
    }
    public Insect(boolean legs, boolean body, boolean invert, String yuck) {
        super(yuck);
        sixLegs = legs;
        threeBodySegments = body;
        invertebrate = invert;
    }

    public void setSixLegs (boolean legs) {
        sixLegs = legs;
    }

    public void setThreeBodySegments (boolean segments) {
        threeBodySegments = segments;
    }

    public void setInvertebrate (boolean invert) {
        invertebrate = invert;
    }

    public boolean getSixLegs () {
        return sixLegs;
    }

    public boolean getThreeBodySegments () {
        return threeBodySegments;
    }

    public boolean getInvertebrate () {
        return 	invertebrate;
    }


    public void print () {
        System.out.println("Insects have 6 legs " + sixLegs);
        System.out.println("They also have 3 body segments " + threeBodySegments);
        System.out.println("And they are invertebrates " + invertebrate);
        super.print();
    }

    public abstract int calcLifeSpan(int numLegs);
}










