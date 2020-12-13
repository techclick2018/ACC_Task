import java.sql.*;
import java.util.*;

public class MyTask1 {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.println("--------Enter Your Details-------- ");  
           
          System.out.print("Enter your name: ");    
          String name = in.next();   
                     
          System.out.print("Enter your age: ");  
          int i = in.nextInt();  
            
          System.out.print("Enter your salary: ");  
          int d = in.nextInt();  
try{
          Class.forName("com.mysql.cj.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");  
  
PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?)");  
stmt.setString(1,name);
stmt.setInt(2,i);
stmt.setInt(3,d);
  
  
stmt.executeUpdate();        
 System.out.println(" records inserted"); 
con.close();  
}catch(Exception e){ System.out.println(e);}                    
          }  
}