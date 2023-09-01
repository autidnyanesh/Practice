
import java.util.Random;
import java.util.Scanner;

public class NoGuess {
    public static void main(String[] args) {
        boolean correct = false;
        int i = 100;
        int count=1;
        Scanner input = new Scanner(System.in);
        Random random=new Random();
        int answer=random.nextInt(100);
           while (i > 0) {
               System.out.println("Enter your guess: ");
               int guess = input.nextInt();
               if (guess == answer) {
                   System.out.println("Congratulations!! You guessed the number!\nYou won! in "+count+" rounds");
                   break;
               }
               else if (guess > answer) {
                   System.out.println("Your guess is too high.");
                   i--;
               }
               else {
                   System.out.println("Your guess is too low.");
               }
               i--;
               count++;
           }
    }
}

