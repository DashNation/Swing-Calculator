
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class TextField {

    private String text;
    private int width;
    private int height;
    private final JTextField textField;
    private Font font;
    private int fontSize;
    private boolean isEditable;

    public TextField(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;

        textField = new JTextField(text);
        textField.setPreferredSize(new Dimension(width, height));
    }

    public TextField(String text, int width, int height, boolean isEditable) {
        this.text = text;
        this.width = width;
        this.height = height;
        this.isEditable = isEditable;

        textField = new JTextField(text);
        textField.setPreferredSize(new Dimension(width, height));
        textField.setEditable(isEditable);
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

    public JTextField getTextField() {
        return textField;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setFontSize(int fontSize) {
        font = new Font("Arial", Font.PLAIN, fontSize);
        textField.setFont(new Font("Arial", Font.PLAIN, fontSize));
        this.fontSize = fontSize;
    }

    public void setFontStyle(String style) {
        style = style.toLowerCase();
        switch (style) {
            case "bold":
                font = new Font("Arial", Font.BOLD, this.fontSize);
                textField.setFont(font);
                break;
            case "italic":
                font = new Font("Arial", Font.ITALIC, this.fontSize);
                textField.setFont(font);
                break;
            case "plain":
                font = new Font("Arial", Font.PLAIN, this.fontSize);
                textField.setFont(font);
                break;
            default:
                font = new Font("Arial", Font.PLAIN, this.fontSize);
                textField.setFont(font);
                System.out.println("Style from \"" + textField.getText() + "\" Was not found!");
                break;
        }
    }

    public void setLocation(int x, int y) {
        textField.setLocation(x, y);
    }
}
