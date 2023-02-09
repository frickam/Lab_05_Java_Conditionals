import java.util.Scanner;
public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.print("What is your party affiliation [D, R, I, or O]: ");
        if(in.hasNext())
        {
            party = in.next();
        }
        if(party == "D")
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(party == "R")
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(party == "I")
        {
            System.out.println("You get a Independent Man");
        }
        else
        {
            System.out.println("You get an Other Otter!");
        }
    }
}
