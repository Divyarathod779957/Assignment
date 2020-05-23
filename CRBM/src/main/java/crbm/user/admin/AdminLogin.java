package crbm.user.admin;

import crbm.Crbm;
import crbm.utils.Constant;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;

import static crbm.utils.Constant.*;

public class AdminLogin extends JFrame {
    private static AdminLogin adminLoginFrame;
    private JPanel contentPane;
    private JTextField userNameField;
    private JPasswordField passwordField;

    public AdminLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(120, 120, 470, 320);
        contentPane = ContentPaneUtils.getContentPane();
        setContentPane(contentPane);
        addInput();
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                adminLoginFrame = new AdminLogin();
                adminLoginFrame.getContentPane().setBackground(Color.BLUE);
                adminLoginFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addInput(){
        // All fields
        userNameField = new JTextField();
        userNameField.setColumns(10);
        passwordField = new JPasswordField();
        // All Labels
        JLabel adminLoginLabel = new JLabel(MANAGER_LOGIN);
        adminLoginLabel.setForeground(Color.WHITE);
        adminLoginLabel.setFont(new Font(FONT, Font.PLAIN, 18));
        JLabel enterNameField = new JLabel(ENTER_NAME);
        enterNameField.setForeground(Color.WHITE);
        JLabel enterPasswordField = new JLabel(ENTER_PASS);
        enterPasswordField.setForeground(Color.WHITE);
        // Back Button
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            Crbm.main(new String[]{});
            adminLoginFrame.dispose();
        });
        backButton.setForeground(Color.RED);

        JButton loginButton = new JButton(LOGIN);
        loginButton.addActionListener(e -> {
            String name=userNameField.getText();
            String password=String.valueOf(passwordField.getPassword());
            if(name.equals(Constant.USER_NAME)&&password.equals(Constant.PASSWORD)){
                AdminLoginSuccess.main(new String[]{});
                adminLoginFrame.dispose();
            }else{
                JOptionPane.showMessageDialog(AdminLogin.this, LOGIN_INVALID,LOGIN_ERROR, JOptionPane.ERROR_MESSAGE);
                userNameField.setText("");
                passwordField.setText("");
            }
        });
        loginButton.setForeground(Color.RED);
        // Add groupLayout to Pane
        contentPane.setLayout(GroupLayoutUtils.adminLoginGrpLayout(contentPane, loginButton, backButton, adminLoginLabel, enterNameField, enterPasswordField, userNameField, passwordField));

    }

}
