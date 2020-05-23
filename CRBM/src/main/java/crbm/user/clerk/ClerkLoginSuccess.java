package crbm.user.clerk;


import crbm.Crbm;
import crbm.booking.RoomBooking;
import crbm.booking.CancelBooking;
import crbm.booking.ViewBookings;
import crbm.booking.ViewHistoryBookings;
import crbm.room.ViewRoom;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class ClerkLoginSuccess extends JFrame {
    private static ClerkLoginSuccess clerkLoginSuccessFame;
    private JPanel contentPane;
    /**
     * Create the clerkLoginSuccessFame.
     */
    public ClerkLoginSuccess() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 450, 473);
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
                clerkLoginSuccessFame = new ClerkLoginSuccess();
                clerkLoginSuccessFame.getContentPane().setBackground(Color.BLUE);
                clerkLoginSuccessFame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        //
        JLabel lblClerkSection = new JLabel(TITLE);
        lblClerkSection.setFont(new Font(FONT, Font.PLAIN, 22));
        lblClerkSection.setForeground(Color.WHITE);
        //
        JButton viewAllRoomsButton = new JButton(VIEW_ALL_ROOMS);
        viewAllRoomsButton.addActionListener(arg0 -> ViewRoom.main(new String[]{}));
        viewAllRoomsButton.setFont(new Font(FONT, Font.PLAIN, 13));
        viewAllRoomsButton.setForeground(Color.RED);
        //
        JButton bookRoomButton = new JButton(BOOK_ROME);
        bookRoomButton.addActionListener(e -> {
            RoomBooking.main(new String[]{});
            clerkLoginSuccessFame.dispose();
        });
        bookRoomButton.setFont(new Font(FONT, Font.PLAIN, 13));
        bookRoomButton.setForeground(Color.RED);
        //
        JButton viewBookedRoomsButton = new JButton(VIEW_BOOKINGS);
        viewBookedRoomsButton.addActionListener(e -> ViewBookings.main(new String[]{}));
        viewBookedRoomsButton.setFont(new Font(FONT, Font.PLAIN, 13));
        viewBookedRoomsButton.setForeground(Color.RED);
        //
        JButton viewPastBookingRoomsButton = new JButton(VIEW_HISTORY_BOOKINGS);
        viewPastBookingRoomsButton.addActionListener(e -> ViewHistoryBookings.main(new String[]{}));
        viewPastBookingRoomsButton.setFont(new Font(FONT, Font.PLAIN, 13));
        viewPastBookingRoomsButton.setForeground(Color.RED);
        //
        JButton cancelBookingButton = new JButton(CANCEL_BOOKINGS);
        cancelBookingButton.addActionListener(e -> {
            CancelBooking.main(new String[]{});
            clerkLoginSuccessFame.dispose();
        });
        cancelBookingButton.setFont(new Font(FONT, Font.PLAIN, 13));
        cancelBookingButton.setForeground(Color.RED);
        //
        JButton logoutButton = new JButton(LOGOUT);
        logoutButton.addActionListener(e -> {
            Crbm.main(new String[]{});
            clerkLoginSuccessFame.dispose();
        });
        logoutButton.setFont(new Font(FONT, Font.PLAIN, 13));
        logoutButton.setForeground(Color.RED);

        // Add groupLayout to contentPane
        contentPane.setLayout(GroupLayoutUtils.clerkLoginSuccessGrpLayout(contentPane, lblClerkSection, logoutButton,
                cancelBookingButton, viewBookedRoomsButton, viewPastBookingRoomsButton, bookRoomButton, viewAllRoomsButton));
    }


}
