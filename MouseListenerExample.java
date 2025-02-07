import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {

    public MouseListenerExample() {
        setTitle("MouseListener Example");
        setSize(400, 200);
        setVisible(true);

        addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
}
