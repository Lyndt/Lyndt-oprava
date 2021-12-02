import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge

        graphics.setColor(Color.red);
        graphics.drawLine(20,20,40,20);
        graphics.setColor(Color.green);
        graphics.drawLine(40, 20, 40, 40);
        graphics.setColor(Color.orange);
        graphics.drawLine(40, 40, 20, 40);
        graphics.setColor(Color.pink);
        graphics.drawLine(20, 40, 20, 20);



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