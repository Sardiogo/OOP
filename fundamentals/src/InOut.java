import java.util.Scanner;
/*
 * The Scanner class is defined in the java.util package.
 * Whenever you use a class that is not defined in the basic
 * java.lang package, you need to use an import directive.
 */

public class InOut
{
    public static void main(String[] args)
    {
        /*
         * To read console input, you first construct a Scanner that
         * is attached to System.in:
         */
        Scanner in = new Scanner(System.in);
        /*
         * Now you can use the various methods of the Scanner class
         * to read input.
         */
        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be "
                           + (age + 1));
        in.close();
    }
}