import java.util.Scanner;
/*Write a program that test whether 2 int arrays are equal.
Equality in this case means that both arrays have the same number of elements an element on a specific
index in first array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
 */
public class EqualArrays {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the length of the first array: ");
        int firstArrLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Define the length of the second array: ");
        int secondArrLength = scanner.nextInt();
        scanner.nextLine();
        if (firstArrLength<0 || secondArrLength<0)
            System.out.println("Improper values for the length of the first or second array.");
            else
                if ((firstArrLength>secondArrLength)||(firstArrLength<secondArrLength))
                    System.out.println("FALSE");
                else
                {
                    int[] firstArray = new int[firstArrLength];
                    for(int i=0; i<firstArrLength; i++)
                    {
                        System.out.println("Type the value of element no. " + i + " of the FIRST array");
                        firstArray[i]=scanner.nextInt();
                        scanner.nextLine();
                    }
                    int[] secondArray = new int[secondArrLength];
                    for(int i=0; i<secondArrLength; i++)
                    {
                        System.out.println("Type the value of element no. " + i + " of the SECOND array");
                        secondArray[i]=scanner.nextInt();
                        scanner.nextLine();
                    }
                    boolean EqualArray=true;
                    for(int i=0; i<firstArrLength; i++) {
                        if (firstArray[i] != secondArray[i]) {
                            EqualArray = false;
                            break;
                        }
                    }
                     if (EqualArray==true)
                         System.out.println("True");
                        else
                         System.out.println("False");
                }
     scanner.close();
    }
}
