import java.util.Scanner;

public class swapno{
    public static void main(String[] args) {
        // let's swap some numbers
        swap();


    }

    static void swap(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a + " " + b);
//        System.out.println(b);
    }
}
