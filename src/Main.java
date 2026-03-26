
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int windowWidth = 500;
        int windowHeight = 600;
        Window window = new Window("Swing Calculator", windowWidth, windowHeight);
        Layout gridbag = new Layout("gridbag");
        window.getWindowPanel().setLayout(gridbag.getLayout());
        GridBagConstraints gbc = gridbag.createGridBagConstraints();
        Calculator calculator = new Calculator();

        //Gettingh maps for key bindings
        InputMap im = window.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = window.getRootPane().getActionMap();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        // gbc.gridheight = 2;
        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        TextField numDisplay = new TextField("", window.getWidth(), 100, false);
        numDisplay.setFontSize(50);
        numDisplay.getTextField().setHorizontalAlignment(JTextField.RIGHT);
        window.addComponent(numDisplay.getTextField(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button cBtn = new Button("C", 50, 50);
        cBtn.onClick(() -> {
            calculator.clear(numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "clear");
        am.put("clear", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.clear(numDisplay.getTextField());
            }
        });

        window.addComponent(cBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button deleteBtn = new Button("←", 50, 50);
        deleteBtn.onClick(() -> {
            calculator.delete(numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "delete");
        am.put("delete", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.delete(numDisplay.getTextField());
            }
        });

        window.addComponent(deleteBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button invertBtn = new Button("-/+", 50, 50);
        invertBtn.onClick(() -> {
            calculator.invertNumber(numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_I, 0), "invert");
        am.put("invert", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.invertNumber(numDisplay.getTextField());
            }
        });

        window.addComponent(invertBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button divideBtn = new Button("÷", 50, 50);
        divideBtn.onClick(() -> {
            calculator.addValueToNumDisplay("÷", numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('/'), "divide");
        am.put("divide", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("÷", numDisplay.getTextField());
            }
        });

        window.addComponent(divideBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button sevenBtn = new Button("7", 50, 50);
        sevenBtn.onClick(() -> {
            calculator.addValueToNumDisplay(7, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('7'), "7");
        am.put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(7, numDisplay.getTextField());
            }
        });

        window.addComponent(sevenBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button eightBtn = new Button("8", 50, 50);
        eightBtn.onClick(() -> {
            calculator.addValueToNumDisplay(8, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('8'), "8");
        am.put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(8, numDisplay.getTextField());
            }
        });

        window.addComponent(eightBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button nineBtn = new Button("9", 50, 50);
        nineBtn.onClick(() -> {
            calculator.addValueToNumDisplay(9, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('9'), "9");
        am.put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(9, numDisplay.getTextField());
            }
        });

        window.addComponent(nineBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button multiBtn = new Button("x", 50, 50);
        multiBtn.onClick(() -> {
            calculator.addValueToNumDisplay("x", numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('*'), "multi");
        am.put("multi", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("x", numDisplay.getTextField());
            }
        });

        window.addComponent(multiBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button fourBtn = new Button("4", 50, 50);
        fourBtn.onClick(() -> {
            calculator.addValueToNumDisplay(4, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('4'), "4");
        am.put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(4, numDisplay.getTextField());
            }
        });

        window.addComponent(fourBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button fiveBtn = new Button("5", 50, 50);
        fiveBtn.onClick(() -> {
            calculator.addValueToNumDisplay(5, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('5'), "5");
        am.put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(5, numDisplay.getTextField());
            }
        });

        window.addComponent(fiveBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button sixBtn = new Button("6", 50, 50);
        sixBtn.onClick(() -> {
            calculator.addValueToNumDisplay(6, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('6'), "6");
        am.put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(6, numDisplay.getTextField());
            }
        });

        window.addComponent(sixBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button subBtn = new Button("-", 50, 50);
        subBtn.onClick(() -> {
            calculator.addValueToNumDisplay("-", numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('-'), "minus");
        am.put("minus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("-", numDisplay.getTextField());
            }
        });

        window.addComponent(subBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button oneBtn = new Button("1", 50, 50);
        oneBtn.onClick(() -> {
            calculator.addValueToNumDisplay(1, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('1'), "1");
        am.put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("1", numDisplay.getTextField());
            }
        });

        window.addComponent(oneBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button twoBtn = new Button("2", 50, 50);
        twoBtn.onClick(() -> {
            calculator.addValueToNumDisplay(2, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('2'), "2");
        am.put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("2", numDisplay.getTextField());
            }
        });

        window.addComponent(twoBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button threeBtn = new Button("3", 50, 50);
        threeBtn.onClick(() -> {
            calculator.addValueToNumDisplay(3, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('3'), "3");
        am.put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("3", numDisplay.getTextField());
            }
        });

        window.addComponent(threeBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button addBtn = new Button("+", 50, 50);
        addBtn.onClick(() -> {
            calculator.addValueToNumDisplay("+", numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('+'), "add");
        am.put("add", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("+", numDisplay.getTextField());
            }
        });

        window.addComponent(addBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button zeroBtn = new Button("0", 50, 50);
        zeroBtn.onClick(() -> {
            calculator.addValueToNumDisplay(0, numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke('0'), "0");
        am.put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay("0", numDisplay.getTextField());
            }
        });

        window.addComponent(zeroBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button dotBtn = new Button(",", 50, 50);
        dotBtn.onClick(() -> {
            calculator.addValueToNumDisplay(",", numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke(','), ",");
        am.put(",", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.addValueToNumDisplay(",", numDisplay.getTextField());
            }
        });

        window.addComponent(dotBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button equalBtn = new Button("=", 50, 50);
        equalBtn.onClick(() -> {
            System.out.println("Equals was been pressed!");
            // calculator.readArrayLists();
            calculator.calculateResult(numDisplay.getTextField());
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "equal");
        am.put("equal", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Equals was been pressed!");
                // calculator.readArrayLists();
                calculator.calculateResult(numDisplay.getTextField());
            }
        });

        window.addComponent(equalBtn.getButton(), gbc);

        window.setBackground("#000");
        window.setVisible(true);
        window.getRootPane().requestFocus();
    }
}
