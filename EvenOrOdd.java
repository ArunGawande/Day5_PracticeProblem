package Day5_Basic_core_Problems;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
