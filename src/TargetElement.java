import java.util.Scanner;

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
                    System.out.println("Elementul nu a fost gasit");
            }
        scanner.close();
    }
}
