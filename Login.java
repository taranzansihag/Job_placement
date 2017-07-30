import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Login extends JFrame implements ActionListener{
  
  JLabel jl,jl1;
  JTextField jt;
  JPasswordField jp;
  JButton jb;
  
  public Login(String s){
  super(s);
  setLayout(null);
 jl=new JLabel("emailid");
 jl1=new JLabel("Password");
 jt=new JTextField(20);
 jp=new JPasswordField(20);
 jb=new JButton("Submit");
 jl.setBounds(50,100,150,40);
 jt.setBounds(210,100,150,40);
 jl1.setBounds(50,150,150,40);
 jp.setBounds(210,150,150,40);
 jb.setBounds(130,200,150,40);
 add(jl);
 add(jl1);
 add(jt);
 add(jp);
 add(jb);
 jb.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e){
 int flag=0;
 
 String s = jt.getText();
 String p = jp.getText();
 
 
 try{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection cn = DriverManager.getConnection("jdbc:odbc:dsn");
	Statement st = cn.createStatement();
	ResultSet rs = st.executeQuery("select * from Admin where emailid = '"+s+"' AND password = '"+p+"'");
	while(rs.next()){
	  flag=1;
	  break;
	}
	if(flag==1){
	  Profile pr = new Profile("profile");
	  pr.setSize(700,700);
	  pr.setVisible(true);
	  this.setVisible(false);
	}
	
 } 
 catch(Exception e1){
	System.out.println(e1.getMessage());
 
 }
 
 }
 public static void main(String []arr){
  Login l=new Login("login");
  l.setSize(800,800);
  l.setVisible(true);
 }
 
}
