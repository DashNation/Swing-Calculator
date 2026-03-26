
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.*;

public class Window {

    private final int width;
    private final int height;
    private final String windowName;
    private final JFrame window;
    private final JPanel windowPanel;

    public Window(String windowName, int windoWidth, int windowHeight) {
        this.width = windoWidth;
        this.height = windowHeight;
        this.windowName = windowName;

        window = new JFrame(windowName);
        window.setSize(windoWidth, windowHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowPanel = new JPanel();
        window.add(windowPanel);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getWindowName() {
        return windowName;
    }

    public JFrame getWindow() {
        return window;
    }

    public JPanel getWindowPanel() {
        return windowPanel;
    }

    public JRootPane getRootPane() {
        return window.getRootPane();
    }

    public void setVisible(boolean isVisible) {
        window.setVisible(isVisible);
    }

    public void setPosition(int x, int y) {
        window.setLocation(x, y);
    }

    public void addComponent(JComponent comp) {
        windowPanel.add(comp);
    }

    public void addComponent(JComponent comp, GridBagConstraints gbc) {
        windowPanel.add(comp, gbc);
    }

    public void update() {
        windowPanel.revalidate();
        windowPanel.repaint();
    }

    public void setBackground(String hexColor) {
        if (hexColor.length() - 1 <= 6) {
            windowPanel.setBackground(Color.decode(hexColor));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }

    public void setTransparent(boolean isTransparent) {
        windowPanel.setOpaque(!isTransparent);
    }

    public void createLineBorder(String hexColor, int thickness) {
        if (hexColor.length() - 1 <= 6) {
            windowPanel.setBorder(BorderFactory.createLineBorder(Color.decode(hexColor), thickness));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }
}
