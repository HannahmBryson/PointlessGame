import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.geom.Ellipse2D;

class ScorePanel extends JPanel {


    private static final long serialVersionUID = 1L;
    private static final int FRAME_WIDTH = 250, FRAME_HEIGHT = 650;  // must be even
    //private static final float COL_OFFSET = 52f, ROW_OFFSET = 29f;
    //private static final float COL_SCALE = 26.9f, ROW_SCALE = 27.1f;
    private static final int FONT_SIZE = 25;
    private BufferedImage scoreImage;

    ScorePanel() {
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setBackground(Color.blue);
        /*try {
            scoreImage = ImageIO.read(this.getClass().getResource("scoreBackground.jpg"));
        } catch (IOException ex) {
            System.out.println("Could not find the image file " + ex.toString());
        }*/
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        Graphics2D g3 =(Graphics2D) g;
        g2.drawImage(scoreImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, this);

        int x = 20;
        int y = 81;
        g2.setColor(Color.BLACK);
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(x,y,210,50 );
        g2.fill(ellipse1);

        y = 223;
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(x,y,210,50 );
        g2.fill(ellipse2);

        y = 386;
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(x,y,210,50 );
        g2.fill(ellipse3);

        y = 548;
        Ellipse2D.Double ellipseBlack = new Ellipse2D.Double(x,y,210,50 );
        g2.fill(ellipseBlack);

        x = 93;
        y= 70;
        g3.setColor(Color.WHITE);
        g3.setFont(new Font("Comic Sans", Font.PLAIN, FONT_SIZE));
        g3.drawString("Team 1",x,y);

        y = 213;
        g3.drawString("Team 2",x,y);

        y = 376;
        g3.drawString("Team 3",x,y);

        y = 538;
        g3.drawString("Team 4",x,y);

        x= 125;
        y = 81 + 35;
        g3.drawString("0",x,y);

        y = 223 + 35;
        g3.drawString("0",x,y);

        y = 386 + 35;
        g3.drawString("0",x,y);

        y = 548 + 35;
        g3.drawString("0",x,y);
    }
    public void refresh() {
        revalidate();
        repaint();
    }

}