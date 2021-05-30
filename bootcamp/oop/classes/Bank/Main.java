import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bank ac = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. get balance");
            System.out.println("2. add funds");
            System.out.println("3. withdraw funds");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(ac.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    int amt = sc.nextInt();
                    sc.nextLine();
                    ac.addAmount(amt);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    int debt = sc.nextInt();
                    sc.nextLine();
                    ac.withdrawFunds(debt);
                    break;
                case 4:
                    break;
            }
        }
        sc.close();
    }
}
