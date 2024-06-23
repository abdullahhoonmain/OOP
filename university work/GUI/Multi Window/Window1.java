/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MacBook Pro
 */
public class Window1 extends JFrame implements ActionListener{
    
    
    JButton B1;
    Window1(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    
    B1= new JButton();
    B1.setText("to new window");
    this.add(B1);
    B1.addActionListener(this);
    B1.setBounds(100, 160, 200 ,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B1){
            this.dispose();
            new Window2();
        
        }
    }
}
