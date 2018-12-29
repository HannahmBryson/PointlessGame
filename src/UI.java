import java.awt.BorderLayout;
import javax.swing.*;

public class UI {

    private static final int FRAME_WIDTH = 1366, FRAME_HEIGHT = 700;

    private final GamePanel gamePanel = new GamePanel();
    private final InfoPanel infoPanel = new InfoPanel();
    private final CommandPanel commandPanel = new CommandPanel();
    private final ScorePanel scorePanel = new ScorePanel();

    UI() {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Pointless");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(scorePanel, BorderLayout.LINE_START);
        frame.add(gamePanel, BorderLayout.CENTER);
       frame.add(infoPanel, BorderLayout.LINE_END);
        frame.add(commandPanel,BorderLayout.PAGE_END);
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
