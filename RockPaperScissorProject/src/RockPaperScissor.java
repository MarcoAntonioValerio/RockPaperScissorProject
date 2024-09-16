import java.util.Random;

//backend
public class RockPaperScissor {
    //all of the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    //store the computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String result;

    //store the scores so that we can retrieve the values and display it to the frontend
    private int computerScore, playerScore;

    //use to generate a random number to randomly choose an option for the comouter
    private Random random;

    //constructor - to initialise random obj
    public RockPaperScissor(){
        random = new Random();
    }

    //call this method to begin play rock paper scissor
    //playerChoice - is the choice made by the player (i.e. rock, paper or scissors)
    //this method will return the result of the game(i.e. computer win, player win, draw)
    public String playRockPaperScissor(String playerChoice){
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        switch (computerChoice){
            case "Rock":
                victoryCondition("Paper", "Scissor", playerChoice);
                break;
            case "Paper":
                victoryCondition("Scissors", "Rock", playerChoice);
                break;
            case "Scissor":
                victoryCondition("Rock", "Paper", playerChoice);
                break;
        }

        return result;
    }

    private void victoryCondition(String itsBeatenBy, String winsAgainst, String playerChoice){
        if (playerChoice.equals(itsBeatenBy)) {
            result = "Player Wins";
            playerScore++;
        } else if (playerChoice.equals(winsAgainst)) {
            result = "Computer Wins";
            computerScore++;
        } else {
            result = "Draw";
        }
    }
}
