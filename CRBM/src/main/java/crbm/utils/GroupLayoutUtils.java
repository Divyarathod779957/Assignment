package crbm.utils;

import com.github.lgooddatepicker.components.DateTimePicker;

import javax.swing.*;

public class GroupLayoutUtils {

    /**
     * addGrpLayoutForMainApp
     *
     */
    public static GroupLayout addGrpLayoutForMainApp(JPanel contentPane, JLabel camManagementLabel, JButton clerkLoginButton, JButton adminLoginButton){
        // Group Layout Design
        GroupLayout groupLayout = new GroupLayout(contentPane);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(64)
                                                .addComponent(camManagementLabel))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(140)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(clerkLoginButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(adminLoginButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                                .addContainerGap(95, Short.MAX_VALUE))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(camManagementLabel)
                                .addGap(32)
                                .addComponent(adminLoginButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clerkLoginButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE))
        );
        // Set groupLayout to Pane
        return groupLayout;
    }

    /**
     *
     * adminLoginGrpLayout
     *
     */
    public static GroupLayout  adminLoginGrpLayout(JPanel contentPane, JButton loginButton, JButton backButton, JLabel adminLoginLabel, JLabel enterNameField, JLabel enterPasswordField , JTextField userNameField, JPasswordField passwordField){
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(124)
                                                .addComponent(adminLoginLabel))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(19)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(enterNameField)
                                                        .addComponent(enterPasswordField))
                                                .addGap(47)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordField)
                                                        .addComponent(userNameField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(187, Short.MAX_VALUE)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(151))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(187, Short.MAX_VALUE)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(151))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(adminLoginLabel)
                                .addGap(26)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(enterNameField)
                                        .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(enterPasswordField)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        return groupLayout;
    }

    /**
     * adminLoginSuccessGrpLayout
     */
    public static GroupLayout adminLoginSuccessGrpLayout(JPanel contentPane, JLabel managerSectionLabel, JButton logoutButton, JButton deleteClerkButton, JButton viewClerkButton,
                                                  JButton addClerkButton, JButton addRoomButton, JButton viewAllRoomsButton){
        //
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addComponent(managerSectionLabel)
                                .addGap(123))
                        .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                                .addGap(134)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteClerkButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewClerkButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addClerkButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addRoomButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewAllRoomsButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(109, Short.MAX_VALUE))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(managerSectionLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(11)
                                .addComponent(addClerkButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(viewClerkButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(deleteClerkButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(addRoomButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(viewAllRoomsButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        return groupLayout;
    }

    /**
     * addClerkGrpLayout
     *
     */
    public static GroupLayout addClerkGrpLayout(JPanel contentPane, JLabel passwordLabel, JLabel nameLabel, JLabel emailLabel, JLabel addressLabel, JLabel cityLabel, JLabel contactNoLabel,
                                                 JTextField contactField, JTextField cityField, JTextField addressField, JTextField emailField, JTextField nameField, JPasswordField passwordField,
                                                 JLabel addClerkLabel, JButton addClerkButton, JButton backButton){
        // Group layout
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(20)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLabel)
                                        .addComponent(nameLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(addressLabel)
                                        .addComponent(cityLabel)
                                        .addComponent(contactNoLabel))
                                .addGap(58)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(contactField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(cityField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(addressField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(passwordField))
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(151, Short.MAX_VALUE)
                                .addComponent(addClerkLabel)
                                .addGap(144))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(160, Short.MAX_VALUE)
                                .addComponent(addClerkButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addGap(133))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(169))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(addClerkLabel)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(nameLabel)
                                                .addGap(18)
                                                .addComponent(passwordLabel))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLabel)
                                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(addressLabel)
                                        .addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cityLabel)
                                        .addComponent(cityField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(contactNoLabel)
                                        .addComponent(contactField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(addClerkButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(19))
        );
        return groupLayout;
    }

    /**
     * clerkLoginGrpLayout
     *
     */
    public static GroupLayout clerkLoginGrpLayout(JPanel contentPane, JLabel clerkLoginLabel, JLabel enterNameLabel, JLabel enterPasswordLabel,
                                                  JTextField userNameField, JPasswordField passwordField, JButton loginButton, JButton backButton){

        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(124)
                                                .addComponent(clerkLoginLabel))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(19)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(enterNameLabel)
                                                        .addComponent(enterPasswordLabel))
                                                .addGap(47)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordField)
                                                        .addComponent(userNameField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(187, Short.MAX_VALUE)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(151))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(187, Short.MAX_VALUE)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(151))
        );

        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(clerkLoginLabel)
                                .addGap(26)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(enterNameLabel)
                                        .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(enterPasswordLabel)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        return groupLayout;
    }

    /**
     * clerkLoginSuccessGrpLayout
     *
     */
    public static GroupLayout clerkLoginSuccessGrpLayout(JPanel contentPane, JLabel lblClerkSection, JButton logoutButton, JButton cancelBookingButton, JButton viewBookedRoomsButton,
                                                         JButton viewPastBookingRoomsButton, JButton bookRoomButton, JButton viewAllRoomsButton){
        //
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(81, Short.MAX_VALUE)
                                .addComponent(lblClerkSection)
                                .addGap(54))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(132)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelBookingButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewBookedRoomsButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewPastBookingRoomsButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bookRoomButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewAllRoomsButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblClerkSection)
                                .addGap(18)
                                .addComponent(viewAllRoomsButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(bookRoomButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(viewBookedRoomsButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(viewPastBookingRoomsButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(cancelBookingButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        return groupLayout;
    }


    /**
     * deleteClerkGrpLoyout
     *
     */
    public static GroupLayout deleteClerkGrpLoyout(JPanel contentPane, JLabel enterIdLabel, JTextField enterIdField, JButton deleteButton, JButton backButton){
        // Group Layout
        GroupLayout groupLayout = new GroupLayout(contentPane);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(39)
                                .addComponent(enterIdLabel)
                                .addGap(57)
                                .addComponent(enterIdField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(140))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(140))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(19)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(enterIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enterIdLabel))
                                .addGap(33)
                                .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(43)
                                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(43))
        );
        return groupLayout;
    }



    public static GroupLayout createRoomGroupLayout(JPanel contentPane, JLabel addRoomLabel, JLabel nameLabel, JLabel roomNoLabel, JLabel capacityLabel, JLabel roomTypeLabel, JLabel availableStartDateLabel, JLabel availableEndDateLabel, JLabel availableForLabel, JLabel availableLabel,
                                                    JCheckBox checkBox, JComboBox availableForComboBox, DateTimePicker endDateTimePicker, DateTimePicker startDateTimePicker, JComboBox roomTypeField, JTextField capacityField, JTextField nameField, JTextField roomIdField, JButton addRoomButton, JButton backButton){
        // Group layout
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(150)
                                                .addComponent(addRoomLabel))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nameLabel)
                                                        .addComponent(roomNoLabel)
                                                        .addComponent(capacityLabel)
                                                        .addComponent(roomTypeLabel)
                                                        .addComponent(availableStartDateLabel)
                                                        .addComponent(availableEndDateLabel)
                                                        .addComponent(availableForLabel)
                                                        .addComponent(availableLabel))
                                                .addGap(47)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(availableForComboBox, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(endDateTimePicker)
                                                        .addComponent(startDateTimePicker)
                                                        .addComponent(roomTypeField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(capacityField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(roomIdField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(125, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                                .addGap(161)
                                .addComponent(addRoomButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(162, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addContainerGap())
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(addRoomLabel)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(roomNoLabel)
                                        .addComponent(roomIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(capacityLabel)
                                        .addComponent(capacityField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(roomTypeLabel)
                                        .addComponent(roomTypeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(availableStartDateLabel)
                                        .addComponent(startDateTimePicker))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(availableEndDateLabel)
                                        .addComponent(endDateTimePicker))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(availableForLabel)
                                        .addComponent(availableForComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(availableLabel)
                                        .addComponent(checkBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(30)
                                .addComponent(addRoomButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton)
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        return groupLayout;
    }

    public static GroupLayout cancelBookingGrpLayout(JPanel contentPane, JLabel bookingIdLabel, JTextField bookingIdField, JButton cancelBookingButton,  JLabel cancelBookingLabel,
                                                     JLabel noteLabel, JButton backButton){
        GroupLayout groupLayout = new GroupLayout(contentPane);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(36)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bookingIdLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bookingIdField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(139, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(210, Short.MAX_VALUE)
                                .addComponent(cancelBookingButton)
                                .addGap(176))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(205, Short.MAX_VALUE)
                                .addComponent(cancelBookingLabel)
                                .addGap(187))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(19)
                                .addComponent(noteLabel)
                                .addContainerGap(294, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(355, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(46))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cancelBookingLabel)
                                .addGap(32)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookingIdLabel)
                                        .addComponent(bookingIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addComponent(cancelBookingButton)
                                .addGap(23)
                                .addComponent(backButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(noteLabel)
                                .addGap(72)
                                .addComponent(backButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(noteLabel)
                                .addGap(72))
        );

        return groupLayout;
    }

    public static GroupLayout roomBookingGrpLayout(JPanel contentPane, JLabel roomNoLabel, JLabel bookedByLabel, JLabel bookedByLabelGuestId, JLabel bookedGuestAddressLabel, JLabel bookedGuestContactLabel,
                                                   JLabel bookedForLabel, JLabel bookedFromLabel, JLabel bookedToLabel, JLabel bookedReasonLabel, JComboBox roomIdComboBox, JTextField bookedByField, JTextField guestIdField,
                                                   JTextArea guestAddressTextArea, JTextField guestContactField, JTextField bookedForField, DateTimePicker bookedFromDateTime, DateTimePicker bookedToDateTime, JTextArea reasonTextArea,
                                                   JLabel noteLabel, JButton bookRoomButton, JButton backButton, JLabel bookRoomLabel ){
        GroupLayout groupLayout = new GroupLayout(contentPane);
        // Horizontal Group
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(roomNoLabel)
                                                        .addComponent(bookedByLabel)
                                                        .addComponent(bookedByLabelGuestId)
                                                        .addComponent(bookedGuestAddressLabel)
                                                        .addComponent(bookedGuestContactLabel)
                                                        .addComponent(bookedForLabel)
                                                        .addComponent(bookedFromLabel)
                                                        .addComponent(bookedToLabel)
                                                        .addComponent(bookedReasonLabel))
                                                .addGap(8)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(roomIdComboBox, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookedByField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(guestIdField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(guestAddressTextArea, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(guestContactField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookedForField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookedFromDateTime)
                                                        .addComponent(bookedToDateTime)
                                                        .addComponent(reasonTextArea, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
                                                .addGap(45))
                                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                .addGap(15)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(noteLabel)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(bookRoomButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47)
                                                                .addComponent(backButton)))
                                                .addGap(100))))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(146)
                                .addComponent(bookRoomLabel)
                                .addContainerGap(235, Short.MAX_VALUE))
        );
        // Vertical Group
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(34)
                                .addComponent(bookRoomLabel)
                                .addGap(40)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(roomNoLabel)
                                        .addComponent(roomIdComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedByLabel)
                                        .addComponent(bookedByField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedByLabelGuestId)
                                        .addComponent(guestIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedGuestAddressLabel)
                                        .addComponent(guestAddressTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedGuestContactLabel)
                                        .addComponent(guestContactField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedForLabel)
                                        .addComponent(bookedForField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedFromLabel)
                                        .addComponent(bookedFromDateTime))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedToLabel)
                                        .addComponent(bookedToDateTime))
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookedReasonLabel)
                                        .addComponent(reasonTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bookRoomButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backButton))
                                .addGap(18)
                                .addComponent(noteLabel)
                                .addGap(25))
        );
        return groupLayout;
    }
}
