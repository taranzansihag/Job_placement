import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Cpedit extends JFrame implements ActionListener{
  JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;
  JTextField jt,jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12;
  JButton jb,jb1;
  
  public Cpedit(String s,String p){
	  
	super(s);
	setLayout(null);
	jl=new JLabel("cid");
	jl1=new JLabel("Email id");
	jl2=new JLabel("Fname");
	jl3=new JLabel("Lname");
	jl4=new JLabel("Address");
	jl5=new JLabel("mobile no");
	jl6=new JLabel("Gender");
	jl7=new JLabel("10th %");
	jl8=new JLabel("12 %");
	jl9=new JLabel("Branch");
	jl10=new JLabel("Back");
	jl11=new JLabel("no of backs");
	jl12=new JLabel("Country");
	
	jt=new JTextField(20);
	jt1=new JTextField(20);
	jt2=new JTextField(20);
	jt3=new JTextField(20);
	jt4=new JTextField(20);
	jt5=new JTextField(20);
	jt7=new JTextField(20);
	jt8=new JTextField(20);
	jt9=new JTextField(20);
	jt11=new JTextField(20);
	jt12=new JTextField(20);
	
	
	jb=new JButton("SUBMIT");
	jb1=new JButton("BACK");
	  
	
	jl.setBounds(50,0,150,30);
	jl1.setBounds(50,40,150,30);
	jl2.setBounds(50,80,150,30);
	jl3.setBounds(50,120,150,30);
	jl4.setBounds(50,160,150,30);
	jl5.setBounds(50,200,150,30);
	jl6.setBounds(50,240,150,30);
	jl7.setBounds(50,280,150,30);
	jl8.setBounds(50,320,150,30);
	jl9.setBounds(50,360,150,30);
	jl10.setBounds(50,400,150,30);
	jl11.setBounds(50,440,150,30);
	jl12.setBounds(50,480,150,30);
	
	jt.setBounds(210,0,200,30);
	jt1.setBounds(210,40,200,30);
	jt2.setBounds(210,80,200,30);
	jt3.setBounds(210,120,200,30);
	jt4.setBounds(210,160,200,30);
	jt5.setBounds(210,200,200,30);
	jt6.setBounds(210,240,200,30);
	jt7.setBounds(210,280,200,30);
	jt8.setBounds(210,320,200,30);
	jt9.setBounds(210,360,200,30);
	jt10.setBounds(210,400,200,30);
	jt11.setBounds(210,440,200,30);
	jt12.setBounds(210,480,200,30);
	
	jb.setBounds(170,600,170,50);
	jb1.setBounds(350,600,170,50);
	
	add(jl);
	add(jl1);
	add(jl2);
	add(jl3);
	add(jl4);
	add(jl5);
	add(jl6);
	add(jl7);
	add(jl8);
	add(jl9);
	add(jl10);
	add(jl11);
	add(jl12);
	
	add(jt);
	add(jt1);
	add(jt2);
	add(jt3);
	add(jt4);
	add(jt5);
	add(jt6);
	add(jt7);
	add(jt8);
	add(jt9);
	add(jt10);
	add(jt11);
	add(jt12);
	
	add(jb);
	add(jb1);
	
	jb.addActionListener(this);
	jb1.addActionListener(this);
	
	
  }
  public void actionPerformed(ActionEvent e , String p){
	
	 try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:dsn");
		Statement st=cn.createStatement();
		ResultSet rs = st.executeQuery("select * from company where cid = '"+p+"' ");
	
			jt.setText(rs.getString(1));
			jt1.setText(rs.getString(2));
			jt2.setText(rs.getString(3));
			jt3.setText(rs.getString(4));
			jt4.setText(rs.getString(5));
			jt5.setText(rs.getString(6));
			jt6.setText(rs.getString(7));
			jt7.setText(rs.getString(8));
			jt8.setText(rs.getString(9));
			jt9.setText(rs.getString(10));
			jt10.setText(rs.getString(11));
			jt11.setText(rs.getString(12));
			jt12.setText(rs.getString(13));
			
			
			String email=jt1.getText();
			String fnm=jt2.getText();
			String lnm=jt3.getText();
			String add=jt4.getText();
			String mob=jt5.getText();
			String g=jt6.getText();
			String ten=jt7.getText();
			String twlth=jt8.getText();
			String branch=jt9.getText();
			String bk=jt10.getText();
			String nbk=jt11.getText();
			String country=jt12.getText();
			
	
		if(e.getSource()==jb){
		   st.execute("update company set emailid='"+email+"' , fname='"+fnm+"' , lname='"+lnm+"' , address='"+add+"' , mob='"+mob+"' , gender='"+g+"' , 10th='"+ten+"' , 12th='"+twlth+"' , branch='"+branch+"' , back='"+bk+"' , no_of_back='"+nbk+"' , country='"+country+"' where cid='"+p+"' ");
			Profile pr=new Profile("profile");
			pr.setSize(700,700);
			pr.setVisible(true);
			this.setVisible(false);
		}
		
		cn.close();
	}
	catch(Exception e1){
		System.out.println(e1.getMessage());
	}
    if(e.getSource()==jb1){
			Company std=new Company("student");
			std.setSize(700,700);
			std.setVisible(true);
			this.setVisible(false);
		}
  }
 
  
}