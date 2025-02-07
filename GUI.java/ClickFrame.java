import javax.swing.*;
import java.awt.event.*;

public class ClickFrame extends JFrame {
    private int clickCount = 0;
    private JLabel label;

    public ClickFrame() {
        setTitle("Click Counter Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display click count
        label = new JLabel("Click Count: 0");
        add(label);

        // Add MouseListener to the frame to listen for clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                label.setText("Click Count: " + clickCount);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClickFrame frame = new ClickFrame();
            frame.setVisible(true);
        });
    }
}

