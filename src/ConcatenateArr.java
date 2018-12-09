import java.util.Scanner;

public class ConcatenateArr{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value for the length of the FIRST array: ");
        int firstArrLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input value for the length of the Second array: ");
        int secondArrLength = scanner.nextInt();
        scanner.nextLine();
        if ((firstArrLength<0) || (secondArrLength<0))
            System.out.println("Array lengths must be positive numbers.");
            else {
            int[] firstArr = new int[firstArrLength];
            for (int i = 0; i < firstArrLength; i++) {
                System.out.println("Enter value for element no." + i + " of the FIRST array");
                firstArr[i] = scanner.nextInt();
                scanner.nextLine();
            }
            int[] secondArr = new int[secondArrLength];
            for (int i = 0; i < secondArrLength; i++) {
                System.out.println("Enter value for element no." + i + " of the FIRST array");
                secondArr[i] = scanner.nextInt();
                scanner.nextLine();
            }
            int concatLength = firstArrLength + secondArrLength;
            int nextElement = 0;
            int[] concatArr = new int[concatLength];
            for(int i=0; i<firstArrLength;i++)
            {
                concatArr[i]=firstArr[i];
                if (i==firstArrLength-1)
                    nextElement=i+1;
            }
            for(int i=nextElement; i<concatLength; i++)
            {
                concatArr[i]=secondArr[i-nextElement];
            }
            System.out.println("Concatenated array should like this: ");
            for(int i=0; i<concatLength;i++)
                System.out.print(concatArr[i]+" ");
        }
            scanner.close();
    }
}
