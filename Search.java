import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Search extends JFrame implements ActionListener{

  JButton jb,jb1,jb2;
  public Search (String s){
	super(s);
	setLayout(null);
	jb=new JButton("student search");
	jb1=new JButton("company member");
	jb2=new JButton("BACK");

	jb.setBounds(100,100,200,50);
	jb1.setBounds(310,100,200,50);
	jb2.setBounds(200,170,200,50);
	
	add(jb);
	add(jb1);
	add(jb2);

	jb.addActionListener(this);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	
  }
  public void actionPerformed(ActionEvent e){
	
	  if(e.getSource()==jb){
			Stusearch se=new Stusearch("search panel");
			se.setSize(700,700);
			se.setVisible(true);
			this.setVisible(false);
		}
		 if(e.getSource()==jb1){
			Cmpsearch si=new Cmpsearch("search panel");
			si.setSize(700,700);
			si.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==jb2){
			Profile pr=new Profile("profile");
			pr.setSize(700,700);
			pr.setVisible(true);
			this.setVisible(false);
		}
		
  }

}