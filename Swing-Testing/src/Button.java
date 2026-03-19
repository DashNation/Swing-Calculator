
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

}
