import java.sql.*;

import java.util.Scanner;

class jdbc3 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "root";
   static final String PASS = "arjun";

   static int age;
   static String name;
   static double marks;

   public static void takeInput() {

      /* Inserting into table */
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter fresher data");

      System.out.print("name : ");
      name = sc.next();

      System.out.print("age : ");
      age = sc.nextInt();

      System.out.print("marks : ");
      marks = sc.nextDouble();

      sc.close();

   }

   public static void main(String[] args) {

      takeInput();

      try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         stmt.execute("use oppo");

         PreparedStatement pstmt = conn.prepareStatement("INSERT INTO fresher (name,age,marks) VALUES (?,?,?)");
         pstmt.setString(1, name);
         pstmt.setInt(2, age);
         pstmt.setDouble(3, marks);

         pstmt.execute();

         /* Printing table */
         ResultSet rs = stmt.executeQuery("SELECT * FROM fresher");

         System.out.println("NAME\tAGE\tMARKS");

         while (rs.next()) {
            String i = rs.getString("name");
            System.out.print(i);

            int n = rs.getInt("age");
            System.out.print("\t" + n);

            double c = rs.getDouble("marks");
            System.out.print("\t" + c);

            System.out.println();
         }

      } catch (SQLException e) {
         e.printStackTrace();

      }

   }

}
