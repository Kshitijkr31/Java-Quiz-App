package QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname; // Corrected JTextField capitalization
	
    Login() {
    	
        setLayout(null);       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);    
        
        JLabel heading = new JLabel("Mind Test");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("ALgerian" ,Font.BOLD,34));
        heading.setForeground(new Color(130,14,10));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,25);
        name.setFont(new Font("ALgerian" ,Font.BOLD,20));
        name.setForeground(new Color(130,14,10));
        add(name);       
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman" ,Font.BOLD,20));
        add(tfname);  
        
        rules = new JButton("Submit");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);    
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);  
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }   
    public void actionPerformed(ActionEvent ae) {
	
		if (ae.getSource() == rules) {
			String name = tfname.getText();
			setVisible(false);
			
			new Rules(name);		
		} else if(ae.getSource()== back) {
			setVisible(false);
		}
    } 
    public static void main(String[] args) {
        new Login();
    }
}
