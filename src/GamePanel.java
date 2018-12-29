import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.*;

class GamePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int FRAME_WIDTH = 900, FRAME_HEIGHT = 500;  // must be even
    private static final float COL_OFFSET = 52f, ROW_OFFSET = 29f;
    private static final float COL_SCALE = 26.9f, ROW_SCALE = 27.1f;

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
        g2.drawImage(gameImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, this);

    }

    public void refresh() {
        revalidate();
        repaint();
    }

}