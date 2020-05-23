package crbm.user.clerk;

import crbm.Crbm;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class ClerkLogin extends JFrame {
    private static ClerkLogin clerkLoginFrame;
    private JPanel contentPane;
    private JTextField userNameField;
    private JPasswordField passwordField;
    /**
     * Create the clerkLoginFrame.
     */
    public ClerkLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(120, 120, 450, 300);
        contentPane = ContentPaneUtils.getContentPane();
        setContentPane(contentPane);
        addContent();
    }
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                clerkLoginFrame = new ClerkLogin();
                clerkLoginFrame.getContentPane().setBackground(Color.BLUE);
                clerkLoginFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void addContent(){
        // User Name Box
        userNameField = new JTextField();
        userNameField.setColumns(10);
        //
        passwordField = new JPasswordField();
        //
        JLabel clerkLoginLabel = new JLabel(CLERK_LOGIN);
        clerkLoginLabel.setForeground(Color.WHITE);
        clerkLoginLabel.setFont(new Font(FONT, Font.PLAIN, 18));
        //
        JLabel enterNameLabel = new JLabel(ENTER_NAME);
        enterNameLabel.setForeground(Color.WHITE);
        JLabel enterPasswordLabel = new JLabel(ENTER_PASS);
        enterPasswordLabel.setForeground(Color.WHITE);

        // Back
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            Crbm.main(new String[]{});
            clerkLoginFrame.dispose();
        });
        backButton.setForeground(Color.RED);
        //
        JButton loginButton = new JButton(LOGIN);
        loginButton.addActionListener(e -> {
            String name=userNameField.getText();
            String password=String.valueOf(passwordField.getPassword());
            if(ClerkDAO.validate(name, password)){
                ClerkLoginSuccess.main(new String[]{});
                clerkLoginFrame.dispose();
            }else{
                JOptionPane.showMessageDialog(ClerkLogin.this, LOGIN_INVALID,LOGIN_ERROR, JOptionPane.ERROR_MESSAGE);
                userNameField.setText("");
                passwordField.setText("");
            }
        });
        loginButton.setForeground(Color.RED);
        // Add Group layout to Pane
        contentPane.setLayout(GroupLayoutUtils.clerkLoginGrpLayout(contentPane, clerkLoginLabel, enterNameLabel, enterPasswordLabel, userNameField, passwordField, loginButton, backButton));
    }

}
