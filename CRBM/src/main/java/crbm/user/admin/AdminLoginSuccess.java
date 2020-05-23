package crbm.user.admin;

import crbm.Crbm;
import crbm.room.CreateRoom;
import crbm.room.ViewRoom;
import crbm.user.clerk.AddClerk;
import crbm.user.clerk.DeleteClerk;
import crbm.user.clerk.ViewClerk;
import crbm.utils.ContentPaneUtils;
import crbm.utils.GroupLayoutUtils;

import javax.swing.*;
import java.awt.*;

import static crbm.utils.Constant.*;

public class AdminLoginSuccess extends JFrame {
	private static AdminLoginSuccess adminLoginSuccessFrame;
	private JPanel contentPane;
	/**
	 * Create the adminLoginSuccessFrame.
	 */
	public AdminLoginSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 531);
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
				adminLoginSuccessFrame = new AdminLoginSuccess();
				adminLoginSuccessFrame.getContentPane().setBackground(Color.BLUE);
				adminLoginSuccessFrame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private void addContent(){

		JLabel managerSectionLabel = new JLabel(MANAGER_MENU);
		managerSectionLabel.setFont(new Font(FONT, Font.PLAIN, 22));
		managerSectionLabel.setForeground(Color.GRAY);
		managerSectionLabel.setForeground(Color.WHITE);
		//
		JButton addClerkButton = new JButton(ADD_CLERK);
		addClerkButton.setFont(new Font(FONT, Font.PLAIN, 15));
		addClerkButton.addActionListener(e -> {
			AddClerk.main(new String[]{});
			adminLoginSuccessFrame.dispose();
		});
		addClerkButton.setForeground(Color.RED);
		//
		JButton viewClerkButton = new JButton(VIEW_CLERK);
		viewClerkButton.addActionListener(arg0 -> ViewClerk.main(new String[]{}));
		viewClerkButton.setFont(new Font(FONT, Font.PLAIN, 15));
		viewClerkButton.setForeground(Color.RED);
		//
		JButton deleteClerkButton = new JButton(DELETE_CLERK);
		deleteClerkButton.addActionListener(e -> {
			DeleteClerk.main(new String[]{});
			adminLoginSuccessFrame.dispose();
		});
		deleteClerkButton.setFont(new Font(FONT, Font.PLAIN, 15));
		deleteClerkButton.setForeground(Color.RED);
		//
		JButton addRoomButton = new JButton(ADD_ROOM);
		addRoomButton.addActionListener(e -> {
			CreateRoom.main(new String[]{});
			adminLoginSuccessFrame.dispose();
		});
		addRoomButton.setFont(new Font(FONT, Font.PLAIN, 15));
		addRoomButton.setForeground(Color.RED);
		//
		JButton viewAllRoomsButton = new JButton(VIEW_ALL_ROOMS);
		viewAllRoomsButton.addActionListener(arg0 -> ViewRoom.main(new String[]{}));
		viewAllRoomsButton.setFont(new Font(FONT, Font.PLAIN, 15));
		viewAllRoomsButton.setForeground(Color.RED);
		//
		JButton logoutButton = new JButton(LOGOUT);
		logoutButton.addActionListener(arg0 -> {
			Crbm.main(new String[]{});
			adminLoginSuccessFrame.dispose();
		});
		logoutButton.setFont(new Font(FONT, Font.PLAIN, 15));
		logoutButton.setForeground(Color.RED);
		// Add groupLayout to Pane
		contentPane.setLayout(GroupLayoutUtils.adminLoginSuccessGrpLayout(contentPane, managerSectionLabel, logoutButton, deleteClerkButton, viewClerkButton,
				addClerkButton, addRoomButton, viewAllRoomsButton));
	}
}
