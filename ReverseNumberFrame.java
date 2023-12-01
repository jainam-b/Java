import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberFrame extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public ReverseNumberFrame(String s) {
        super(s);
        
        textField = new JTextField(10);
        reverseButton = new JButton("Reverse");
        resultLabel = new JLabel();

        // Add action listener to the button
        reverseButton.addActionListener(this);

        JPanel jp = new JPanel();
        jp.add(textField);
        jp.add(reverseButton);
        jp.add(resultLabel);

        add(jp);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == reverseButton) {
             String inputText = textField.getText();
            String reversedText = new StringBuilder(inputText).reverse().toString();
            resultLabel.setText("Reversed: " + reversedText);} }

    public static void main(String[] args) {
         {
                JFrame jf = new ReverseNumberFrame("Reverse Number");
                jf.setVisible(true);
                jf.setSize(1000, 1000);
            }
    }
}
