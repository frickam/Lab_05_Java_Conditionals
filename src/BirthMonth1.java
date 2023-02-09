import java.util.Scanner;
public class BirthMonth1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthMonth;
        String trash;
        final int MIN_CUTOFF = 1;
        final int MAX_CUTOFF = 12;

        System.out.print("Enter your birth month [1-12]: ");
        birthMonth = in.nextInt();
        in.nextLine();
        if(in.hasNextInt())
        {

            if(birthMonth > MAX_CUTOFF)
            {
                System.out.println("You must enter a valid number not: " + birthMonth);
                System.out.println("Run the program again with correct input!");
                System.exit(0);
            }
            if(birthMonth < MIN_CUTOFF)
            {
                System.out.println("You must enter a valid number not: " + birthMonth);
                System.out.println("Run the program again with correct input!");
                System.exit(0);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not: " + trash);
            System.out.println("Run the program again with correct input!");
            System.exit(0);
        }
        System.out.println("Your birth month is: " + birthMonth);

    }
}
