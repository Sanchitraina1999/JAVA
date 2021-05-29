public class forloop {
    public static void main(String[] args) {
        // for (int i = 1; i < 10; i++)
        // System.out.println("10000 at " + i + "% equals = " + String.format("%.2f",
        // (calculateInterest(10000, i))));

        for (int i = 1; i < 50; i++)
            printPrimes(i);
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

    public static void printPrimes(int x) {
        if (x < 2)
            return;
        int c=0;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if(c==0)
            System.out.println(x + " is a prime number");
    }
}