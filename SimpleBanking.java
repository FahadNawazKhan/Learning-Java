import java.util.*;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice = 0;

        while(choice != 4){
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                balance += amt;
                System.out.println("Deposited. New Balance: " + balance);
            } else if(choice == 2){
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                if(amt <= balance){
                    balance -= amt;
                    System.out.println("Withdrawn. New Balance: " + balance);
                } else {
                    System.out.println("Not enough balance!");
                }
            } else if(choice == 3){
                System.out.println("Balance: " + balance);
            } else if(choice == 4){
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
