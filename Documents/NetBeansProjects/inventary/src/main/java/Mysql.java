import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;

public class Mysql{

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        String name = br.readLine();

        //connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java";
        Connection connection = DriverManager.getConnection(url, "root", "Ayush@123");
        
        //read from database
       String query2 = "SELECT * FROM inventory where name = ?;";
        PreparedStatement preStat = connection.prepareStatement(query2);
        preStat.setString(1, name);
        ResultSet result = preStat.executeQuery();
        
       while(result.next()) {
            int id = result.getInt("id");
            String nam = result.getString("name");
            String email = result.getString("email");
            System.out.println("Name - " + nam);
            System.out.println("Email Id - " + email);
            System.out.println("id - " + id);
        }
       
       //insert into table
       System.out.println("Enter id:");
       int i=Integer.parseInt(br.readLine());
       System.out.println("Enter name :");
       String n = br.readLine();
       System.out.println("Enter email:");
       String e=br.readLine();
       System.out.println("Enter password:");
       String p=br.readLine();
       
       String s = "INSERT INTO inventory (id , name, email, password) VALUES(?, ?, ?, ?)";
       PreparedStatement pS = connection.prepareStatement(s);
       pS.setInt(1,i);
       pS.setString(2, n);
       pS.setString(3, e);
       pS.setString(4, p);
       
       pS.executeUpdate();
       
       //delete a row in database
       
       System.out.println("Enter name to delete :");
       String nm= br.readLine();
       
       String qry="DELETE FROM inventory where name=?";
        PreparedStatement ps = connection.prepareStatement(qry);
        ps.setString(1,nm);
        
        ps.execute();
        
        //searching
        
        System.out.println("Enter search by:");
        String srch=br.readLine();
        System.out.println("Enter value");
        String v=br.readLine();
        
        String qry2="Select * from inventory where "+srch+" = ? ";
         PreparedStatement pr = connection.prepareStatement(qry2);
         pr.setString(1, v);
         
          ResultSet rt = pr.executeQuery();
        
       while(rt.next()) {
            int id = rt.getInt("id");
            String nam = rt.getString("name");
            String email = rt.getString("email");
            System.out.println("Name - " + nam);
            System.out.println("Email Id - " + email);
            System.out.println("id - " + id);
        }
       
       //sorting 
       
       System.out.println("Enter sort by: ");
       String so=br.readLine();
       
       String qry3="select * from inventory order by "+so+" ";
       PreparedStatement pst=connection.prepareStatement(qry3);
       
       ResultSet rs=pst.executeQuery();
       
       while(rs.next()) {
            int id = rs.getInt("id");
            String nam = rs.getString("name");
            String email = rs.getString("email");
            System.out.println("Name - " + nam);
            System.out.println("Email Id - " + email);
            System.out.println("id - " + id);
        }
           
    }
    
}