public class methodOfStrings {

    public static void main(String[] args) {

        // string length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        //26


        // case conversion
        String newTxt = "Hello World";
        System.out.println(newTxt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(newTxt.toLowerCase());   // Outputs "hello world"

        // indexing
        String moreTxt = "Please locate where 'locate' occurs!";
        System.out.println(moreTxt.indexOf("locate")); // Outputs 7


        String firstNameBL = "The great Brian";
        String lastNameBL = "amazing and awesome Loveless";
        System.out.println(firstNameBL + " " + lastNameBL);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        //character escapes

        // \' single quote, \" double quote \\ backslash
        // examples

        String txtA = "We are the so-called \"Vikings\" from the north.";
        String txtB = "It\'s alright. \n";
        String txtC = "\t The character \\ is called backslash.";

        System.out.println(txtA + " " + txtB.concat(txtC));

//      \n	New Line
//      \r	Carriage Return
//      \t	Tab
//      \b	Backspace
//      \f	Form Feed

        //
        String myLines = """
                This is for sure
                a multi-line
                string that \n
                I have made to show 
                \t these commands \r that exist
                in new text block feature
                """;

        System.out.println(myLines);

    }

}
