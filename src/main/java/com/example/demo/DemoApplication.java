import javax.swing.*;
import java.awt.*;

public class DwightGifApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Dwight Schrute GIF");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel textLabel = new JLabel("Identity Theft Is Not A Joke!");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textLabel, BorderLayout.NORTH);

        ImageIcon dwightGifIcon = new ImageIcon("https://media.tenor.com/R8Ot9SBUktQAAAAC/dwight-schrute-the-office.gif");
        JLabel gifLabel = new JLabel(dwightGifIcon);
        gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(gifLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}