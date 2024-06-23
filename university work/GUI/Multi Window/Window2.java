
package MultiWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Window2 extends JFrame implements ActionListener {
    
    JButton B;
   
    
    Window2(){
     this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    
    B= new JButton();
    B.setText("To Window 3");
    B.setBounds(20, 20, 200, 50);
    B.addActionListener(this);
    this.add(B);
    
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B){
            this.dispose();
    Window3 W1= new Window3();
    }

    }
    
}
