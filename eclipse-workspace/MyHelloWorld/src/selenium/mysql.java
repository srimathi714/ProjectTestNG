package selenium;
import java.sql.*;


public class mysql {
	public static void main(String[] args) {
		      try {
		         Class.forName("com.mysql.cj.jdbc.Driver");
		      } catch(ClassNotFoundException e) {
		         System.out.println("Class not found "+ e);
		      }
		      try {
		         Connection con = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/mydatabase","root", "srimathi7");
		         
		         Statement stmt = con.createStatement();
		         ResultSet rs = stmt.executeQuery("SELECT * FROM customers");
		         System.out.println("name    address");
		         
		         while (rs.next()) {
		            //int id = rs.getInt("id");
		            String name = rs.getString("name");
		            String address = rs.getString("address");
		            System.out.println(name+"    "+address);
		         }
		      } catch(SQLException e) {
		         System.out.println("SQL exception occured" + e);
		      }
		   }
		}


