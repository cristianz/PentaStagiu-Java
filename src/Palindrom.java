import java.util.Scanner;
/* Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE
*/
public class Palindrom {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Input the text you wish to test: ");
        String myString = Scan.nextLine();
        char[] myStringArr = myString.toCharArray();
        int n = myStringArr.length;
        char[] myStringReversed = new char[n];
        if(n%2!=0)
            System.out.print("FALSE");
        else
        {
            System.out.println(n);
            int j=0;
            while (n-1 >= 0)
            {
                myStringReversed[j]=myStringArr[n-1];
                n--;
                j++;
            }
            System.out.println(myStringReversed);
            String S1 = myStringReversed.toString();
            String S2 = myStringArr.toString();
            if (myStringReversed.equals(myStringArr))
                System.out.println("True");
                else
                System.out.println("False");
        }
        Scan.close();
    }
}
