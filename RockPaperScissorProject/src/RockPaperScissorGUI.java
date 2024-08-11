import javax.swing.*;

//fronted
public class RockPaperScissorGUI extends JFrame {
    public RockPaperScissorGUI(){
        //invoke iframe constructor and add title to the GUI
        super("Rock Paper Scissor");

        //set the size of th GUI
        setSize(450, 574);

        //set layout to null to disable layout management, so we can use absolute positioning for the elements
        //(i.e. setting x,y coordinates and width/height values)
        setLayout(null);

        //load GUI in the centre of the screen every time we run the application
        setLocationRelativeTo(null);
    }



}
