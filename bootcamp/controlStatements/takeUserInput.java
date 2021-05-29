import java.util.Scanner;

public class takeUserInput {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("The value of x is: " + x);
        String s = "8";
        System.out.println(s);
        sc.close();
    }
}
