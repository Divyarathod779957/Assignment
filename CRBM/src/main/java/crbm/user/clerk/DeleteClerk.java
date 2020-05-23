package crbm.user.clerk;

import crbm.user.admin.AdminLoginSuccess;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class DeleteClerk extends JFrame {
    private static DeleteClerk deleteClerkFrame;
    private JPanel contentPane;
    private JTextField enterIdField;
    /**
     * Create the deleteClerkFrame.
     */
    public DeleteClerk() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
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
                deleteClerkFrame = new DeleteClerk();
                deleteClerkFrame.getContentPane().setBackground(Color.BLUE);
                deleteClerkFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        enterIdField = new JTextField();
        enterIdField.setColumns(10);

        JLabel enterIdLabel = new JLabel(ENTER_ID);
        enterIdLabel.setForeground(Color.WHITE);
        // Delete Button
        JButton deleteButton = new JButton(DELETE);
        deleteButton.addActionListener(e -> {
            String sid = enterIdField.getText();
            if (sid == null || sid.trim().equals("")) {
                JOptionPane.showMessageDialog(DeleteClerk.this, ID_NOT_NULL);
            } else {
                if (ClerkDAO.delete(Integer.parseInt(sid)) > 0) {
                    JOptionPane.showMessageDialog(DeleteClerk.this, CLERK_DELETE_SUCCESS);
                    AdminLoginSuccess.main(new String[]{});
                    deleteClerkFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(DeleteClerk.this, UNABLE_TO_DELETE);
                }
            }
        });
        deleteButton.setFont(new Font(FONT, Font.PLAIN, 13));
        deleteButton.setForeground(Color.RED);
        // Back Button
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            AdminLoginSuccess.main(new String[]{});
            deleteClerkFrame.dispose();
        });
        backButton.setFont(new Font(FONT, Font.PLAIN, 13));
        backButton.setForeground(Color.RED);
        // Add Group layout to Pane
        contentPane.setLayout(GroupLayoutUtils.deleteClerkGrpLoyout(contentPane, enterIdLabel, enterIdField, deleteButton, backButton));
    }

}
