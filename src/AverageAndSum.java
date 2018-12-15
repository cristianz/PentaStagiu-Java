import java.util.Scanner;
/* Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:

Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.5
*/
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
