import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class File extends JFrame {
    private JTextArea textArea;
    private JButton readButton;
    private JButton writeButton;

    public File() {
        super("  File Read and Write");
         
        setSize(400, 300);

        textArea = new JTextArea(10, 30);
        readButton = new JButton("Read File");
        writeButton = new JButton("Write to File");

        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileReader fr = new FileReader("Input.txt");
                    int i;
                    while ((i = fr.read()) != -1) {
                        textArea.append(String.valueOf((char) i));
                    }
                    fr.close();
                } catch (IOException ex) {
                    textArea.setText("Error reading the file");
                }
            }
        });

        writeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("Output.txt");
                    fw.write(textArea.getText());
                    fw.close();
                    textArea.setText("File writing done successfully");
                } catch (IOException ex) {
                    textArea.setText("Error writing the file");
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(readButton);
        buttonPanel.add(writeButton);

        add( textArea );
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            File app = new File();
            app.setVisible(true);
        });
    }
}

