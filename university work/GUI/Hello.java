/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MacBook Pro
 */
   import java.awt.Color;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Hello {
 

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(171, 160, 150));
        
        new frame2();
        new frame3();
        new frame4();

        JLabel L1 = new JLabel();
        L1.setText("Bro Hi");
        frame.add(L1);
        L1.setBounds(0, 0, 50, 50);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        panel1.setBounds(54, 65, 25, 25);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.MAGENTA);
        panel2.setBounds(80, 80, 100, 100);
        frame.add(panel2);
        

        JLabel L2 = new JLabel();
        L2.setText("Bro");
        frame.add(L2);
        L2.setVerticalAlignment(JLabel.TOP);
        L2.setBounds(190, 200, 50, 50);
        
        ImageIcon I1= new ImageIcon("abc.jpg");
        
         L2.setIcon(I1);
         panel2.add(L2);
         
                  


    }
}
