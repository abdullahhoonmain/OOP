
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MacBook Pro
 */
public class frame3 extends JFrame{
    
   JPanel Panel1= new JPanel();
   JPanel Panel2= new JPanel();
   JPanel Panel3= new JPanel();
   JPanel Panel4= new JPanel();
   JPanel Panel5= new JPanel();

   //---------subPanels---------//
   JPanel Panel6= new JPanel();
   JPanel Panel7= new JPanel();
   JPanel Panel8= new JPanel();
   JPanel Panel9= new JPanel();
   JPanel Panel10= new JPanel();
   frame3(){
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new BorderLayout(05,05));
         this.setSize(500, 500);
         
         this.add(Panel1, BorderLayout.NORTH);
         this.add(Panel2, BorderLayout.EAST);
         this.add(Panel3, BorderLayout.WEST);
         this.add(Panel4, BorderLayout.SOUTH);
         this.add(Panel5, BorderLayout.CENTER);
         
         Panel1.setBackground(Color.red);
         Panel2.setBackground(Color.green);
         Panel3.setBackground(Color.blue);
         Panel4.setBackground(Color.CYAN);
         Panel5.setBackground(Color.ORANGE);
         
         Panel1.setPreferredSize(new Dimension(100,100));
         Panel2.setPreferredSize(new Dimension(100,100));
         Panel3.setPreferredSize(new Dimension(100,100));
         Panel4.setPreferredSize(new Dimension(100,100));
         Panel5.setPreferredSize(new Dimension(100,100));
         
         Panel5.setLayout(new BorderLayout());
         

         //-----------subPanels----------------//
         
         Panel6.setBackground(Color.black);
         Panel7.setBackground(Color.gray);
         Panel8.setBackground(Color.DARK_GRAY);
         Panel9.setBackground(Color.LIGHT_GRAY);
        Panel10.setBackground(Color.darkGray);
         
         Panel5.add(Panel6, BorderLayout.NORTH);
         Panel5.add(Panel7, BorderLayout.SOUTH);
         Panel5.add(Panel8, BorderLayout.EAST);
         Panel5.add(Panel9, BorderLayout.WEST);
         Panel5.add(Panel10, BorderLayout.CENTER);
         
         
         Panel1.setPreferredSize(new Dimension(70,70));
         Panel2.setPreferredSize(new Dimension(50,50));
         Panel3.setPreferredSize(new Dimension(50,50));
         Panel4.setPreferredSize(new Dimension(50,50));
         Panel5.setPreferredSize(new Dimension(50,50));

         //-----------subPanels----------------//
         }




   
   

}


