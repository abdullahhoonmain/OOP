/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MacBook Pro
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class frame2 extends JFrame implements ActionListener {

    JButton B1;
    JLabel L3;
     frame2() {
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(null);
         this.setSize(500, 500);
         
         ImageIcon I2= new ImageIcon("def.jpg");
         
         ImageIcon I3= new ImageIcon("qwe.jpg");
         
         
          B1= new JButton();
         B1.setBounds(100, 150, 200,100);
         B1.setFocusable(false);
         B1.setText("Click Me");
         this.add(B1);
         B1.addActionListener(this);
         B1.setIcon(I2);
         B1.setHorizontalTextPosition(JButton.CENTER);
         B1.setVerticalTextPosition(JButton.BOTTOM);
         // also can use the lambda expression rather than implementing the interface and overrdinging the actionPerformed function.
         // which is B1.addActionListener(e -> System.out.println("wah jee wah"));
         
         L3= new JLabel();
         L3.setIcon(I3);
         L3.setBounds(0,0, 50,50);
         this.add(L3);
         L3.setVisible(false);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    if(e.getSource()==B1){
       System.out.println("wah jee wah");
       L3.setVisible(true);
        

    }
    }
    }
     
     
    

