package MultiWindow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Window3 extends JFrame implements ActionListener {
    public static int value;
public static int start;
public static int end;

    
    JLabel L1;
    JLabel L2;
    JLabel L3;
    JTextField T1;
    JTextField T2;
    JTextField T3;
    JButton Butt1;
    JButton Butt2;
    JTextArea A1;
    
    Window3(){
    this.setSize(800,800);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setBackground(Color.gray);
    
    L1= new JLabel("Number");
    L1.setBackground(Color.gray);
    L1.setBounds(150, 100, 50, 50);
    this.add(L1);
    
    
    L2= new JLabel("Start");
    L2.setBackground(Color.gray);
    L2.setBounds(150, 150, 50, 50);
    this.add(L2);
    
    
    L3= new JLabel("End");
    L3.setBackground(Color.gray);
    L3.setBounds(150, 200, 50, 50);
    this.add(L3);
    
    T1 = new JTextField(10);
    T1.setBounds(200, 110, 100,30);
    this.add(T1);
    
    T2 = new JTextField(10);
    T2.setBounds(200, 160, 100,30);
    this.add(T2);
    
    T3 = new JTextField(10);
    T3.setBounds(200, 210, 100,30);
    this.add(T3);
    
    Butt1= new JButton("Print");
    Butt1.setBounds(150, 270, 70, 30);
    Butt1.setBackground(Color.DARK_GRAY);
    Butt1.setOpaque(false);
    Butt1.addActionListener((e->{
             value = Integer.parseInt(T1.getText());
             start = Integer.parseInt(T2.getText());
             end = Integer.parseInt(T3.getText());
            A1.setText("");
            for (int i = start; i < end; i++){
                String result = value + " * "+ i + " = " + value*i+"\n";
                A1.append(result);
            }
    }
));
    this.add(Butt1);
    
    
    Butt2= new JButton("Refresh");
    Butt2.setBounds(300, 270, 100, 30);
    Butt2.setBackground(Color.DARK_GRAY);
    Butt2.setOpaque(false);
    Butt2.addActionListener(e -> {
    T1.setText("");
    T2.setText("");
    T3.setText("");
    A1.setText("");
    value=0;
    start=0;
    end=0;
    
    


    });
    this.add(Butt2);
    
    A1= new JTextArea();
    A1.setBounds(150, 350, 300,200);
    this.add(A1);
    A1.setBackground(Color.GRAY);
    A1.setVisible(true);
    

    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        };

    
   
        
        
        

}
