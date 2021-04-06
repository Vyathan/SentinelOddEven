//Programmer: Matt Brundage II
//Date: 4/6/21

//Import
import java.util.Scanner;
// Define Class
public class EvenEntryLoop 
{
    //Define method
    public static void main (String[] args) 
    {
        //Declare sentinel Value
        int sentinel = 999;
        Scanner scanner = new Scanner(System.in);

        //Request user input
        System.out.print
        ("\nEnter an even number (999 to stop): ");
        int userValue = scanner.nextInt();

        //Check if number is sentinel value
        while(userValue != sentinel)
        {
            //Check for even number
            if(userValue % 2 == 0)
        {

        //Display message
        System.out.println("Good job!");
        System.out.print
        ("\nEnter an even number (999 to stop): ");

        //Request user input another value
        userValue = scanner.nextInt();
        }

        //Check for odd number
        else if(userValue % 2 == 1)
        {

        //Display Error Message
        System.out.println
        (userValue + " is not an even number: ");
        System.out.print
        ("\nEnter an even number (999 to stop): ");

        //Request user input another value
        userValue = scanner.nextInt();
        }
        }
        //End Program
        scanner.close();
    }
}


