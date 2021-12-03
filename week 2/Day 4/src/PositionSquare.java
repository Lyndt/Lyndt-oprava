import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws one square
        // Parameters: the x and y coordinates of the square's top left corner and the graphics
        // The function shall draw a 50x50 square from that point
        // Draw 3 squares with that function
        // Avoid code duplication!
        positionSquare(0, 0, graphics);
    }

    public static void positionSquare(int x, int y, Graphics graphics) {

        for (int i = 1; i <= 3; i++) {
            graphics.drawRect(x + (i * 50), y + (i * 50), 50, 50);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }

}