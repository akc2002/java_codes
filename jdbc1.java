import java.sql.*;

import java.util.Scanner;

public class jdbc1 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "arjun";

   public static void main(String[] args) {



      try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();

	ResultSet rs = stmt.executeQuery("show databases");
         while (rs.next()) {
            String i = rs.getString("Database");
            System.out.print(i);



            System.out.println();
         }

      } catch (SQLException e) {
         e.printStackTrace();

      }

   }

}
