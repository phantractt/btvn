/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author ASUS
 */
public class Frame {
    public void Frame()

    {

        initContainer();
        initComponet();
        addComponent();

    }
    private void initContainer() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        f = new JFrame();
        f.setSize(screen.width, screen.height);
        f.setLayout(null);
        pnMain = new JPanel();
        pnMain.setLayout(null);
        pnMain.setBackground(Color.gray);
        pnMain.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(pnMain);

    }
}
