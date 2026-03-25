
import java.util.*;
import javax.swing.JTextField;

public class Calculator {

    private boolean hasDotBeenPressed = false;
    private final List<String> values;

    public Calculator() {
        values = new ArrayList<>();
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
        values.add(String.valueOf(value));
        String currentValue = numDisplay.getText();
        String newValue = currentValue + value;
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

    public void readArrayLists() {
        System.out.println("--Values-Arraylist--");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i));
        }
    }

    public void calculateResult() {
        System.out.println("Calculate Result:");
        for (int i = 0; i < values.size(); i++) {
            try {
                float num = Float.parseFloat(values.get(i));
                System.out.println("Float: " + values.get(i));
            } catch (Exception e) {
                System.out.println(values.get(i));
            }
        }
    }
}
