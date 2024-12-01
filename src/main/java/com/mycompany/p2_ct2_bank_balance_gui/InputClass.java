/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2_ct2_bank_balance_gui;

/**
 *
 * @author kaleyschlimgen
 */
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

class InputClass extends JFrame  {    
    private JTextField inputField;
    private JTextField enterButton;
    private JTextField outputField;

    public InputClass() {
        setTitle("BANK ACCOUNT BALANCE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(inputPanel(), BorderLayout.NORTH);
        
        add(mainPanel);
        pack();
        setVisible(true);
        //from CT2
        
    }
    private JPanel inputPanel(){
        JPanel panel = new JPanel();
//pack vs set in the other one 
        pack();
        panel.setBorder(BorderFactory.createMatteBorder
            (2, 2, 2, 2, Color.BLACK));

        inputField = new JTextField(5);
        inputField.setEditable(true);
        inputField.setText("0");
        
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Account Balance:"));
        inputPanel.add(inputField);
       
        JButton enterButton = new JButton("Enter");
        inputPanel.add(enterButton);

//add to other (change second class name)
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OutputClass(inputField.getText());
            }
        });

        panel.add(inputPanel, BorderLayout.NORTH);

        return panel;
    }
  
}
