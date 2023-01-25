
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton back,rules;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,30,200,50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        heading.setForeground(new Color(30,80,154));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(740,150,200,30);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,80,154));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(690, 200, 250, 25);
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(700,270,100,20);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(830,270,100,20);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,500); 
        setLocation(170,130);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
    
    public static void main(String args[]){
        new Login();
        
        
    }
}
