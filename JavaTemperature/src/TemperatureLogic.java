import java.awt.event.*;

public class TemperatureLogic implements ActionListener, KeyListener {

    TemperatureGUI gui;

    TemperatureLogic(TemperatureGUI gui) {
        this.gui = gui;
        gui.convertButton.addActionListener(this);
        gui.textField.addKeyListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gui.convertButton) {
            try {
                double celsius = Double.parseDouble(gui.textField.getText());

                double fahrenheit = (celsius * 9 / 5) + 32;

                gui.resultLabel.setText(String.format("%.2f°F", fahrenheit));

            } catch (NumberFormatException ex) {

                gui.resultLabel.setText("Invalid input");
            }
        }
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            e.consume();
        }
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
}