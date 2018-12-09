import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the length of the array: ");
        int arrLength = scanner.nextInt();
        scanner.nextLine();
        int[] myArr = new int[arrLength];
        if (arrLength<=0)
            System.out.println("Improper value for Array length. Must be at least 1.");
        else
        {
            for(int i=0; i<arrLength; i++)
            {
                System.out.println("Type in the value of element " +i + " of the array");
                myArr[i] = scanner.nextInt();
            }
            int min=myArr[0];
            int max=myArr[0];
            int sum=0;
            float average=0;
            for(int i=0; i<arrLength;i++)
                if(myArr[i]<min)
                    min=myArr[i];
            for(int i=0; i<arrLength;i++)
                if(myArr[i]>max)
                    max=myArr[i];
            for(int i=0; i<arrLength; i++)
                sum=sum+myArr[i];
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Average: "+ (float)sum/arrLength);
        }
        scanner.close();
    }

}
