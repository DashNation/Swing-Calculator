
import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int windowWidth = 500;
        int windowHeight = 600;
        Window window = new Window("Grid Test", windowWidth, windowHeight);
        Layout gridbag = new Layout("gridbag");
        window.getWindowPanel().setLayout(gridbag.getLayout());
        GridBagConstraints gbc = gridbag.createGridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 2;
        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        TextField numDisplay = new TextField("", window.getWidth(), 100, false);
        window.addComponent(numDisplay.getTextField(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button cBtn = new Button("C", 50, 50);
        window.addComponent(cBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button invertBtn = new Button("+/-", 50, 50);
        window.addComponent(invertBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button percentBtn = new Button("%", 50, 50);
        window.addComponent(percentBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button dividetBtn = new Button("÷", 50, 50);
        window.addComponent(dividetBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button sevenBtn = new Button("7", 50, 50);
        window.addComponent(sevenBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button eightBtn = new Button("8", 50, 50);
        window.addComponent(eightBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button nineBtn = new Button("9", 50, 50);
        window.addComponent(nineBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button multiBtn = new Button("X", 50, 50);
        window.addComponent(multiBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button fourBtn = new Button("4", 50, 50);
        window.addComponent(fourBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button fiveBtn = new Button("5", 50, 50);
        window.addComponent(fiveBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button sixBtn = new Button("6", 50, 50);
        window.addComponent(sixBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button subBtn = new Button("-", 50, 50);
        window.addComponent(subBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button oneBtn = new Button("1", 50, 50);
        window.addComponent(oneBtn.getButton(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button twoBtn = new Button("2", 50, 50);
        window.addComponent(twoBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button threeBtn = new Button("3", 50, 50);
        window.addComponent(threeBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button addBtn = new Button("+", 50, 50);
        window.addComponent(addBtn.getButton(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button zeroBtn = new Button("0", 50, 50);
        window.addComponent(zeroBtn.getButton(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button dotBtn = new Button(".", 50, 50);
        window.addComponent(dotBtn.getButton(), gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        Button equalBtn = new Button("=", 50, 50);
        window.addComponent(equalBtn.getButton(), gbc);

        window.setVisible(true);
    }
}
