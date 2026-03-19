
import java.awt.*;
import javax.swing.*;

public class Label {

    private String text;
    private int width;
    private int height;
    private final JLabel label;
    private Font font;
    private int fontSize;

    public Label(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;

        label = new JLabel(text);
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

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setPosition(int x, int y) {
        label.setLocation(x, y);
    }

    public void setFontSize(int fontSize) {
        font = new Font("Arial", Font.PLAIN, fontSize);
        label.setFont(new Font("Arial", Font.PLAIN, fontSize));
        this.fontSize = fontSize;
    }

    public void setFontStyle(String style) {
        style = style.toLowerCase();
        switch (style) {
            case "bold":
                font = new Font("Arial", Font.BOLD, this.fontSize);
                label.setFont(font);
                break;
            case "italic":
                font = new Font("Arial", Font.ITALIC, this.fontSize);
                label.setFont(font);
                break;
            case "plain":
                font = new Font("Arial", Font.PLAIN, this.fontSize);
                label.setFont(font);
                break;
            default:
                font = new Font("Arial", Font.PLAIN, this.fontSize);
                label.setFont(font);
                System.out.println("Style from \"" + label.getText() + "\" Was not found!");
                break;
        }
    }
}
