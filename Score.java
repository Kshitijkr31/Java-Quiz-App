package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {

			Score(String name, int score) {
				setBounds(190,150,1150,630);
				getContentPane().setBackground(Color.WHITE);
				setLayout(null);
				
				ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
				Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
				ImageIcon i3 = new ImageIcon(i2);
				JLabel image = new JLabel(i3);
				image.setBounds(0,200, 300,250);
				add(image);    
				
				JLabel heading = new JLabel("Thank You " + name + " for Playing Mind Test");
				heading.setBounds(395,100,750,30);
				heading.setFont(new Font("Tahoma",Font.PLAIN,38));
				add(heading);
				
				JLabel lblscore = new JLabel("Your Score is : " + score);
				lblscore.setBounds(485,250,750,30);
				lblscore.setFont(new Font("Tahoma",Font.PLAIN,35));
				add(lblscore);
			
				 	JButton lblSubmit = new JButton("Play Again");
			        lblSubmit.setBounds(580,450,180,35);
			        lblSubmit.setFont(new Font("Tahoma",Font.PLAIN,22));
			        lblSubmit.addActionListener(this);
			        lblSubmit.setBackground(Color.decode("#800080"));
			        lblSubmit.setForeground(Color.WHITE);
			        add(lblSubmit);
				
				setVisible(true);
				
				}
			
			
			
			public void actionPerformed(ActionEvent ae) {
				setVisible(false);
			new Login();
				
			}
			
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("user",0);
	}

}
