import javax.swing.*;
import java.awt.event.*;

public class WindowListenerExample extends JFrame implements WindowListener {

    JLabel label;

    public WindowListenerExample() {
        setTitle("WindowListener Example");
        setSize(400, 200);
        setVisible(true);

        // Create a label to show window event messages
        label = new JLabel("Window Event Status Will Appear Here", SwingConstants.CENTER);
        label.setBounds(50, 80, 300, 30);
        add(label);

        addWindowListener(this);
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
        label.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing...");
        label.setText("Window Closing...");
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
        label.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
        label.setText("Window Minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
        label.setText("Window Restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
        label.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
        label.setText("Window Deactivated");
    }
}
