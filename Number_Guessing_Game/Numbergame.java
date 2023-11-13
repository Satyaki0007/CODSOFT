import java.util.Scanner;
 
public class Numbergame {
    int K;
    static Scanner sc = new Scanner(System.in);
    public Numbergame(int K){
        this.K=K;
    }
    public void play()
    {
        int number = 1 + (int)(100 * Math.random());
        int i, guess;
        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
 
        for (i = 0; i < K; i++) {
 
            System.out.println("Guess the number:");
            guess = sc.nextInt();
 
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    public static void main(String arg[]) {
        System.out.println("Enter number of trials : ");
        int k=sc.nextInt();
        Numbergame ng=new Numbergame(k);
        char ch=' ';
        do {
            ng.play();
            System.out.println("Do you want to play again ? (y/n) : ");
            ch=System.console().readLine().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}