import javax.swing.*;

public class frame_1 extends JFrame {
    JLabel name, address, email;
    JPanel jp;

    public frame_1(String s) {
        super(s);
        name = new JLabel("Name: Jainam Bagrecha");
        address = new JLabel("Address: Gujarat");
        email = new JLabel("Email: jainam@gmail.com");
        jp = new JPanel();
        jp.add(name);
        jp.add(address);
        jp.add(email);
        add(jp);
    }

    public static void main(String[] args) {
        JFrame ob = new frame_1("Frame");
        ob.setSize(300, 150); // Adjusted the size for better visibility
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added this line to close the window properly
        ob.setVisible(true);
    }
}
