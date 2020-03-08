/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Frame {

    JFrame f;
    JPanel pnMain;
    JTextField txt1, txt2;
    JLabel lb1;
    JButton button1;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public Frame() {
        initContainer();
        initComponent();
        addComponent();
        addEvent();
        f.setVisible(true);
    }

    private void initContainer() {

        f = new JFrame();
        f.setSize(screen.width, screen.height);
        f.setLayout(null);
        pnMain = new JPanel();
        pnMain.setLayout(null);
        pnMain.setBackground(Color.WHITE);
        pnMain.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(pnMain);
    }

    private void initComponent() {
        button1 = new JButton("click");
        button1.setBounds(screen.width / 3, 0, 400, 150);
        txt1 = new JTextField();
        txt1.setBounds(screen.width / 3, screen.height / 5, 400, 150);
        txt2 = new JTextField();
        txt2.setBounds(screen.width / 3, screen.height * 2 / 5, 400, 150);
        lb1 = new JLabel();
        lb1.setBounds(screen.width / 3, screen.height * 3 / 5, 400, 150);
        lb1.getFont(new Font("", Font.DIALOG, 30));
    }

    private void addComponent() {
        pnMain.add(button1);
        pnMain.add(txt1);
        pnMain.add(txt2);
        pnMain.add(lb1);
    }

    private void addEvent() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txt1.getText();
                txt2.getText();
                int max = Integer.parseInt(txt1.getText());
                int min = Integer.parseInt(txt2.getText());
                int value = max - (int) (Math.random() * (max - min));
                lb1.setText(String.valueOf(value));

            }
        });
    }
}
