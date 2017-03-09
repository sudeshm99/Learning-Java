
package database;

import java.sql.*;
public class database {
   public Connection conn = null;
    public void connectdb(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/userInfo";
            String user = "root";
            String pw = "1234";
            
            conn = DriverManager.getConnection(url, user, pw);
            if(conn != null){
                System.out.println("Connect to the database");
            }
        }catch(SQLException ex){
            System.out.println("Maybe username or password is incorect");
            ex.printStackTrace();
        }
    }
}
