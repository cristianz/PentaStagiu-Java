import java.util.Scanner;
/*
Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify how many Fibonacci numbers you wish to generate: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        float Average=0; int fibNo[]= new int[number];
        fibNo[0]=0; fibNo[1]=1;
        int Sum=1;
        if (number <=0)
            System.out.println("Improper value selected. Fibonacci number must be higher or at least 1");
        else
            for (int i=0; i<number; i++)
            {
                if (i==0)
                {
                 fibNo[0]=0;
                 System.out.print(fibNo[i]);
                 continue;
                }
                if (i==1) {
                    fibNo[1] = 1;
                    System.out.print(" " + fibNo[i]);
                    continue;
                }
                else {
                    fibNo[i] = fibNo[i - 1] + fibNo[i - 2];
                    System.out.print(" " + fibNo[i]);
                }
                Sum+=fibNo[i];
            }
        System.out.println();
         Average = (float)Sum/number;
        System.out.println("Average of the first " + number + " Fibonacci numbers is " + Average);
        scanner.close();
    }
}
