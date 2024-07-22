import java.util.Scanner;
public class NumberGame
  {
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int chances =8;
        int finals = 0;
        boolean playagain = true;
        System.out.println("Hey there! Welcome.");
        System.out.println("You have " + chances + " chances to win the game.");

        while (playagain)
          {
            int rand = getrandN(1, 100); 
            boolean guess = false;

            for (int i = 0; i < chances; i++)
              {
                System.out.println("Chance " + (i + 1) + ". Enter your guess:");
                int user = sc.nextInt();

                if (user == rand)
                {
                    guess = true;
                    finals++;
                    System.out.println("You won!");
                    break;
                }
                else if (user > rand)
                {
                    System.out.println("Too high.");
                }
                else
                {
                    System.out.println("Too low.");
                }
            }

            if (!guess)
            {
                System.out.println("You lose. The number was " + rand);
            }

            System.out.println("Do you want to play again? 1:Yes/2:No");
            String pA = sc.next();
            playagain = pA.equalsIgnoreCase("1");
        }

        System.out.println("Thank you! Hope you enjoyed it :)");
        System.out.println("Your score: " + finals);
    }

    public static int getrandN(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1)) + min; 
    }  
}
