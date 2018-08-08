import java.util.Random;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.magenta};

        int[] sizes = {20, 40, 60, 70};

        for (int i = 0; i < 4; i++){
            drawSquare(graphics,colors[i],sizes[i],WIDTH, HEIGHT);
        }

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.



    }
    public static void drawSquare ( Graphics graphics, Color colors, int sizes, int WIDTH, int HEIGHT) {
        graphics.setColor(colors);
        graphics.drawRect(WIDTH/2, HEIGHT/2, sizes, sizes);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}