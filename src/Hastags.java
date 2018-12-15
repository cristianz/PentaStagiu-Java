import java.util.Scanner;
/*Write a program that will insert a # between any duplicate letters that are placed right next to each.
For example

Given the following string “Hello world” the output should be “Hel#lo world”
 */
public class Hastags {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Please input your text here: ");
        String myString = Scan.nextLine();
        char[] myCharArr = myString.toCharArray();
        System.out.print(myCharArr[0]);
        for(int i=1; i<myCharArr.length; i++)
        {
            if (myCharArr[i]==myCharArr[i-1]) {
                System.out.print("#"+myCharArr[i]);
            }
                else
                System.out.print(myCharArr[i]);
        }
        Scan.close();
    }
}
