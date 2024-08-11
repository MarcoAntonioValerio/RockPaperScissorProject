import javax.swing.*;
import java.awt.*;

//fronted
public class RockPaperScissorGUI extends JFrame {
    //player buttons
    JButton rockButton, paperButton, scissorButton;

    public RockPaperScissorGUI(){
        //invoke iframe constructor and add title to the GUI
        super("Rock Paper Scissor");

        //set the size of th GUI
        setSize(450, 574);

        //set layout to null to disable layout management, so we can use absolute positioning for the elements
        //(i.e. setting x,y coordinates and width/height values)
        setLayout(null);

        //terminate the java virtual machine when closing the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //load GUI in the centre of the screen every time we run the application
        setLocationRelativeTo(null);

        //add GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){

        //create computer score label
        JLabel computerScoreLabel = new JLabel("Computer: 0");

        //set x,y coordinates and width/height alues
        computerScoreLabel.setBounds(0, 43, 450, 30);

        //set the font to have a font family of dialog, font-weight of bold, and a font-size of 26
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        //place the text in the centre
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //add to GUI
        add(computerScoreLabel);

        //create computer choice
        JLabel computerChoice = new JLabel("?");
        computerChoice.setBounds(175, 118, 98, 81);
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        //create a black border around
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        //create player score label
        JLabel playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(0, 317, 450, 30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        //player buttons

        //rock button
        rockButton = new JButton("Rock");
        rockButton.setBounds(40, 387, 105, 81);
        rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(rockButton);

        //paper butto
        paperButton = new JButton("Paper");
        paperButton.setBounds(165, 387, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(paperButton);

        //scissor button
        scissorButton = new JButton("Scissor");
        scissorButton.setBounds(290, 387, 105, 81);
        scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(scissorButton);
    }

}
