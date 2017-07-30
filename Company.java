import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Company extends JFrame implements ActionListener{

  JButton jb,jb1,jb2,jb3;
  public Company (String s){
	super(s);
	setLayout(null);
	jb=new JButton("EDIT");
	jb1=new JButton("INSERT");
	jb2=new JButton("DELETE");
	jb3=new JButton("BACK");
	jb.setBounds(100,100,170,50);
	jb1.setBounds(300,100,170,50);
	jb2.setBounds(100,170,170,50);
	jb3.setBounds(300,170,170,50);
	add(jb);
	add(jb1);
	add(jb2);
	add(jb3);
	jb.addActionListener(this);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
	
	   if(e.getSource()==jb){
			Cedit ce=new Cedit("cedit");
			ce.setSize(700,700);
			ce.setVisible(true);
			this.setVisible(false);
		}
		 if(e.getSource()==jb1){
			Cinsert ci=new Cinsert("cinsert");
			ci.setSize(700,700);
			ci.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==jb2){
			Cdelete cd=new Cdelete("cdelete");
			cd.setSize(700,700);
			cd.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==jb3){
			Profile pr=new Profile("profile");
			pr.setSize(700,700);
			pr.setVisible(true);
			this.setVisible(false);
		}
		
  }  
}