import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.*;

class GamePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int FRAME_WIDTH = 900, FRAME_HEIGHT = 650;  // must be even
    private static final int FONT_SIZE = 25;

    private BufferedImage gameImage;

    GamePanel() {
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        try {
            gameImage = ImageIO.read(this.getClass().getResource("gameBackground.jpg"));
        } catch (IOException ex) {
            System.out.println("Could not find the image file " + ex.toString());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        Graphics2D g3 =(Graphics2D) g;
        Graphics2D q =(Graphics2D) g;
        g2.drawImage(gameImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, this);
        int x = 50;
        int y = 150;

        g2.setColor(Color.black);
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(x,y,800,50 );
        g2.fill(ellipse1);

        y = 250;
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(x,y,800,50 );
        g2.fill(ellipse2);

        y = 350;
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(x,y,800,50 );
        g2.fill(ellipse3);

        y = 450;
        Ellipse2D.Double ellipseBlack = new Ellipse2D.Double(x,y,800,50 );
        g2.fill(ellipseBlack);

        y = 550;
        Ellipse2D.Double ellipse4 = new Ellipse2D.Double(x,y,800,50 );
        g2.fill(ellipse4);
        x= 600;
        y= 40;
        g3.setColor(Color.YELLOW);
        g3.setFont(new Font("Comic Sans", Font.PLAIN, FONT_SIZE));
        g3.drawString("LOGO",50, y);
        g3.drawString("MUSIC",x,y);
        x= 700;
        g3.drawString("Round One",x,y);

        x= 150;
        y = 150+ 35;
        g3.drawString("DTKIC",x,y);

        y = 250+ 35;
        g3.drawString("LTC",x,y);

        y = 350 + 35;
        g3.drawString("MAW",x,y);

        y = 450 + 35;
        g3.drawString("WACIB",x,y);

        y = 550 + 35;
        g3.drawString("CA",x,y);

        x= 450;
        y = 150+ 35;
        g3.drawString("34",x,y);

        y = 250+ 35;
        g3.drawString("9",x,y);

        y = 350 + 35;
        g3.drawString("29",x,y);

        y = 450 + 35;
        g3.drawString("29",x,y);

        y = 550 + 35;
        g3.drawString("24",x,y);

        x= 500;
        y = 150+ 35;
        g3.drawString("Do They Know It's Christmas ",x,y);

        y = 250+ 35;
        g3.drawString("Lonely This Christmas",x,y);

        y = 350 + 35;
        g3.drawString("Mistletoe And Wine ",x,y);

        y = 450 + 35;
        g3.drawString("When A Child Is Born",x,y);

        y = 550 + 35;
        g3.drawString("Christmas Alphabet",x,y);

        x=250;
        //y=70;
        //g3.drawString("CHRISTMAS NO.1 SINGLES",x,y);

        y=100;
        q.setColor(Color.WHITE);
        q.setFont(new Font("Comic Sans", Font.PLAIN, 30));
        q.drawString("Chrismas No.1 songs from their initals.",x,y);
    }

    void refresh() {
        revalidate();
        repaint();
    }

}