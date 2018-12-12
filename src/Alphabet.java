import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'z'};
        System.out.print("Please input the target string: ");
        String inputString = Scan.nextLine();
        char[] inputArrString = inputString.toCharArray();
        for(int j=0; j<inputArrString.length; j++ )
        {
            for(int i=0; i<alphabet.length; i++)
            {
                if (inputArrString[j]==alphabet[i])
                    System.out.print(i);
                    else
                        continue;
            }
        }
        Scan.close();
    }
}
