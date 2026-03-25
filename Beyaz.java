import java.awt.*;
import javax.swing.*;

public class beyaz extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Gül yaprakları
        g2d.setColor(Color.WHITE);
        drawPetal(g2d, 200, 200, 100, 0);
        drawPetal(g2d, 200, 200, 90, 45);
        drawPetal(g2d, 200, 200, 80, 90);
        drawPetal(g2d, 200, 200, 70, 135);
        drawPetal(g2d, 200, 200, 60, 180);
        drawPetal(g2d, 200, 200, 50, 225);
        drawPetal(g2d, 200, 200, 40, 270);
        drawPetal(g2d, 200, 200, 30, 315);
        
        // Gülün merkezi
        g2d.fillOval(190, 190, 20, 20);
    }

    private void drawPetal(Graphics2D g2d, int x, int y, int size, int angle) {
        g2d.rotate(Math.toRadians(angle), x, y);
        g2d.fillOval(x - size / 2, y - size / 2, size, size);
        g2d.rotate(Math.toRadians(-angle), x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Beyaz Gül");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new beyaz());
        frame.setVisible(true);
    }
}
