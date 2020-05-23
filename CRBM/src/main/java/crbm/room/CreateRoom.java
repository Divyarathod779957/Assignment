package crbm.room;

import crbm.user.admin.AdminLoginSuccess;
import com.github.lgooddatepicker.components.DateTimePicker;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static crbm.utils.Constant.*;

public class CreateRoom extends JFrame {
    private static CreateRoom createRoomFrame;
    private static String roomType[] = {"Auditorium", "CAD-CAM Lab", "Cafeteria", "Chemistry Lab", "Class CreateRoom", "Computer Lab", "Game CreateRoom", "Tutorial Theater", "Physics Lab", "Other Lab", "Video CreateRoom"};
    private static String availableFor[] = {"Holidays", "Term Time", "Weekends"};

    private JPanel contentPane;
    private JTextField roomIdField, nameField, capacityField;
    private JCheckBox checkBox;
    private JComboBox roomTypeField, availableForComboBox;
    private DateTimePicker startDateTimePicker, endDateTimePicker;

    /**
     * Create createRoomFrame.
     */
    public CreateRoom() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(165, 165, 600, 554);
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
                createRoomFrame = new CreateRoom();
                createRoomFrame.getContentPane().setBackground(Color.BLUE);
                createRoomFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        // All components
        roomIdField = new JTextField();
        roomIdField.setColumns(10);
        nameField = new JTextField();
        nameField.setColumns(10);
        capacityField = new JTextField();
        capacityField.setColumns(10);
        startDateTimePicker = new DateTimePicker();
        endDateTimePicker = new DateTimePicker();
        add(startDateTimePicker);
        add(endDateTimePicker);
        roomTypeField = new JComboBox(roomType);
        availableForComboBox = new JComboBox(availableFor);
        checkBox = new JCheckBox();
        checkBox.setBounds(100, 100, 50, 50);
        // All Labels
        JLabel addRoomLabel = new JLabel(ADD_ROOM);
        addRoomLabel.setForeground(Color.WHITE);
        addRoomLabel.setFont(new Font(FONT, Font.PLAIN, 18));
        JLabel roomNoLabel = new JLabel(ROOM_NO);
        roomNoLabel.setForeground(Color.WHITE);
        JLabel nameLabel = new JLabel(NAME);
        nameLabel.setForeground(Color.WHITE);
        JLabel capacityLabel = new JLabel(CAPACITY);
        capacityLabel.setForeground(Color.WHITE);
        JLabel roomTypeLabel = new JLabel(ROOM_TYPE);
        roomTypeLabel.setForeground(Color.WHITE);
        JLabel availableStartDateLabel = new JLabel(AVAILABLE_START_DATE);
        availableStartDateLabel.setForeground(Color.WHITE);
        JLabel availableEndDateLabel = new JLabel(AVAILABLE_END_DATE);
        availableEndDateLabel.setForeground(Color.WHITE);
        JLabel availableForLabel = new JLabel(AVAILABLE_FOR);
        availableForLabel.setForeground(Color.WHITE);
        JLabel availableLabel = new JLabel(IS_AVAILABLE);
        availableLabel.setForeground(Color.WHITE);
        // Buttons
        JButton backButton = new JButton(BACK);
        backButton.addActionListener(e -> {
            AdminLoginSuccess.main(new String[]{});
            createRoomFrame.dispose();
        });
        backButton.setForeground(Color.RED);
        //
        JButton addRoomButton = new JButton(ADD_ROOM);
        addRoomButton.addActionListener(e -> {
            String roomId = roomIdField.getText();
            String name = nameField.getText();
            String capacity = capacityField.getText();
            String roomType = (String) roomTypeField.getSelectedItem();
            LocalDateTime availableFrom = startDateTimePicker.getDateTimePermissive();
            LocalDateTime availableTill = endDateTimePicker.getDateTimePermissive();
            String availableFor = (String) availableForComboBox.getSelectedItem();
            int i = RoomDAO.save(roomId, name, Integer.parseInt(capacity), roomType, Timestamp.valueOf(availableFrom),
                    Timestamp.valueOf(availableTill), availableFor, checkBox.isSelected());
            if (i > 0) {
                JOptionPane.showMessageDialog(CreateRoom.this, ROOM_ADDED);
                AdminLoginSuccess.main(new String[]{});
                createRoomFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(CreateRoom.this, UNABLE_SAVE);
            }
        });
        addRoomButton.setForeground(Color.RED);
        // Set groupLayout to Pane
        contentPane.setLayout(GroupLayoutUtils.createRoomGroupLayout(contentPane, addRoomLabel, nameLabel, roomNoLabel, capacityLabel, roomTypeLabel, availableStartDateLabel, availableEndDateLabel, availableForLabel, availableLabel,
                checkBox, availableForComboBox, endDateTimePicker, startDateTimePicker, roomTypeField, capacityField, nameField, roomIdField, addRoomButton, backButton));
    }

}
