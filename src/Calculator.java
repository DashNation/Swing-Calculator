
import java.text.DecimalFormat;
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
        if (this.hasDotBeenPressed && value.equals(",")) {
            return;
        }
        if (value.equals("+") || value.equals("-") || value.equals("x") || value.equals("÷")) {
            this.hasDotBeenPressed = false;
        }
        if (value.equals(",") && values.isEmpty()) {
            values.add(String.valueOf(0));
            values.add(String.valueOf("."));
        } else {
            values.add(String.valueOf(value));
        }
        String currentValue = numDisplay.getText();
        String newValue = currentValue + value;
        numDisplay.setText(newValue);
        if (value.equals(",")) {
            this.hasDotBeenPressed = true;
        }

        readArrayLists();
    }

    public void clear(JTextField numDisplay) {
        this.hasDotBeenPressed = false;
        values.clear();
        numDisplay.setText("");
    }

    public void delete(JTextField numDisplay) {
        String value = numDisplay.getText();
        if (value != null && value.length() > 0) {
            value = value.substring(0, value.length() - 1);
            values.clear();
            values.add(value);
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
        System.out.println(" ");
    }

    public void invertNumber(JTextField numDisplay) {
        if (!isFloat(numDisplay.getText())) {
            System.out.println("Invalid invert value!");
            return;
        }
        String textValue = numDisplay.getText();
        float numValue = Float.parseFloat(textValue);
        numValue = -numValue;

        String operator = numValue >= 0 ? "" : "-";
        float absValue = Math.abs(numValue);
        DecimalFormat df = new DecimalFormat("0.#");
        String result = df.format(absValue);

        int valuesLength = values.size() - 1;

        readArrayLists();

        values.set(valuesLength, operator);
        values.add(result);

        numDisplay.setText(operator + result);

        readArrayLists();
    }

    public void calculateResult(JTextField numDisplay) {
        List<String> numbers = new ArrayList<>();
        List<String> equation = new ArrayList<>();

        System.out.println("Calculate Result:");
        for (int i = 0; i < values.size(); i++) {
            String val = values.get(i);
            val = val.replaceAll(",", ".");
            if (val.matches("[0-9.]")) {
                numbers.add(val);
                System.out.println("Float: " + val);
            } else {
                if (!numbers.isEmpty()) {
                    String number = String.join("", numbers);
                    System.out.println("NumberGroup: " + Float.valueOf(number));
                    equation.add(number);
                    numbers.clear();
                }
                System.out.println(val);
                equation.add(val);
            }
        }

        if (!numbers.isEmpty()) {
            String number = String.join("", numbers);
            System.out.println("NumberGroup: " + Float.valueOf(number));
            equation.add(number);
            numbers.clear();
        }

        float result = 0;
        String operator = "";

        DecimalFormat df = new DecimalFormat("0.#");
        for (int j = 0; j < equation.size(); j++) {
            String token = equation.get(j);
            if (token.matches("[0-9.]+")) {
                float num = Float.parseFloat(token);
                if (operator.isEmpty()) {
                    result = num;
                } else {
                    switch (operator) {
                        case "+":
                            result += num;
                            break;
                        case "-":
                            result -= num;
                            break;
                        case "x":
                            result *= num;
                            break;
                        case "÷":
                            result /= num;
                            break;
                    }
                    operator = ""; // Operator zurücksetzen
                }
            } else { // Operator
                operator = token;
            }
        }

        System.out.println("Result: " + result);
        numDisplay.setText(String.valueOf(df.format(result)));
    }

    private boolean isFloat(String str) {
        if (str == null) {
            return false;
        }
        try {
            Float.valueOf(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
