package Day5_Basic_core_Problems;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        System.out.println("Enter the character you want to check: ");
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel.");
        else
            System.out.println(ch + " is consonant.");
    }
}


