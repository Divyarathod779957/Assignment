package crbm.user.clerk;

import crbm.utils.ConnectionUtils;
import crbm.utils.ContentPaneUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import static crbm.utils.QueryConstant.USER_SELECT;

public class ViewClerk extends JFrame {
    private JPanel contentPane;
    private JTable table;
    /**
     * Create the frame.
     */
    public ViewClerk() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(110, 130, 1000, 300);
        contentPane = ContentPaneUtils.getContentPane();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        addContent();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ViewClerk viewClerkFrame = new ViewClerk();
                viewClerkFrame.getContentPane().setBackground(Color.BLUE);
                viewClerkFrame.setVisible(true);
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
            PreparedStatement preparedStatement = connection.prepareStatement(USER_SELECT, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setForeground(Color.RED);
        contentPane.add(jScrollPane, BorderLayout.CENTER);
    }
}
