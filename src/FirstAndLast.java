import java.util.Scanner;
/* Write a java program that will test whether the first and the last element of an int array are the same.
We can assume the array has 2 or more elements.

For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE
*/
public class FirstAndLast {
    public static void main(String[] args)
    {
        int arrayLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of your array: ");
        arrayLength=scanner.nextInt();
        scanner.nextLine();
        int[] Arr = new int[arrayLength];
        for (int i=0; i<arrayLength; i++)
        {
            if (arrayLength<2)
            {
                System.out.println("Your array is too short. Must have more than 2 elements");
                break;
            }
            else
            {
                System.out.println("Enter value for elem " + i + " of the array" );
                Arr[i]=scanner.nextInt();
            }
        }
        if (Arr[0]==Arr[arrayLength-1])
            System.out.println("True");
            else
            System.out.println("False");
         scanner.close();
    }
}
