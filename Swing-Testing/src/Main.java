
import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int windowWidth = 500;
        int windowHeight = 600;
        Window window = new Window("Grid Test", windowWidth, windowHeight);
        Layout gridbag = new Layout("gridbag");
        window.getWindowPanel().setLayout(gridbag.getLayout());
        GridBagConstraints gbc = gridbag.createGridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        Button button = new Button("1", 50, 50);
        window.addComponent(button.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        Button button2 = new Button("2", 50, 50);
        window.addComponent(button2.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Button button3 = new Button("3", 50, 50);
        window.addComponent(button3.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        Label label = new Label("GridBagLayout works!", 100, 100);
        window.addComponent(label.getLabel(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        Label label2 = new Label(":D", 100, 100);
        window.addComponent(label2.getLabel(), gbc);

        window.setVisible(true);
    }
}
