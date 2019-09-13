 public class RockPaperScissorsGame
{
 
    public static void main(String[] args)
    {
 
        Player player1 = new Player();
        Player player2 = new Player();
 
        String name;
        String playagain;
        int firstUserScore =0;
        int secondUserScore =0;
        char playAgainOrNot;
 
        Scanner keyboard = new Scanner(System.in)  
        System.out.println("Hello and welcome to the Guess Number Game.");
        System.out.println("Please enter your first name player 1");
        name= keyboard.next();
        player1.setName(name);                                                //Input user name
        System.out.println("Please enter your first name player 2");
        name = keyboard.next();
        player2.setName(name);
 
 
        do
        {
            // Prompt the user1
            System.out.println("What you would like to play? " + player1.getName());
            System.out.println("Rock, paper, or scissors ");
 
            // Get the user input
            String user1Input = keyboard.next();
            user1Input = user1Input.toUpperCase();
 
            //prompt user2
            System.out.println("What you would like to play? " + player2.getName());
            System.out.println("Rock, paper, or scissors ");
 
            // Get the user input
            String user2Input = keyboard.next();
            user2Input = user2Input.toUpperCase();
 
            //Getting the first letter
            char firstLetterUser1 = user1Input.charAt(0);
            char secondLetterUser2 = user2Input.charAt(0);
 
            //if the users choices are both equal
            if(firstLetterUser1 == secondLetterUser2)
            {
                System.out.println(player1.getName() +" chose  " + user1Input);
                System.out.println(player2.getName() + " chose  " + user2Input);
 
                System.out.println("It's a tie!");
 
                firstUserScore++;
                secondUserScore++;
 
                player1.setScore(firstUserScore);
                player2.setScore(secondUserScore);
            }//if
 
            //if the users choices are not equal
            else if (firstLetterUser1 != secondLetterUser2)
            {
                //rock breaks scissors
                if(firstLetterUser1 == 'R' && secondLetterUser2 == 'S')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
 
                }//if
 
                else if (secondLetterUser2 == 'R' && firstLetterUser1 == 'S')
                {
                    System.out.println(player1.getName() +" chose " + user1Input);
                    System.out.println(player2.getName() + " chose " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
 
                }//else if
 
                //paper covers rock
                else if (firstLetterUser1 == 'P' && secondLetterUser2 == 'R')
                {
                    System.out.println(player1.getName() +" chose " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
                }//else if
 
                else if (secondLetterUser2 == 'P' && firstLetterUser1 == 'R')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
                }//else if
 
 
                //scissors cut paper
                else if (firstLetterUser1 == 'S' && secondLetterUser2 =='P')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
                }//else if
 
                else if (secondLetterUser2 == 'S' && firstLetterUser1 == 'P')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
                }//else if
 
            }//else if
 
            System.out.println("Would you like to play again " + player1.getName() + " and " + player2.getName());
            System.out.println("Please enter Y/N");
            playagain = keyboard.next();
            playagain = playagain.toUpperCase();
            playAgainOrNot = playagain.charAt(0);
 
        }//do
 
        //keep the loop running while the user enter Y
        while (playAgainOrNot == 'Y');
 
 
        //print out of all of the data store in object
        System.out.print(player1.toString() + " \n" + player2.toString());
 
    }
}
