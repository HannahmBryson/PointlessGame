import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.*;

class ScorePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int FRAME_WIDTH = 750, FRAME_HEIGHT = 750;  // must be even
    private static final float COL_OFFSET = 52f, ROW_OFFSET = 29f;
    private static final float COL_SCALE = 26.9f, ROW_SCALE = 27.1f;

    private BufferedImage scoreImage;

    ScorePanel() {
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setBackground(Color.WHITE);
        try {
            scoreImage = ImageIO.read(this.getClass().getResource("scoreBackground.jpg"));
        } catch (IOException ex) {
            System.out.println("Could not find the image file " + ex.toString());
        }
    }

    public void refresh() {
        revalidate();
        repaint();
    }

}