
import java.awt.*;
import javax.swing.*;

public class Button {

    private String text;
    private int width;
    private int height;
    private final JButton button;
    private Runnable onClick;

    public Button(String text, int btnWidth, int btnHeight) {
        this.text = text;
        this.width = btnHeight;
        this.height = btnHeight;

        button = new JButton(text);
        button.setPreferredSize(new Dimension(btnWidth, btnHeight));
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        button.setFocusPainted(false);

        setBackground("#201927");
        setLineBorder("#b980ff", 3);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public JButton getButton() {
        return button;
    }

    public Runnable getOnClick() {
        return onClick;
    }

    public void onClick(Runnable onClick) {
        this.onClick = onClick;
        button.addActionListener(e -> {
            if (onClick == null) {
                return;
            }

            onClick.run();
        });
    }

    public void setPosition(int x, int y) {
        button.setLocation(x, y);
    }

    public void setBorderPainted(boolean isBorderActive) {
        if (isBorderActive) {
            button.setBorderPainted(isBorderActive);
        } else {
            button.setBorderPainted(isBorderActive);
        }
    }

    public void setBackground(String hexColor) {
        button.setBackground(Color.decode(hexColor));
    }

    public void setForeground(String hexColor) {
        button.setContentAreaFilled(false);
        button.setForeground(Color.decode(hexColor));
    }

    public void setLineBorder(String hexColor, int thickness) {
        if (hexColor.length() - 1 <= 6) {
            if (thickness == 0) {
                thickness = 0;
            }
            button.setForeground(Color.decode(hexColor));
            button.setBorder(BorderFactory.createLineBorder(Color.decode(hexColor), thickness));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }

    public void padding(int top, int left, int bottom, int right) {
        button.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }
}
