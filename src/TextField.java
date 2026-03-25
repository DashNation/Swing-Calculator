
import java.awt.Color;
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
        setBackground("#201927");
        setForeground("#b980ff");
        disableBorder(true);
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

    public int getFontSize() {
        return fontSize;
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

    public boolean isEditable() {
        return isEditable;
    }

    public void setEditable(boolean isEditable) {
        this.isEditable = isEditable;
    }

    public void setBackground(String hexColor) {
        if (hexColor.length() - 1 <= 6) {
            textField.setBackground(Color.decode(hexColor));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }

    public void setForeground(String hexColor) {
        if (hexColor.length() - 1 <= 6) {
            textField.setForeground(Color.decode(hexColor));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }

    public void setLineBorder(String hexColor, int thickness) {
        if (hexColor.length() - 1 <= 6) {
            if (thickness == 0) {
                thickness = 0;
            }
            textField.setForeground(Color.decode(hexColor));
            textField.setBorder(BorderFactory.createLineBorder(Color.decode(hexColor), thickness));
        } else {
            System.out.println("HexCode needs to have a maxmimum character amount of 6");
        }
    }

    public void padding(int top, int left, int bottom, int right) {
        textField.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }

    public void disableBorder(boolean isDisabled) {
        if (isDisabled) {
            textField.setBorder(BorderFactory.createEmptyBorder());
        }
    }
}
