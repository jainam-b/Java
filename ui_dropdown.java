import javax.swing.*;
import java.awt.event.*;

public class ui_dropdown extends JFrame implements ItemListener {
    JComboBox jcb,jcb1,jcb2;
    JLabel jl;
    JPanel jp;

 public ui_dropdown(String s)
  {super(s);
   String arr[]={"Maharashtra","Gujrat","Goa","MP","UP"};
   String arr1[]={"Maharashtra","Gujrat","Goa","MP","UP"};
   String arr2[]={"Maharashtra","Gujrat","Goa","MP","UP"};
    jcb=new JComboBox(arr); jcb.addItemListener(this);
    jcb1=new JComboBox(arr1); jcb1.addItemListener(this);
    jcb2=new JComboBox(arr2); jcb2.addItemListener(this);
    jl=new JLabel();jp=new JPanel(); jp.add(jcb);jp.add(jl);add(jp);
    jp.add(jcb1);
    jp.add(jcb2);
    }

    public void itemStateChanged(ItemEvent ie) {
        String t1 = jcb.getSelectedItem().toString();
        String t2 = jcb1.getSelectedItem().toString();
        String t3 = jcb2.getSelectedItem().toString();
        jl.setText(t1);
        jl.setText(t2);
        jl.setText(t3);
    }

    public static void main(String args[]) {
        JFrame jf = new ui_dropdown("This is Combo Demo");
        jf.setSize(1000, 1000);
        jf.setVisible(true);
    }
}
