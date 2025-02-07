import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawLineExample extends JFrame implements MouseListener {
    private int x1, y1, x2, y2;
    private boolean drawLine = false;

    public DrawLineExample() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (drawLine) {
                    g.drawLine(x1, y1, x2, y2);
                }
            }
        };
        panel.addMouseListener(this);
        add(panel);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        drawLine = true;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new DrawLineExample().setVisible(true);
    }
}

