package com.codebender;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class app {
    private JPanel panel;
    private JLabel help1;

    private JLabel help2;
    private JLabel help3;
    private JLabel point;
    private JTextField A;
    private JTextField B;
    private JTextField C;
    private JTextField D;

    public static void main(String[] args){
        JFrame frame = new JFrame("app");
        frame.setContentPane(new app().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
