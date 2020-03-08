/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class Frame {

    JButton b0, b1, b2, b3, b4, b5, bac, bbang, b6, b7, b8, b9, btru, bnhan, bcong, bchia;
    JLabel lb1;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    JPanel pn;
    JFrame f;
    String value = new String();

    public Frame() {
        initContainer();
        initOponent();
        addOponent();
        addEvent();
        f.setVisible(true);

    }

    private void initContainer() {
        f = new JFrame();
        f.setSize(450, 550);
        f.setLayout(null);
        pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(Color.WHITE);
        pn.setBounds(0, 0, screen.width, screen.height);
        f.add(pn);

    }

    private void initOponent() {
        lb1 = new JLabel("0");
        lb1.setBounds(0, 0, 400, 100);
        lb1.setBackground(Color.BLACK);

        b7 = new JButton("7");
        b7.setBounds(0, 100, 100, 100);

        b8 = new JButton("8");
        b8.setBounds(100, 100, 100, 100);

        b9 = new JButton("9");
        b9.setBounds(200, 100, 100, 100);

        bac = new JButton("AC");
        bac.setBounds(300, 100, 100, 100);

        b4 = new JButton("4");
        b4.setBounds(0, 200, 100, 100);

        b5 = new JButton("5");
        b5.setBounds(100, 200, 100, 100);

        b6 = new JButton("6");
        b6.setBounds(200, 200, 100, 100);

        btru = new JButton("-");
        btru.setBounds(300, 200, 100, 100);

        b1 = new JButton("1");
        b1.setBounds(0, 300, 100, 100);

        b2 = new JButton("2");
        b2.setBounds(100, 300, 100, 100);

        b3 = new JButton("3");
        b3.setBounds(200, 300, 100, 100);

        bnhan = new JButton("x");
        bnhan.setBounds(300, 300, 100, 100);

        b0 = new JButton("0");
        b0.setBounds(0, 400, 100, 100);

        bcong = new JButton("+");
        bcong.setBounds(100, 400, 100, 100);

        bchia = new JButton("/");
        bchia.setBounds(200, 400, 100, 100);

        bbang = new JButton("=");
        bbang.setBounds(300, 400, 100, 100);
    }

    private void addOponent() {
        pn.add(lb1);
        pn.add(b0);
        pn.add(b1);
        pn.add(b2);
        pn.add(b3);
        pn.add(b4);
        pn.add(b5);
        pn.add(b6);
        pn.add(b7);
        pn.add(b8);
        pn.add(b9);
        pn.add(bnhan);
        pn.add(btru);
        pn.add(bcong);
        pn.add(bchia);
        pn.add(bbang);
        pn.add(bac);
    }

    private void addEvent() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                value +="0";
                lb1.setText(value);
            }
        });
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "1";
                lb1.setText(value);

            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "2";
                lb1.setText(value);

            }
        });
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "3";
                lb1.setText(value);

            }
        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "4";
                lb1.setText(value);

            }
        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "5";
                lb1.setText(value);

            }
        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "6";
                lb1.setText(value);

            }
        });
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "7";
                lb1.setText(value);

            }
        });
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "8";
                lb1.setText(value);

            }
        });
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "9";
                lb1.setText(value);

            }
        });
        bnhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                value+="x";
                lb1.setText(value);
            }
        });
         bchia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "/";
                lb1.setText(value);

            }
        });
         bcong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "+";
                lb1.setText(value);

            }
        });
        btru.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "-";
                lb1.setText(value);

            }
        });
        bac.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value = "";
                lb1.setText(value);

            }
        });
        bbang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                
            }
        });
    }
}
