import java.util.Scanner;

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
