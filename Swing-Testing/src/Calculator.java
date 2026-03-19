
import java.util.*;
import javax.swing.JTextField;

public class Calculator {

    private boolean hasDotBeenPressed = false;
    private final List<Float> values;
    private final List<String> operators;

    public Calculator() {
        values = new ArrayList<>();
        operators = new ArrayList<>();
    }

    public boolean isHasDotBeenPressed() {
        return hasDotBeenPressed;
    }

    public void addValueToNumDisplay(Object value, JTextField numDisplay) {
        if (this.hasDotBeenPressed && value.equals(".")) {
            return;
        }
        if (value.equals("+") || value.equals("-") || value.equals("x") || value.equals("÷")) {
            this.hasDotBeenPressed = false;
        }
        String currentValue = numDisplay.getText();
        String newValue = currentValue + value;
        System.out.println(newValue);
        numDisplay.setText(newValue);
        if (value.equals(".")) {
            this.hasDotBeenPressed = true;
        }
    }

    public void clear(JTextField numDisplay) {
        this.hasDotBeenPressed = false;
        numDisplay.setText("");
    }

    public void delete(JTextField numDisplay) {
        String value = numDisplay.getText();
        if (value != null && value.length() > 0) {
            value = value.substring(0, value.length() - 1);
            numDisplay.setText(value);
        }
    }

    public void calculate() {
        this.hasDotBeenPressed = false;
    }
}
