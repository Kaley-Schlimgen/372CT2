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

    public Window_2() {
        setTitle("ACCOUNT BALANCE");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(displayBalancePanel(), BorderLayout.NORTH);
        mainPanel.add(nextStepPanel(), BorderLayout.CENTER);
        mainPanel.add(optionsPanel(), BorderLayout.SOUTH);
        
        add(mainPanel);
        //pack();
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
        panel.add(new JLabel("Panel 3"));
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 10, 5));
        panel.setBorder(BorderFactory.createTitledBorder(""));
        
        JButton button = new JButton("Deposit");
        JButton button2 = new JButton("Withdraw");
        JButton button3 = new JButton("Exit");
        
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Window_2::new);

        
    }
}
    

