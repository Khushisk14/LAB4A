package com.swing;
import javax.swing.*;
import java.awt.event.*;
public class CountryButton {
	  public static void main(String[] args) {

	        JFrame frame = new JFrame("Country Buttons");

	        JButton indiaBtn = new JButton("India");
	        JButton sriBtn = new JButton("Srilanka");

	        JLabel label = new JLabel();

	        indiaBtn.setBounds(50, 50, 100, 30);
	        sriBtn.setBounds(200, 50, 100, 30);
	        label.setBounds(50, 120, 300, 30);

	        indiaBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                label.setText("India is pressed");
	            }
	        });

	        sriBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                label.setText("Srilanka is pressed");
	            }
	        });

	        frame.add(indiaBtn);
	        frame.add(sriBtn);
	        frame.add(label);

	        frame.setSize(400, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
}
