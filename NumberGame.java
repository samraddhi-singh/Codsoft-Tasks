package CodsoftTasks;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Random ran =new Random();
        int guessNumber= ran.nextInt(100)+1;
        Scanner sc= new Scanner(System.in);
        int guess;
        System.out.println("Here's the guessing game for you!");
        System.out.println("Guess a number between 1 to 100. Within 5 trials: ");
        int k=5;
        int m=k;
        int i;
        for(i=0;i<k;i++){
            guess=sc.nextInt();
            if(guess==guessNumber){
                System.out.println("Congratulations! You Guessed the number right!");
                break;
            }
            else if (guess<guessNumber && i!=k-1){
                m--;
                System.out.println("Your guess is low! You have "+m+" trials left");
            }
            else {
                m--;
                System.out.println("Your guess is high! You have "+m+" trials left");
            }
        }
        if(i==k){
            System.out.println("The number was: "+guessNumber);
        }
    }
}
