import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Stusearch extends JFrame implements ActionListener{
	JLabel jl;
    JTextField jt;
    JButton jb,jb1;
    public Stusearch (String s){
	super(s);
	setLayout(null);
	jl = new JLabel("sid");
	jt = new JTextField(20);
	jb = new JButton("SEARCH");
	jb1 = new JButton("BACK");
	
	jl.setBounds(100,100,150,40);
	jt.setBounds(270,100,200,40);
	jb.setBounds(120,150,170,50);
	jb1.setBounds(300,150,170,50);
	
	add(jl);
	add(jt);
	add(jb);
	add(jb1);
	
	jb.addActionListener(this);
	jb1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	   int flag=0;
	   String s=jt.getText();
   
   if(e.getSource()==jb){
     try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection cn = DriverManager.getConnection("jdbc:odbc:dsn");
			Statement st = cn.createStatement();
			ResultSet stu = st.executeQuery("select * from student where sid = '"+s+"' ");
			//ResultSet cmp = st.executeQuery("select * from company where cid = '"+s+"' ");
			while(stu.next()){
			  flag=1;
			  break;
	         }
			
    	if(flag==1){
		 
		System.out.println(stu.getString(1)+" "+stu.getString(2)+" "+stu.getString(3)+" "+stu.getString(4)+" "+stu.getString(5)+" "+stu.getString(6)+" "+stu.getString(7)+" "+stu.getString(8)+" "+stu.getString(9)+" "+stu.getString(10)+" "+stu.getString(11)+" "+stu.getString(12)); 
		Profile pr = new Profile("profile");
		 pr.setSize(700,700);
		 pr.setVisible(true);
		 this.setVisible(false);
		}
		
		cn.close();
		}
		catch(Exception e1){
	  System.out.println(e1.getMessage());
     }
	 }
		else if(e.getSource()==jb1){
		 Search pr = new Search("search");
		 pr.setSize(700,700);
		 pr.setVisible(true);
		 this.setVisible(false);
		}
		
	}
	
}