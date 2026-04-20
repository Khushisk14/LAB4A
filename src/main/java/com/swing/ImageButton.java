package com.swing;
import javax.swing.*;
import java.awt.event.*;
public class ImageButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Buttons");

        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourIcon = new ImageIcon("hourglass.png");

        JButton digitalBtn = new JButton(digitalIcon);
        JButton hourBtn = new JButton(hourIcon);

        JLabel label = new JLabel();

        digitalBtn.setBounds(50, 50, 120, 120);
        hourBtn.setBounds(200, 50, 120, 120);
        label.setBounds(50, 200, 300, 30);

        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(digitalBtn);
        frame.add(hourBtn);
        frame.add(label);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
