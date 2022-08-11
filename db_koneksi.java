package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class db_koneksi {
    
    public static Connection MYSQLConfig;
    
    static Connection configDB()throws SQLException{
      try{ 
           String url ="jdbc:mysql://localhost/db_buku";
           String user="root";
           String pass="";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           MYSQLConfig = DriverManager.getConnection(url,user,pass);
    }catch(SQLException e){
        System.out.println("koneksi ke Database Gagal " + e.getMessage());
    }
    
      return MYSQLConfig;

    }
}

