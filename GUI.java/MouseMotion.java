public import javax.swing.*;
import java.awt.event.*;

public class MouseMotion extends JFrame {
    private JLabel positionLabel;
    private int clickCount = 0;
    private JLabel clickLabel;

    public MouseMotion() {
        setTitle("Mouse Motion and Click Counter Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to show the mouse position
        positionLabel = new JLabel("Mouse Position: ");
        positionLabel.setBounds(10, 10, 200, 20);
        
        // Label to show the click count
        clickLabel = new JLabel("Click Count: 0");
        clickLabel.setBounds(10, 40, 200, 20);

        // Add labels to the frame
        setLayout(null);
        add(positionLabel);
        add(clickLabel);

        // Add MouseListener to count clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                clickLabel.setText("Click Count: " + clickCount);
            }
        });

        // Add MouseMotionListener to track mouse movement
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                positionLabel.setText("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseMotionExample frame = new MouseMotion();
            frame.setVisible(true);
        });
    }
}
 {
    
}
