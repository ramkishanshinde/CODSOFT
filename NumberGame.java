import java.util.Random;
import java.util.Scanner;

public class NumberGame {
   
    static int round = 1;
    static int score = 0;
    static int scorePerRound = 100;
    static Scanner scanner = new Scanner(System.in);

    

    public static void main(String[] args) {
                System.out.println(" Number Game");

    
          int randomnum1 = NumberGame.ramdomNum(1, 100);
    
        for (int i = 0; i <= 5; i++) {
            int guess = NumberGame.prompt(i);
            String result = NumberGame.compare(randomnum1, guess);
            System.out.println(result);
            
            if (result.equals("Correct")) {
                score = score + scorePerRound;
                break;
            } else
                continue;
        }
        
        System.out.println("Your score is:- " + score);
    
            System.out.println("Thank you");
    }


    public static int ramdomNum(int num1, int num2) {
        Random random = new Random();
        int temp2 = -1;
        while (temp2 < num1) {
            int temp1 = random.nextInt(99999);
            temp2 = temp1 % num2;
        }
        return temp2;
    }

    public static int prompt(int attampts) {
        
        System.out.println("Guess a number:- ");
        int num = scanner.nextInt();
        return num;
    }
    public static String compare(int rand, int guess) {
        String result = "Invalid Guess, try again";

        if (guess == rand)
            result = "Correct";

        else if (guess < rand)
            result = "Too low";

        else if (guess > rand)
            result = "Too high";

        return result;
    }
}
