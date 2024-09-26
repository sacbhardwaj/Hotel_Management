package Hotel.Management.System;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class conn {
   Connection connection;
   Statement statement;
   public conn(){
       try{
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelSA", "root",
                     "Sachin@12");
             statement = connection.createStatement();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}
