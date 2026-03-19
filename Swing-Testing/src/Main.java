
public class Main {

    public static void main(String[] args) throws Exception {
        Window window = new Window("window", 500, 600);

        TextField textField = new TextField("Test", window.getWidth() - 100, 50, false);
        textField.setFontSize(30);
        textField.setFontStyle("bold");
        window.addComponent(textField.getTextField());

        TextField textField2 = new TextField("Test", window.getWidth() - 100, 50);
        textField2.setFontSize(30);
        textField2.setFontStyle("italic");
        window.addComponent(textField2.getTextField());

        TextField textField3 = new TextField("Test", window.getWidth() - 100, 50);
        textField3.setFontSize(30);
        textField3.setFontStyle("plaint");
        window.addComponent(textField3.getTextField());

        Button button = new Button("Click Me!", 200, 50);
        button.onClick(() -> {
            textField.getTextField().setText("buttonClick");
            textField2.getTextField().setText("buttonClick");
            textField3.getTextField().setText("buttonClick");
        });
        window.addComponent(button.getButton());

        Layout flowLayout = new Layout("flow");
        window.getWindowPanel().setLayout(flowLayout.getLayout());

        Label label = new Label("TestLabel", 100, 50);
        window.addComponent(label.getLabel());

        window.setVisible(true);

    }
}
