////import org.junit.jupiter.api.Test;
//
////import static org.junit.jupiter.api.Assertions.*;
//
//class CarTest {
//    /**
//     Junit test methods always have @Test above the method header
//     You should test all methods except ones that print data
//     print methods are tested by running the code
//     (unit testing print methods is more difficult
//     and outside the scope of this course)
//
//     You must use an assert to actually make a test, the more commonly used tests are:
//
//     assertNotNull - tests an Object to see if it has a memory location
//     assertTrue - you must make a boolean expression (usually with
//     comparator operators E.G < > <= >= == !=)
//     assertEquals - you give it an expected value and get the actual value
//     */
//
// //   @Test
//  //  void emptyConstructor(){
//   //     Car car = new Car();
//   //     assertNotNull(car);
//    }
//
//    //    @Test
////    void nonEmptyConstructorMake(){
////        Car car = new Car("Ford", "", 0);
////        assertEquals("Ford", car.getMake());
////    }
////    @Test
////    void nonEmptyConstructorType(){
////        Car car = new Car("", "sports", 0);
////        assertEquals("sports", car.getType());
////    }
////    @Test
////    void nonEmptyConstructorYear(){
////        Car car = new Car("", "", 2020);
////        assertTrue(2020 == car.getYear());
////    }
//    // You could do the test using the 3 methods above or
//    // alternatively, you could test the non-empty constructor in one method
//    @Test
//    void nonEmptyConstructor(){
//        Car car = new Car("Ford", "sports", 2020);
//        assertAll("Car non-empty constructor test",
//                () -> assertEquals("Ford", car.getMake(), "make test"),
//                () -> assertEquals("sports", car.getType(), "type test"),
//                () -> assertTrue(2020 == car.getYear(), "year test")
//        );
//    }
//
//    @Test
//    void setMake() {
//        Car car = new Car();
//        car.setMake("Kia");
//        assertTrue(car.getMake().equals("Kia"));
//    }
//
//    @Test
//    void setType() {
//        Car car = new Car();
//        car.setType("sedan");
//        assertEquals("sedan", car.getType());
//    }
//
//    @Test
//    void setYear() {
//        Car car = new Car();
//        car.setYear(100);
//        assertEquals(100, car.getYear());
//    }
//
//    @Test
//    void testToString() {
//        Car car = new Car("Ford", "sports", 2020);
//        assertEquals("Make:     Ford  Type:   sports Year: 2020", car.toString());
//    }
//}