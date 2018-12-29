import java.awt.BorderLayout;
import javax.swing.*;

public class UI {

    private static final int FRAME_WIDTH = 1150, FRAME_HEIGHT = 550;

    private final GamePanel gamePanel = new GamePanel();
    private final InfoPanel infoPanel = new InfoPanel();
    private final CommandPanel commandPanel = new CommandPanel();
    private final ScorePanel scorePanel = new ScorePanel();

    UI() {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Pointless");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(gamePanel, BorderLayout.WEST);
        frame.add(scorePanel, BorderLayout.EAST);
        frame.add(infoPanel, BorderLayout.SOUTH);
        frame.add(commandPanel,BorderLayout.SOUTH);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public String getCommand() {
        return commandPanel.getCommand();
    }

    public void display() {
        gamePanel.refresh();
        scorePanel.refresh();
    }

    public void displayString(String string) {
        infoPanel.addText(string);
    }
}
