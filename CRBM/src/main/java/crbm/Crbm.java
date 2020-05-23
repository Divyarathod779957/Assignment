package crbm;

import crbm.user.clerk.ClerkLogin;
import crbm.user.admin.AdminLogin;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class Crbm extends JFrame {
    private static Crbm crbmFrame;
    private JPanel contentPane;
    /**
     * Create frame.
     */
    public Crbm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = ContentPaneUtils.getContentPane();
        setContentPane(contentPane);
        addContent();
    }
    /**
     * Launch the CRBM App.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                crbmFrame = new Crbm();
                crbmFrame.getContentPane().setBackground(Color.MAGENTA);
                crbmFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("Application is Launched!!");
    }

    public void addContent(){
        //
        JLabel camManagementLabel = new JLabel(TITLE);
        camManagementLabel.setFont(new Font(FONT, Font.PLAIN, 18));
        camManagementLabel.setForeground(Color.WHITE);
        //
        JButton adminLoginButton = new JButton(MANAGER_LOGIN);
        adminLoginButton.addActionListener(e -> {
            AdminLogin.main(new String[]{});
            crbmFrame.dispose();
        });
        adminLoginButton.setFont(new Font(FONT, Font.PLAIN, 15));
        adminLoginButton.setForeground(Color.RED);

        JButton clerkLoginButton = new JButton(CLERK_LOGIN);
        clerkLoginButton.addActionListener(arg0 -> {
            ClerkLogin.main(new String[]{});
            crbmFrame.dispose();
        });
        clerkLoginButton.setFont(new Font(FONT, Font.PLAIN, 15));
        clerkLoginButton.setForeground(Color.RED);

        // Set group Layout to Pane
        contentPane.setLayout(GroupLayoutUtils.addGrpLayoutForMainApp(contentPane, camManagementLabel, adminLoginButton, clerkLoginButton));
    }

}
