import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("MemeSnake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
