import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Draw at least 3 lines with that function using a loop
        theQuest(50, 50, graphics);
    }

    private static void theQuest(int x, int y, Graphics graphics) {
        for (int a = 0; a < 15; a++){
            graphics.drawLine(x, y + (a * 20), WIDTH / 2, HEIGHT / 2);
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