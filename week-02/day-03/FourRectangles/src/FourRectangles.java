import java.util.Random;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){

        Random rect = new Random();



        for (int i = 0; i <4; i++){

            int x = rect.nextInt(230)+0;
            int y = rect.nextInt(343)+0;
            int w = rect.nextInt(320)+0;
            int h = rect.nextInt(343)+0;

            drawRectangles(graphics, x,  y,  h,  w);


        }
        // draw four different size and color rectangles.
        // avoid code duplication.


    }
    public static void drawRectangles (Graphics graphics, int x, int y, int h, int w) {
        graphics.drawRect(x,y,w,h);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}