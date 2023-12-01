import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileCopyApp extends JFrame {
    private JButton copyButton;
    private JTextField source;
    private JTextField destination;
    private JTextArea textArea;

    public FileCopyApp() {
        super("File Copy App");
        
        setSize(400, 200);

        source = new JTextField(20);
        destination = new JTextField(20);
        textArea = new JTextArea(6, 30);
        copyButton = new JButton("Copy File");

        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                copyFile();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Source File:"));
        panel.add(source);
        panel.add(new JLabel("Destination File:"));
        panel.add(destination);
        panel.add(copyButton);

        add(panel,BorderLayout.NORTH);
        add(textArea);
    }

    private void copyFile() {
        String sourceFile = source.getText();
        String destinationFile = destination.getText();

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            textArea.setText("File copied successfully.");
        } catch (IOException e) {
            textArea.setText("Error copying the file.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FileCopyApp app = new FileCopyApp();
            app.setVisible(true);
        });
    }
}
