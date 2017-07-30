import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Sedit extends JFrame implements ActionListener{
	JLabel jl;
    JTextField jt;
    JButton jb,jb1;
    public Sedit (String s){
	super(s);
	setLayout(null);
	jl = new JLabel("sid");
	jt = new JTextField(20);
	jb = new JButton("SUBMIT");
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
	   String sid=jt.getText();
	   if( e.getSource()==jb){
			   try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn = DriverManager.getConnection("jdbc:odbc:dsn");
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery("select * from student where sid = '"+sid+"' ");
				while(rs.next()){
				  flag=1;
				  break;
				}
	     if(flag==1){
		Stedit std= new Stedit(sid);
		 std.setSize(700,700);
		 std.setVisible(true);
		 this.setVisible(false);
		}
		cn.close();
		}catch(Exception e1){
	    System.out.println(e1.getMessage());
	     }
	   }
		else if(e.getSource()==jb1){
		 Student std = new Student("student");
		 std.setSize(700,700);
		 std.setVisible(true);
		 this.setVisible(false);
		}
		
	 }
}
