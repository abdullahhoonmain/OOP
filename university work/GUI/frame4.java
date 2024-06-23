
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class frame4 extends JFrame {
    
   
    JPanel P1;
    
    frame4(){
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setTitle("Frame 4");
    
    P1= new JPanel();
    P1.setLayout(new FlowLayout());
    this.add(P1);
    
     for(int i=1; i<=10; i++)
    { JButton B= new JButton("B"+i);
    B.setSize(50,50);
    P1.add(B);
    }
    }
}
