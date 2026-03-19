
import javax.swing.JTextField;

public class Calculator {

    public Calculator() {

    }

    public void addValueToNumDisplay(Object value, JTextField numDisplay) {
        String currentValue = numDisplay.getText();
        String newValue = currentValue + value;
        System.out.println(newValue);
        numDisplay.setText(newValue);
    }

    public void clear(JTextField numDisplay) {
        numDisplay.setText("");
    }

    public void delete(JTextField numDisplay) {
        String value = numDisplay.getText();
        if (value != null && value.length() > 0) {
            value = value.substring(0, value.length() - 1);
            numDisplay.setText(value);
        }
    }
}
