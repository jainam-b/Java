import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocationHierarchyApp extends JFrame {
    private JComboBox<String> countryComboBox;
    private JComboBox<String> stateComboBox;
    private JComboBox<String> cityComboBox;

    private String[] countries = {"Select Country", "USA", "Canada", "India"};
    private String[][] states = {
        {"Select State"},
        {"Select State", "New York", "California", "Texas"},
        {"Select State", "Ontario", "Quebec", "British Columbia"},
        {"Select State", "Maharashtra", "Karnataka", "Tamil Nadu"}
    };
    private String[][] cities = {
        {"Select City"},
        {"Select City", "New York City", "Los Angeles", "Houston"},
        {"Select City", "Toronto", "Montreal", "Vancouver"},
        {"Select City", "Mumbai", "Bangalore", "Chennai"}
    };

    public LocationHierarchyApp() {
        setTitle("Location Hierarchy");
        setSize(500, 500);
        setLayout(new FlowLayout());

        countryComboBox = new JComboBox<>(countries);
        stateComboBox = new JComboBox<>(states[0]);
        cityComboBox = new JComboBox<>(cities[0]);

        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedCountryIndex = countryComboBox.getSelectedIndex();
                stateComboBox.setModel(new DefaultComboBoxModel<>(states[selectedCountryIndex]));
                cityComboBox.setModel(new DefaultComboBoxModel<>(cities[0]));
            }
        });

        stateComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedStateIndex = stateComboBox.getSelectedIndex();
                cityComboBox.setModel(new DefaultComboBoxModel<>(cities[selectedStateIndex]));
            }
        });

        add(new JLabel("Country:"));
        add(countryComboBox);
        add(new JLabel("State:"));
        add(stateComboBox);
        add(new JLabel("City:"));
        add(cityComboBox);

         
        setVisible(true);
    }

    public static void main(String[] args) {
         
            new LocationHierarchyApp();
       
    }
}
