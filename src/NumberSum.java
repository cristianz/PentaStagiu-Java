import java.util.Scanner;

public class NumberSum {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target number: ");
        int targetNumber = scanner.nextInt();
        scanner.nextLine();
        int SumNo=0;
        if (targetNumber < 0)
            System.out.println("Improper target number. Value must not be negative");
        else
            for (int i= 0; i<=targetNumber; i++)
                SumNo+=i;
        System.out.println("Sum of all numbers is: " + SumNo);
    }
}
