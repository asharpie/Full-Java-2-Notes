
public class Cricket extends Insect {

    // class attributes
    private boolean jump;
    private boolean chirp;
    private String number;

    public Cricket () {
        // super isn't shown here but there is one hidden by default
        jump = false;
        chirp = false;
    }

    public Cricket (boolean legs, boolean body, boolean invert, boolean Jump, boolean Chirp) {
        // hidden super here
        setJump(Jump);
        chirp = Chirp;
        setSixLegs(legs);
        setInvertebrate(invert);
        setThreeBodySegments(body);
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public void setChirp(boolean Chirp) {
        chirp = Chirp;
    }

    public boolean getJump() {
        return jump;
    }

    public boolean getChirp() {
        return chirp;
    }

    public void print () {
        System.out.println("Crickets don't fly they jump " + jump);
        System.out.println("Crickets chirp " + chirp);
//        super.print();
    }

    @Override
    public int calcLifeSpan(int numLegs) {
        return numLegs * 4;
    }

    public String toString() {
        return "Crickets jump " + jump + " and sing " + chirp;
    }


    @Override
    public void creep() {

    }

    @Override
    public void genHouseNum() {

    }

    @Override
    public String makeNumber(String housingNum) {
        return null;
    }
}