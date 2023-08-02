import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class IdentityTheftApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Identity Theft Is Not A Joke!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JLabel textLabel = new JLabel("Identity Theft Is Not A Joke!");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textLabel, BorderLayout.NORTH);

        try {
            URL imageUrl = new URL("https://i.ytimg.com/vi/25n1rfB3F20/maxresdefault.jpg");
            Image image = ImageIO.read(imageUrl);
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            frame.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}