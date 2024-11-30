/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2_ct2_bank_balance_gui;

/**
 *
 * @author kaleyschlimgen
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Window_2 extends JFrame {
    private JTextField balanceField;
    private JTextField withdrawField;
    private JTextField depositField;

    public Window_2() {
        setTitle("ACCOUNT BALANCE");
        //setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(displayBalancePanel(), BorderLayout.NORTH);
        mainPanel.add(nextStepPanel(), BorderLayout.CENTER);
        mainPanel.add(optionsPanel(), BorderLayout.SOUTH);
        
        add(mainPanel);
        pack();
        setVisible(true);
    }
    
    private JPanel displayBalancePanel(){
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Your Balance:"));
        
        balanceField = new JTextField(5);
        balanceField.setEditable(false);
        balanceField.setText("0");
        panel.add(balanceField);
        return panel;
    }
    
    private JPanel nextStepPanel() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("What would you like to do?"));
        
        
        return panel;
    }
    
    private JPanel optionsPanel() {
        JPanel panel = new JPanel();
        //panel.add(new JLabel("Panel 3"));
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 5));
        panel.setBorder(BorderFactory.createTitledBorder(""));
        
        withdrawField = new JTextField(5);
        withdrawField.setEditable(true);
        withdrawField.setText("0");
        //panel.add(withdrawField);
        
        depositField = new JTextField(5);
        depositField.setEditable(true);
        depositField.setText("0");
        
        JButton button = new JButton("Deposit");
        JButton button2 = new JButton("Withdraw");
        JButton button3 = new JButton("Exit");
        
        JPanel innerPanel1 = new JPanel();
        innerPanel1.add(new JLabel("Deposit Amount:"));
        innerPanel1.add(depositField);
        innerPanel1.add(button);
        
        JPanel innerPanel2 = new JPanel();
        innerPanel2.add(new JLabel("Withdraw Amount:"));
        innerPanel2.add(withdrawField);
        innerPanel2.add(button2);
        
        JPanel innerPanel3 = new JPanel();
        //innerPanel3.add(new JLabel("Log Out & Exit"));
        innerPanel3.add(button3);
        
        
        panel.add(innerPanel1, BorderLayout.NORTH);
        panel.add(innerPanel2, BorderLayout.CENTER);
        panel.add(innerPanel3, BorderLayout.SOUTH);
        
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Window_2::new);

        
    }
}
    