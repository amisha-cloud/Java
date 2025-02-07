import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Javaswingdemo extends JFrame implements WindowListener, MouseListener {

    private int clickCount = 0;
    Graphics g;
    private JLabel countLabel;
    int x1, y1, x2, y2;
    JButton jb;


    public Javaswingdemo() {
        setTitle("Registration");
        setSize(500,500);
        jb=new JButton("Draw Line");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        countLabel = new JLabel("Click count: 0", SwingConstants.CENTER);
        add(countLabel);
        addMouseListener(this);

        addWindowListener(this);
        setVisible(true);
    }


    

    @Override
    public void mouseClicked(MouseEvent e) {
        clickCount++;
        countLabel.setText("Click count: " + clickCount);
        System.out.println("Frame clicked! Current count: " + clickCount);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
        x1 = e.getX();
        y1 = e.getY();
        System.out.println("X1 cordinate of click is : " + x1 + " And X2 Cordinate of click is : " + x2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        System.out.println("Mouse released");
        System.out.println("Y1 cordinate of click is : " + y1 + " And Y2 Cordinate of click is : " + y2);
        g=getGraphics();
        g.drawLine(x1, y1, x2, y2);
        g.setColor(new Color(0,255,0));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
        System.out.println("Window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }
    public static void main(String[] args) {
        Javaswingdemo  obj = new Javaswingdemo();
   }
}
