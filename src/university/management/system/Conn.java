package university.management.system;

import java.sql.*;

public class Conn {
    public Connection c; 
    public Statement s;  

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "1589"); // connection details
            s = c.createStatement(); 
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
