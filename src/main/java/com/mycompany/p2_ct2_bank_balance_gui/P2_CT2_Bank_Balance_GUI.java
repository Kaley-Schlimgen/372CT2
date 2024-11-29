/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2_ct2_bank_balance_gui;

/**
 *
 * @author kaleyschlimgen
 */
import javax.swing.*;
import java.awt.event.*;

public class P2_CT2_Bank_Balance_GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Window");
        JButton button = new JButton("Open New Window");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window_2 newWindow = new Window_2();
                newWindow.setVisible(true);
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
