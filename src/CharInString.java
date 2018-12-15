import java.util.Scanner;
/*Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)
 */
public class CharInString {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Input default string: ");
        String myString = Scan.nextLine();
        //Scan.nextLine();
        System.out.print("Input target char: ");
        char myChar = Scan.next().charAt(0); //Stackoverflow rullz
        Scan.nextLine();
        int charCount = 0;
        char[] myCharArr = myString.toCharArray();
        for(int i=0; i<myCharArr.length; i++)
        {
            if(myCharArr[i]==myChar)
                charCount++;
        }
        System.out.println("The target char-> " + myChar + " has appeared " + charCount + " times");
        Scan.close();;
    }
}
