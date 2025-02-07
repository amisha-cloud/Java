import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample extends JFrame implements ActionListener {

    JButton button;

    public ActionListenerExample() {
        setTitle("ActionListener Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        button = new JButton("Click Me");
        button.setBounds(150, 80, 100, 40);
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button Clicked!");
        }
    }
}
