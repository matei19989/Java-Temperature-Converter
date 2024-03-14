import javax.swing.*;
import java.awt.*;

public class TemperatureGUI {
    JFrame frame;
    JTextField textField;
    JLabel resultLabel;
    JButton convertButton;

    Font myFont = new Font("Times New Roman", Font.PLAIN, 30);

    TemperatureGUI() {

        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setResizable(false);

        textField = new JTextField("Please enter degree in Celsius");
        resultLabel = new JLabel("Degrees in Fahrenheit");

        convertButton = new JButton("Convert");

        frame.add(textField);
        frame.add(resultLabel);
        frame.add(convertButton);

        textField.setBounds(50, 20, 250, 30);

        convertButton.setBounds(310, 20, 80, 30);

        resultLabel.setBounds(50, 80, 340, 30);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(myFont);

        frame.setVisible(true);
    }
}