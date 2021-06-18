/**This program calcultaes Fibonacci Numbers  
 * @author (Fikri San Koktas)
 * @version (22 February 2021)**/
import java.util.Scanner;
public class KFS_FibonacciNumbers_Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer to test this program:");
        int userInput;
        userInput = sc.nextInt();
        int fold1 = 0; int fold2 = 1; int foldNew = 0; int inputCounter;
        for (inputCounter = 0; inputCounter < userInput; inputCounter ++)
        {
            foldNew = fold1 + fold2;
            fold2 = fold1;
            fold1 = foldNew;		
        } 
        System.out.println("The " + inputCounter + "th Fibonacci number is: " + foldNew);
    }
}
