import java.util.Scanner;

public class EndString {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Input the first string:");
        String firstString = Scan.nextLine();
        System.out.print("Input the second string: ");
        String secondString = Scan.nextLine();
        if (firstString.endsWith(secondString))
            System.out.println("TRUE");
            else
            System.out.println("FALSE");
         Scan.close();;

    }
}
