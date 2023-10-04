import javax.swing.*;
import java.awt.event.*;

public class user_input extends JFrame implements ActionListener {
    JTextField jtf, jtf1, jtf2;
    JButton jb, jb1, jb2, jb3, n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, ndot, temp;
    JPanel jp;

    public user_input(String s) {
        super(s);
        jtf = new JTextField(10);
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        // Button
        jb = new JButton("Add");
        jb1 = new JButton("Sub");
        jb2 = new JButton("Mul");
        jb3 = new JButton("Div");

        // Numbers
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        n0 = new JButton("0");
        ndot = new JButton(".");
        temp = new JButton("");

        jp = new JPanel();
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb.addActionListener(this);
        // number
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n0.addActionListener(this);
        ndot.addActionListener(this);
        temp.addActionListener(this);

        jp.add(jtf);
        jp.add(jtf1);
        jp.add(jtf2);
        jp.add(jb);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        add(jp);

        // number
        jp.add(n1);
        jp.add(n2);
        jp.add(n3);
        jp.add(n4);
        jp.add(n5);
        jp.add(n6);
        jp.add(n7);
        jp.add(n8);
        jp.add(n9);
        jp.add(n0);
        jp.add(ndot);

    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(jtf.getText());
        int b = Integer.parseInt(jtf1.getText());
        int temporary = Integer.parseInt(temp.getText());

        int c = 0;
        if (ae.getSource() == jb) {
            c = a + b;
        }
        if (ae.getSource() == jb1) {
            c = a - b;
        }
        if (ae.getSource() == jb2) {
            c = a * b;
        }
        if (ae.getSource() == jb3) {
            c = a / b;
        }
        if (ae.getSource() == n1) {
            temp = n1;
        }

        jtf2.setText(String.valueOf(c));
        jtf1.setText(String.valueOf(temporary));
    }

    public static void main(String args[]) {
        JFrame jf = new user_input("This is text demo");
        jf.setSize(300, 150);
        jf.setVisible(true); // Set visibility to true
    }
}
