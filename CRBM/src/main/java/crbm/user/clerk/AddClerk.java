package crbm.user.clerk;

import crbm.user.admin.AdminLoginSuccess;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class AddClerk extends JFrame {
    static AddClerk addClerkFrame;
    private JPanel contentPane;
    private JTextField nameField, emailField, addressField, cityField, contactField;
    private JPasswordField passwordField;
    /**
     * Create the addClerkFrame.
     */
    public AddClerk() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = ContentPaneUtils.getContentPane();
        setContentPane(contentPane);
        addContent();
    }
    /**
     * Launch the clerk app.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                addClerkFrame = new AddClerk();
                addClerkFrame.getContentPane().setBackground(Color.BLUE);
                addClerkFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        // All Fields
        nameField = new JTextField();
        nameField.setColumns(10);
        emailField = new JTextField();
        emailField.setColumns(10);
        addressField = new JTextField();
        addressField.setColumns(10);
        cityField = new JTextField();
        cityField.setColumns(10);
        contactField = new JTextField();
        contactField.setColumns(10);
        passwordField = new JPasswordField();
        // All Labels
        JLabel addClerkLabel = new JLabel(ADD_CLERK);
        addClerkLabel.setForeground(Color.WHITE);
        addClerkLabel.setFont(new Font(FONT, Font.PLAIN, 22));
        JLabel nameLabel = new JLabel(NAME);
        nameLabel.setForeground(Color.WHITE);
        JLabel passwordLabel = new JLabel(PASS);
        passwordLabel.setForeground(Color.WHITE);
        JLabel emailLabel = new JLabel(EMAIL);
        emailLabel.setForeground(Color.WHITE);
        JLabel addressLabel = new JLabel(ADDRESS);
        addressLabel.setForeground(Color.WHITE);
        JLabel cityLabel = new JLabel(CITY);
        cityLabel.setForeground(Color.WHITE);
        JLabel contactNoLabel = new JLabel(CONTACT_NO);
        contactNoLabel.setForeground(Color.WHITE);
        // Back Button
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            AdminLoginSuccess.main(new String[]{});
            addClerkFrame.dispose();
        });
        backButton.setForeground(Color.RED);
        // Add buttons
        JButton addClerkButton = new JButton(ADD_CLERK);
        addClerkButton.addActionListener(e -> {
            String name = nameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            String email = emailField.getText();
            String address = addressField.getText();
            String city = cityField.getText();
            String contact = contactField.getText();
            int i = ClerkDAO.save(name, password, email, address, city, contact);
            if (i > 0) {
                JOptionPane.showMessageDialog(AddClerk.this, CLERK_SUCCESS);
                AdminLoginSuccess.main(new String[]{});
                addClerkFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(AddClerk.this, UNABLE_SAVE);
            }
        });
        addClerkButton.setForeground(Color.RED);
        // Set groupLayout to Pane
        contentPane.setLayout(GroupLayoutUtils.addClerkGrpLayout(contentPane, passwordLabel, nameLabel, emailLabel, addressLabel, cityLabel, contactNoLabel,
                contactField, cityField, addressField, emailField, nameField, passwordField, addClerkLabel,
                addClerkButton, backButton));
    }
}
