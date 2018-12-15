import java.util.Scanner;
/*Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be :
3 (because 5 is located at index 3 in the array) */
public class TargetElement {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the array");
        int arrLength = scanner.nextInt();
        scanner.nextLine();
        if(arrLength<=0)
            System.out.println("Improper length of array");
        else
            {
                int[] myArray = new int[arrLength];
                for (int i = 0; i<arrLength; i++)
                {
                    System.out.println("Specify the value of elem " + i + " of the array");
                    myArray[i]=scanner.nextInt();
                    scanner.nextLine();
                }
                System.out.println("Type the value of the target element: ");
                int targetElem = scanner.nextInt();
                scanner.nextLine();
                boolean found=false;
                for(int i=0; i<arrLength; i++)
                {
                    if(myArray[i]==targetElem)
                    {
                        System.out.print("Searched element is at index: " + i);
                        found=true;
                    }
                    else
                        continue;
                }
                if (found==false)
                    System.out.println("Elementul was not found");
            }
        scanner.close();
    }
}
