public class Main {

    public static void main(String[] args) {
        // write your code here
        // starting at the beginning
        System.out.println("Hello there world it's Brian L. Making some Java");

        // declare vars SYNTAX

        // type variable = value

        String name = "Brian";
        System.out.println(name);
        int myNumber = 33;
        System.out.println(myNumber);
        int yourNumber;
        yourNumber = 15;
        System.out.println(yourNumber);

        final int theNum = 42;

        System.out.println(theNum);

        // theNum = 17; // will generate an error: cannot assign a value to a final variable

        System.out.println(theNum);


        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myNum);
        System.out.println(myText);
        System.out.println(myLetter);

        //  concatenation

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y


        int a = 5, b = 6, c = 50, d = 8;
        System.out.println(a + b + c + d);

       /*

       Names can contain letters, digits, underscores, and dollar signs
       Names must begin with a letter
       Names should start with a lowercase letter and it cannot contain whitespace
       Names can also begin with $ and _ (but we will not use it in this tutorial)
       Names are case sensitive ("myVar" and "myvar" are different variables)
       Reserved words (like Java keywords, such as int or boolean) cannot be used as names


        */
    }
}
