import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the length of your array: ");
        int arrLength = scanner.nextInt();
        scanner.nextLine();
        int[] myArr = new int[arrLength];
        for(int i=0; i<arrLength; i++)
        {
            System.out.print("Input the value of elem no " + i + " of the array: ");
            myArr[i]=scanner.nextInt();
            scanner.nextLine();
        }
        int Odd=0, Even=0;
        for (int i=0; i<arrLength; i++)
        {
            if (myArr[i]%2==1)
                Odd++;
            else
                Even++;
        }
        System.out.println("Odd elements count: " + Odd);
        System.out.println("Even elements count: " + Even);
        scanner.close();
    }
}
