import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGui{
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Simple GUI Example");
        
        // Set the size of the window
        frame.setSize(300, 200);
        
        // Define what happens when the user closes the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a label and a button
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        JButton button = new JButton("Click me");
        
        // Set the layout manager for the frame (optional)
        frame.setLayout(new java.awt.FlowLayout());
        
        // Add components (label and button) to the frame
        frame.add(label);
        frame.add(button);
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the text of the label when the button is clicked
                label.setText("HI AMISHA!");
            }
        });
        
        // Make the frame visible
        frame.setVisible(true);
    }
}

