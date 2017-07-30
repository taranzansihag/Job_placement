import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Student extends JFrame implements ActionListener{

  JButton jb,jb1,jb2,jb3;
  public Student (String s){
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
			Sedit se=new Sedit("sedit");
			se.setSize(700,700);
			se.setVisible(true);
			this.setVisible(false);
		}
		 if(e.getSource()==jb1){
			Sinsert si=new Sinsert("sinsert");
			si.setSize(700,700);
			si.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==jb2){
			Sdelete sr=new Sdelete("sdelete");
			sr.setSize(700,700);
			sr.setVisible(true);
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