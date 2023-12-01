import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberConversionApp extends JFrame implements ActionListener {
    private JRadioButton decimalInputRadio, binaryInputRadio, hexInputRadio, octalInputRadio;
    private JRadioButton decimalOutputRadio, binaryOutputRadio, hexOutputRadio, octalOutputRadio;
    private ButtonGroup inputFormatGroup, outputFormatGroup;
    private JLabel inputLabel, resultLabel;
    private JTextField inputField;
    private JButton convertButton;

    public NumberConversionApp() {
        setTitle("Number Conversion");
        setLayout(new FlowLayout());
        

        // Input format radio buttons
        inputFormatGroup = new ButtonGroup();
        decimalInputRadio = new JRadioButton("Decimal");
        binaryInputRadio = new JRadioButton("Binary");
        hexInputRadio = new JRadioButton("Hexadecimal");
        octalInputRadio = new JRadioButton("Octal");

        inputFormatGroup.add(decimalInputRadio);
        inputFormatGroup.add(binaryInputRadio);
        inputFormatGroup.add(hexInputRadio);
        inputFormatGroup.add(octalInputRadio);

        // Output format radio buttons
        outputFormatGroup = new ButtonGroup();
        decimalOutputRadio = new JRadioButton("Decimal");
        binaryOutputRadio = new JRadioButton("Binary");
        hexOutputRadio = new JRadioButton("Hexadecimal");
        octalOutputRadio = new JRadioButton("Octal");

        outputFormatGroup.add(decimalOutputRadio);
        outputFormatGroup.add(binaryOutputRadio);
        outputFormatGroup.add(hexOutputRadio);
        outputFormatGroup.add(octalOutputRadio);

        inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(15);
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("");

        convertButton.addActionListener(this);

        add(new JLabel("Input Format:"));
        add(decimalInputRadio);
        add(binaryInputRadio);
        add(hexInputRadio);
        add(octalInputRadio);

        add(new JLabel("Output Format:"));
        add(decimalOutputRadio);
        add(binaryOutputRadio);
        add(hexOutputRadio);
        add(octalOutputRadio);

        add(inputLabel);
        add(inputField);
        add(convertButton);
        add(resultLabel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == convertButton) {
            String input = inputField.getText().trim();
            if (!input.isEmpty()) {
                int number;
                int base = 10; // Default to decimal input

                if (binaryInputRadio.isSelected()) {
                    base = 2;
                } else if (hexInputRadio.isSelected()) {
                    base = 16;
                } else if (octalInputRadio.isSelected()) {
                    base = 8;
                }

                try {
                    number = Integer.parseInt(input, base);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                    return;
                }

                if (decimalOutputRadio.isSelected()) {
                    resultLabel.setText("Result (Decimal): " + number);
                } else if (binaryOutputRadio.isSelected()) {
                    resultLabel.setText("Result (Binary): " + Integer.toBinaryString(number));
                } else if (hexOutputRadio.isSelected()) {
                    resultLabel.setText("Result (Hexadecimal): " + Integer.toHexString(number).toUpperCase());
                } else if (octalOutputRadio.isSelected()) {
                    resultLabel.setText("Result (Octal): " + Integer.toOctalString(number));
                } else {
                    resultLabel.setText("Please select an output format.");
                }
            }
        }
    }

    public static void main(String[] args) {
        {
               JFrame jf = new NumberConversionApp ();
               jf.setVisible(true);
               jf.setSize(1000, 1000);
           }
   }
}
