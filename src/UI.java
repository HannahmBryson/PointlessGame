import java.awt.BorderLayout;
import javax.swing.*;

public class UI {

    private static final int FRAME_WIDTH = 1200;
    private static final int FRAME_HEIGHT = 800;

    private final GamePanel gamePanel;
    private final InfoPanel infoPanel = new InfoPanel();
    private final CommandPanel commandPanel = new CommandPanel();
    private final ScorePanel scorePanel = new ScorePanel();

    UI() {
        JFrame frame = new JFrame();
        gamePanel = new GamePanel();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Pointless");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(gamePanel, BorderLayout.LINE_START);
        frame.add(infoPanel, BorderLayout.LINE_END);
        frame.add(commandPanel,BorderLayout.PAGE_END);
        frame.add (scorePanel, BorderLayout.EAST)
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public String getCommand() {
        return commandPanel.getCommand();
    }

    public void display() {
        gamePanel.refresh();
    }

    public void displayString(String string) {
        infoPanel.addText(string);
}
