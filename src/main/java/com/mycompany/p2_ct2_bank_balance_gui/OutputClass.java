/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2_ct2_bank_balance_gui;

/**
 *
 * @author kaleyschlimgen
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import static java.awt.SystemColor.text;
import javax.swing.*;
import java.awt.event.*;

public class OutputClass extends JDialog {
    private JTextField num1Field, num2Field;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label;
//(outputLabel) balanceLabel
    public JLabel balanceLabel;
    
    public OutputClass (String text) {
//balanceLabel
        balanceLabel = new JLabel(text);

        setTitle("ACCOUNT BALANCE");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(300, 100);
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        mainPanel.add(outputPanel(), BorderLayout.NORTH);
        mainPanel.add(nextStepsPanel(), BorderLayout.CENTER);
        mainPanel.add(optionsPanel(), BorderLayout.SOUTH);
        
        add(mainPanel);
        pack();
        setVisible(true);
    }
    private JPanel outputPanel() {
            
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1, 10, 5));
        panel.setBorder(BorderFactory.createMatteBorder
            (2, 2, 2, 2, Color.BLACK));
        panel.add(new JLabel("Account Balance:"));
//balanceLabel
        panel.add(balanceLabel);
        
        return panel;       
    }
        
    private JPanel nextStepsPanel(){
            
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1, 10, 5));

        panel.add(new JLabel("What would you like to do?"));

        return panel;
    }
        
    private JPanel optionsPanel() {

        JPanel panel = new JPanel();
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 5));
//panel.setBorder(BorderFactory.createMatteBorder
          //  (2, 2, 2, 2, Color.BLACK));
        
        num1Field = new JTextField(5);
        num1Field.setEditable(true);
        num1Field.setText("0");

        num2Field = new JTextField(5);
        num2Field.setEditable(true);
        num2Field.setText("0");
        
        button1 = new JButton("Deposit");
        button2 = new JButton("Withdraw");
        button3 = new JButton("Exit");
        
        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(num1Field.getText());
                int number2 = Integer.parseInt(balanceLabel.getText());
                JOptionPane.showMessageDialog(OutputClass.this, 
                    "<html>Deposit Amount: $" + (number) +"<br>Updated Total: $" 
                    + (number2 + number) + "</html>");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(num2Field.getText());
                int number2 = Integer.parseInt(balanceLabel.getText());
                JOptionPane.showMessageDialog(OutputClass.this, 
                    "<html>Withdrawal Amount: $" + (number) +"<br>Updated Total: $" 
                    + (number2 - number) + "</html>");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JPanel innerPanel1 = new JPanel();
        innerPanel1.add(new JLabel("Deposit Amount:"));
        innerPanel1.add(num1Field);
        innerPanel1.add(button1);
        
        JPanel innerPanel2 = new JPanel();
        innerPanel2.add(new JLabel("Withdraw Amount:"));
        innerPanel2.add(num2Field);
        innerPanel2.add(button2);
        
        JPanel innerPanel3 = new JPanel();
        innerPanel3.add(button3);
        
        panel.add(innerPanel1, BorderLayout.NORTH);
        panel.add(innerPanel2, BorderLayout.CENTER);
        panel.add(innerPanel3, BorderLayout.SOUTH);
        
        return panel;
    }
}



