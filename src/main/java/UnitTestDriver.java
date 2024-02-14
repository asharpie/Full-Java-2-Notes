public class UnitTestDriver {
    public static void main(String[] args) {
        Dealership ship = new Dealership("Tony's Deals");

        ship.addCarsToArray("Ford", "sedan", 2021);
        ship.addCarsToArray("Chevy", "sports", 2023);
        ship.addCarsToArray("Honda", "electric", 2022);

        ship.printInfo();
    }
}
