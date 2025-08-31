import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; 
        int guess = sc.nextInt();

        System.out.println("Guess the number (1-100): ");
        
        while(guess != number){
            guess = sc.nextInt();
            

            if(guess > number){
                System.out.println("Too high! Try again.");
            } else if(guess < number){
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! THE CORRECT NUMBER IS: " + a);
            }
        }
    }
}
