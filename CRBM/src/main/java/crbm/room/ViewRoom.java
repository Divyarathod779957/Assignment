package crbm.room;

import crbm.utils.ConnectionUtils;
import crbm.utils.ContentPaneUtils;
import crbm.utils.QueryConstant;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ViewRoom extends JFrame {
    private JPanel contentPane;
    private JTable table;
    /**
     * Create the frame.
     */
    public ViewRoom() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 850, 400);
        contentPane = ContentPaneUtils.getContentPane();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        addContent();
    }
    //
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ViewRoom viewRoomFrame = new ViewRoom();
                viewRoomFrame.getContentPane().setBackground(Color.BLUE);
                viewRoomFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void addContent(){
        String data[][] = null;
        String column[] = null;
        try {
            Connection connection = ConnectionUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstant.ROOM_SELECT, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int cols = resultSetMetaData.getColumnCount();
            column = new String[cols];
            for (int i = 1; i <= cols; i++) {
                column[i - 1] = resultSetMetaData.getColumnName(i);
            }
            resultSet.last();
            int rows = resultSet.getRow();
            resultSet.beforeFirst();
            data = new String[rows][cols];
            int count = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= cols; i++) {
                    data[count][i - 1] = resultSet.getString(i);
                }
                count++;
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        table = new JTable(data, column);
        table.setForeground(Color.WHITE);
        table.setBackground(Color.BLUE);
        table.getTableHeader().setBackground(Color.BLUE);
        table.getTableHeader().setForeground(Color.WHITE);
        JScrollPane sp = new JScrollPane(table);
        contentPane.add(sp, BorderLayout.CENTER);
    }
}
