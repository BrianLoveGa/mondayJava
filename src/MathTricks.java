import java.util.Random;

public class MathTricks {
    public static void main(String[] args) {

        // built in math stuff
        // find bigger number = .max ... 10
        System.out.println(Math.max(5, 10));
        // smaller number = .min ... 5
        System.out.println(Math.min(5, 10));
        // square roots ... 8
        System.out.println(Math.sqrt(64));
        // absolute value
        System.out.println(Math.abs(-4.7));
        // random number between 0 and 1
        System.out.println(Math.random());
        // random between 20 and 60
        Random r = new Random();
        int low = 20;
        int high = 60;
        int result = r.nextInt(high - low) + low;
        System.out.println(result);
        // 55 or 36

        //random negative between -10 and -250

        Random n = new Random();
        int lowN = 10;
        int highN = 250;
        int resultN = n.nextInt(highN - lowN) + lowN;
        System.out.println(resultN * -1);

        // -23 ... -57... -158


    }
}
