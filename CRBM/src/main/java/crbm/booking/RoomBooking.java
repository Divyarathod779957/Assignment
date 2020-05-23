package crbm.booking;

import crbm.user.clerk.ClerkLoginSuccess;
import com.github.lgooddatepicker.components.DateTimePicker;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import static crbm.utils.Constant.*;

public class RoomBooking extends JFrame {
    private static RoomBooking roomBookingFrame;
    private JPanel contentPane;
    private JTextField bookedByField, guestIdField, guestContactField, bookedForField;
    private JTextArea guestAddressTextArea, reasonTextArea;
    private DateTimePicker bookedFromDateTime, bookedToDateTime;
    private JComboBox roomIdComboBox;
    /**
     * Create the roomBookingFrame.
     */
    public RoomBooking() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 80, 638, 714);
        contentPane = ContentPaneUtils.getContentPane();
        setContentPane(contentPane);
        addContent();
    }
    /**
     * Launch application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                roomBookingFrame = new RoomBooking();
                roomBookingFrame.getContentPane().setBackground(Color.BLUE);
                roomBookingFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        // all components
        bookedByField = new JTextField();
        bookedByField.setColumns(10);
        guestIdField = new JTextField();
        guestIdField.setColumns(10);
        guestAddressTextArea = new JTextArea(3, 20);
        guestAddressTextArea.setColumns(10);
        guestContactField = new JTextField();
        guestContactField.setColumns(10);
        bookedForField = new JTextField();
        bookedForField.setColumns(10);
        reasonTextArea = new JTextArea(4, 20);
        reasonTextArea.setColumns(10);
        bookedFromDateTime = new DateTimePicker();
        bookedToDateTime = new DateTimePicker();
        add(bookedFromDateTime);
        add(bookedToDateTime);
        //
        List<String> availableRooms = BookingDAO.getAvilableRooms();
        if (0 == availableRooms.size()) {
            JOptionPane.showMessageDialog(RoomBooking.this, PLS_ADD_ROOMS);
            ClerkLoginSuccess.main(new String[]{});
            roomBookingFrame.dispose();
        }
        roomIdComboBox = new JComboBox(availableRooms.toArray());
        // All Labels
        JLabel bookRoomLabel = new JLabel(BOOK_ROME);
        bookRoomLabel.setFont(new Font(FONT, Font.PLAIN, 16));
        bookRoomLabel.setForeground(Color.WHITE);
        JLabel roomNoLabel = new JLabel(ROOM_NO);
        roomNoLabel.setForeground(Color.WHITE);
        JLabel bookedByLabel = new JLabel(BOOKED_BY);
        bookedByLabel.setForeground(Color.WHITE);
        JLabel bookedByLabelGuestId = new JLabel(BOOKED_GUEST_ID);
        bookedByLabelGuestId.setForeground(Color.WHITE);
        JLabel bookedGuestAddressLabel = new JLabel(BOOKED_GUEST_ADDRESS);
        bookedGuestAddressLabel.setForeground(Color.WHITE);
        JLabel bookedGuestContactLabel = new JLabel(BOOKED_GUEST_CONTACT);
        bookedGuestContactLabel.setForeground(Color.WHITE);
        JLabel bookedForLabel = new JLabel(BOOKED_FOR);
        bookedForLabel.setForeground(Color.WHITE);
        JLabel bookedFromLabel = new JLabel(FROM);
        bookedFromLabel.setForeground(Color.WHITE);
        JLabel bookedToLabel = new JLabel(TO);
        bookedToLabel.setForeground(Color.WHITE);
        JLabel bookedReasonLabel = new JLabel(REASON);
        bookedReasonLabel.setForeground(Color.WHITE);
        // Back
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            ClerkLoginSuccess.main(new String[]{});
            roomBookingFrame.dispose();
        });
        backButton.setForeground(Color.RED);
        // Button and Action
        JButton bookRoomButton = new JButton(BOOK_ROME);
        bookRoomButton.addActionListener(e -> {
            String roomId = (String) roomIdComboBox.getSelectedItem();
            String bookedBy = bookedByField.getText();
            String guestId = guestIdField.getText();
            String guestAddress = guestAddressTextArea.getText();
            String guestContact = guestContactField.getText();
            String bookedFor = bookedForField.getText();
            LocalDateTime bookedFrom = bookedFromDateTime.getDateTimePermissive();
            LocalDateTime bookedTo = bookedToDateTime.getDateTimePermissive();
            String reason = reasonTextArea.getText();
            if (BookingDAO.validateBooking1(Timestamp.valueOf(bookedFrom), roomId)
                    && BookingDAO.validateBooking2(Timestamp.valueOf(bookedFrom), roomId)) {
                int i = BookingDAO.save(roomId, bookedBy, guestId, guestAddress, guestContact, bookedFor, Timestamp.valueOf(bookedFrom), Timestamp.valueOf(bookedTo), reason);
                if (i > 0) {
                    JOptionPane.showMessageDialog(RoomBooking.this, ROOM_SUCCESS);
                    ClerkLoginSuccess.main(new String[]{});
                    roomBookingFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(RoomBooking.this, UNABLE_RO_BOOK_ROOM);
                }//end of save if-else
            }else{
                JOptionPane.showMessageDialog(RoomBooking.this, OVER_LAP_BOOK_ROOM);
            }
        });
        bookRoomButton.setForeground(Color.RED);
        //
        JLabel noteLabel = new JLabel(CHECK_GUEST);
        noteLabel.setFont(new Font(FONT, Font.PLAIN, 13));
        noteLabel.setForeground(Color.RED);
        // Add  groupLayout to contentPane
        contentPane.setLayout(GroupLayoutUtils.roomBookingGrpLayout(contentPane, roomNoLabel, bookedByLabel, bookedByLabelGuestId, bookedGuestAddressLabel, bookedGuestContactLabel, bookedForLabel,
                bookedFromLabel, bookedToLabel, bookedReasonLabel, roomIdComboBox, bookedByField, guestIdField, guestAddressTextArea, guestContactField, bookedForField,
                bookedFromDateTime, bookedToDateTime, reasonTextArea, noteLabel, bookRoomButton, backButton, bookRoomLabel));
    }

}
