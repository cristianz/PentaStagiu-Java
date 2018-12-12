import java.util.Scanner;

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
