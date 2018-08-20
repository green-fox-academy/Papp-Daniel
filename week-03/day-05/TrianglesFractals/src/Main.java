import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics){
    drawTrianles(graphics);


    }
    public static void drawTrianles (Graphics graphics){
        graphics.drawLine(500,450,550,550);
        graphics.drawLine(550,550,450,550);
        graphics.drawLine(450,550, 500,450);

        graphics.drawLine(475,500,400,500);
        graphics.drawLine(400,500, 437, 450);
        graphics.drawLine(437,450, 475,500);

        graphics.drawLine(525,500,600,500);
        graphics.drawLine(600,500,563,450);
        graphics.drawLine(563,450, 525,500);
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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