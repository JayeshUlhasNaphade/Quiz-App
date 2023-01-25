
package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    JButton submit;
    Score(String name,int Score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(400,150,750,550);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("ThankYou "+name+" for playing Simple Minds!");
        heading.setBounds(45, 30, 750,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(heading);
        
        JLabel lblscore = new JLabel("your Score is "+Score);
        lblscore.setBounds(500, 300, 750,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(500,400,150,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,18));
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        setSize(800,600); 
        setLocation(280,80);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            setVisible(false);
            new Login();
        }
        
    }
    
    public static void main(String args[]){
        new  Score("User",0);
    }
}
