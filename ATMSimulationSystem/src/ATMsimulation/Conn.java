package ATMsimulation;

import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","password"); // MySQL WorkBench connection details.
            s =c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
