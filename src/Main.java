
import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame(" Food Ordering System - Login");

        // Set up the frame
        frame.setSize(765, 530); // Set your preferred size
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setResizable(false); // Set if the frame is resizable
        //remove title bar
        frame.setUndecorated(true);
       

        // Create your panel
        Login panel = new Login();
        //Home panel = new Home();
        //AboutUs panel = new AboutUs();
        //Checkout panel = new Checkout();
        
                //temporary
                //frame.setSize(900, 500); // Set your preferred size
                //frame.setLocationRelativeTo(null); // Center the frame
                //frame.setResizable(true); // Set if the frame is resizable
                //Title bar + closing
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
       
         return;

    }
    
}
