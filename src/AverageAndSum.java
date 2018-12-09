import java.util.Scanner;

public class AverageAndSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit of the range: ");
        int firstNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the higher limit of the range: ");
        int secondNo = scanner.nextInt();
        scanner.nextLine();
        int Sum=0;
        float Average=0;
        if((firstNo<0)||(secondNo<0))
            System.out.println("Improper values selected for range limits. Numbers must be positive.");
        else
            if (firstNo > secondNo)
                System.out.println("Improper values selected for lower limit. Must be lower than higher limit");
            else
            {
                for (int i=firstNo; i<=secondNo; i++)
                {
                    Sum+=i;
                }
                Average=(float)Sum/secondNo;
            }
        System.out.println("Sum of all the numbers in the range is : "+ Sum);
        System.out.println("Average of all the numbers in the range is : " + Average);
        scanner.close();
    }
}
