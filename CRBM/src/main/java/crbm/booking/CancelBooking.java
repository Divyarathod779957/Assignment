package crbm.booking;

import crbm.user.clerk.ClerkLoginSuccess;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class CancelBooking extends JFrame {
    private static CancelBooking cancelBookingFrame;
    private JPanel contentPane;
    private JTextField bookingIdField;
    /**
     * Create the cancelBookingFrame.
     */
    public CancelBooking() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(110, 110, 516, 300);
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
                cancelBookingFrame = new CancelBooking();
                cancelBookingFrame.getContentPane().setBackground(Color.BLUE);
                cancelBookingFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        //
        bookingIdField = new JTextField();
        bookingIdField.setColumns(10);
        //
        JLabel cancelBookingLabel = new JLabel(CANCEL_BOOKING);
        cancelBookingLabel.setForeground(Color.WHITE);
        cancelBookingLabel.setFont(new Font(FONT, Font.PLAIN, 18));

        JLabel bookingIdLabel = new JLabel(BOOKING_ID);
        bookingIdLabel.setForeground(Color.WHITE);
        //
        JButton cancelBookingButton = new JButton(CANCEL_BOOKING);
        cancelBookingButton.addActionListener(e -> {
            String bookingId = bookingIdField.getText();
            int i = BookingDAO.delete(bookingId);
            if (i > 0) {
                JOptionPane.showMessageDialog(CancelBooking.this, BOOKING_CANCEL_SUCCESS);
                ClerkLoginSuccess.main(new String[]{});
                cancelBookingFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(CancelBooking.this, SORRY_UNABLE_TO_CANCEL);
            }
        });
        cancelBookingButton.setForeground(Color.RED);
        //
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            ClerkLoginSuccess.main(new String[]{});
            cancelBookingFrame.dispose();
        });
        backButton.setForeground(Color.RED);
        //
        JLabel noteLabel = new JLabel(BEFORE_CANCEL);
        noteLabel.setForeground(Color.RED);
        noteLabel.setFont(new Font(FONT, Font.PLAIN, 13));
        // Set groupLayout to pane
        contentPane.setLayout(GroupLayoutUtils.cancelBookingGrpLayout(contentPane, bookingIdLabel, bookingIdField, cancelBookingButton, cancelBookingLabel,
                noteLabel, backButton));
    }
}
