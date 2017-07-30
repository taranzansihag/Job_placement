import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Profile extends JFrame implements ActionListener{

  JButton jb,jb1,jb2;
  public Profile (String s){
	super(s);
	setLayout(null);
	jb=new JButton("Student");
	jb1=new JButton("Company");
	jb2=new JButton("Search");
	jb.setBounds(50,100,150,40);
	jb1.setBounds(50,150,150,40);
	jb2.setBounds(50,200,150,40);
	add(jb);
	add(jb1);
	add(jb2);
	jb.addActionListener(this);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
	
	  if(e.getSource()==jb){
			Student st=new Student("student");
			st.setSize(700,700);
			st.setVisible(true);
			this.setVisible(false);
		}
		 if(e.getSource()==jb1){
			Company c=new Company("company");
			c.setSize(700,700);
			c.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==jb2){
			Search sr=new Search("search");
			sr.setSize(700,700);
			sr.setVisible(true);
			this.setVisible(false);
		}
		
  }
}