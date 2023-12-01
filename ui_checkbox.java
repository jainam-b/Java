import javax.swing.*;
import java.awt.event.*;

public class ui_checkbox extends JFrame implements ActionListener {
    JCheckBox jc, jc1, jc2;
    JButton jb ,jclear ;
    JLabel jl;
    JPanel jp;

    public ui_checkbox(String s) {
        super(s);
        jc = new JCheckBox("C++");
        jc1 = new JCheckBox("Java");
        jc2 = new JCheckBox("Python");
        jl = new JLabel();
        jb = new JButton("Click");
        jclear = new JButton("Clear");
        jp = new JPanel();
        jb.addActionListener(this);
        jclear.addActionListener(this);
        jp.add(jc);
        jp.add(jc1);
        jp.add(jc2);
        jp.add(jb);
        jp.add(jclear);
        jp.add(jl);
        add(jp);
    }
    public  void actionPerformed(ActionEvent ae) {
        String msg="";
        if(jc.isSelected()){
            msg=msg+jc.getText()+",";
        }
        if(jc1.isSelected()){
            msg=msg+jc1.getText()+",";
        }
        if(jc2.isSelected()){
            msg=msg+jc2.getText()+",";
        }
        jl.setText(msg);
    }
    
    // public  void ActionPerformed(ActionEvent ae) {
    //     jl.setText("");
    // }
       

    public static void main(String[] args) {
        JFrame jf=new ui_checkbox("This is CheckBox demo") ;
        jf.setSize(1000, 1000);
        jf.setVisible(true);
    }
}
