import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics){
        // draw a red horizontal line to the center of the canvas
        // draw a green vertical line to the center of the canvas

        for (int i = 25; i <WIDTH; i+= 25) {
            graphics.setColor(Color.green);
            graphics.drawLine(0, i, i,HEIGHT);
        }
        for (int j = 25; j <WIDTH; j+= 25) {
            graphics.setColor(new Color(178,102,255));
            graphics.drawLine(j, 0, WIDTH, j);
        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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