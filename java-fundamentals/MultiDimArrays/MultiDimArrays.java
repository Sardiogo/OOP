/*This program shows how much an initial investment grow under different interest rate scenarios in which interest
is paid annually and reinvested*/
public class MultiDimArrays
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 10;
        final int NYEARS = 6;

        // set interest rates
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++)
            interestRate[i] = (STARTRATE + i * 10) / 100.0;

        double[][] balances = new double[NRATES][NYEARS];

        // set initial balances to 10000
        for (int i = 0; i < balances.length; i++)
            balances[i][0] = 10000;

        // compute interest for future years
        for (int i = 0; i < balances.length; i++)
        {
            for (int j = 1; j < balances[i].length; j++)
            {
                // get last year's balances from previous column
                double oldBalance = balances[i][j - 1];

                // compute interest
                double interest = oldBalance * interestRate[i];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of years
        for (int j = -1; j < NYEARS; j++)
        {
            if (j == -1)
                System.out.printf("%4s", "TABLE");
            else
                System.out.printf("%10d", j);
        }
        System.out.println();

        // print balance table
        int i = 0;
        for (double[] row : balances)
        {
            // print table row
            System.out.printf("%4.0f%%", 100 * interestRate[i]);
            i++;
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
