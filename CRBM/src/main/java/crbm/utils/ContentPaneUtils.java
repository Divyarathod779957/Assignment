package crbm.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ContentPaneUtils {

    public static JPanel getContentPane(){
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        return contentPane;
    }

}
