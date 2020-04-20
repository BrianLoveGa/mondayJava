public class CastingPractice {

    /*
    In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte */
    public static void main(String[] args) {

        System.out.println("casting practice");

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myOtrDouble = 9.78;
        int myOtrInt = (int) myOtrDouble; // Manual casting: double to int

        System.out.println(myOtrDouble);   // Outputs 9.78
        System.out.println(myOtrInt);      // Outputs 9
    }

}
