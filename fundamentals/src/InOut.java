import java.util.Arrays;
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
        if (args.length == 0 || args[0].equals("-h"))
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
            System.out.print("Insert name  ");
            String name = in.nextLine();

            // get second input
            System.out.print("Insert current year ");
            int age = in.nextInt();

            // display output on console
            System.out.println("Hi, " + name + ". In two years, we'll be in "
                               + (age + 2));
            in.close();
        }
        else if (args[0].equals("-g"))
        {
            int k = 10; // numbers to draw
            int max = 50; // highest number you can draw

            // fill an array with all possible numbers 1 2 3 ... max
            int[] numbers = new int[max];
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = i + 1;

            // draw k numbers and put them into a second array
            int[] result = new int[k];
            for (int i = 0; i < result.length; i++)
            {
                // The Math.random method returns a random floating-point
                // number that is between [0 , 1[ .
                // Make a random index between 0 and n - 1
                int r = (int) (Math.random() * max);

                // pick the element at the random location
                result[i] = numbers[r];

                // move the last element into the random location
                // we must be sure never to draw that number again
                numbers[r] = numbers[max - 1];
                max--;
            }

            // print the sorted array
            Arrays.sort(result); // tuned version of the QuickSort algorithm
            for (int r : result)
                System.out.println(r);
        }
    }
}