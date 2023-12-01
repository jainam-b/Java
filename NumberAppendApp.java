import javax.swing.*;
import java.awt.event.*;

public class NumberAppendApp extends JFrame implements ActionListener {
    JTextField inputNum1, inputNum2;
    JPanel jp;
    JButton add, num1;
    JLabel result;

    public NumberAppendApp(String s) {
        // Initialize
        inputNum1 = new JTextField(10);
        inputNum2 = new JTextField(10);
        jp = new JPanel();
        add = new JButton("+");
        num1 = new JButton("1");
        result = new JLabel();
        // JPanel
        jp.add(inputNum1);
        jp.add(inputNum2);
        jp.add(add);
        jp.add(num1);
        jp.add(result);
        add(jp);

        // ActionListener for the "+" button
        add.addActionListener(this);

        // ActionListener for the "1" button
        for(int i =1 ; i<=9;i++){
            int number = i;
            JButton add = new JButton(Integer.toString(i));
            num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                inputNum1.setText(String.valueOf(number));
                // inputNum1.setText( number);
                
            }
        });
        jp.add(add);
        }

        
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(inputNum1.getText());
        int num2 = Integer.parseInt(inputNum2.getText());
        int res = num1 + num2;
        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        JFrame calculator = new NumberAppendApp("Calculator");
        calculator.setVisible(true);
        calculator.setSize(500, 200);
    }
}
