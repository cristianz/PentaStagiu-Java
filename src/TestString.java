import java.util.Scanner;
/*
Write a program that test if a given String contains another String.

For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
 */
public class TestString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Input the second string: ");
        String secondString = scanner.nextLine();
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();
        if (firstString.contains(secondString))
        System.out.println("TRUE");
            else
        System.out.println("FALSE");
        scanner.close();
    }
}
