import java.util.Scanner;

public class countingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        System.out.println("Enter a number you want to count occurance of");
        int occ = in.nextInt();

        int count = 0;
        while (n > 0)
        {
            int rem = n % 10;
            if (rem == occ)
            {
                count ++ ;
            }
            n = n / 10;
        }
        System.out.println(occ + " is repeated " + count + " times");
    }
}
