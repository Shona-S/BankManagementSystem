package bms;

import java.sql.*;

public class DBconnection {
    Connection c;
    Statement s;
    public DBconnection(){
        try{
           c = DriverManager.getConnection("jdbc:mysql:///BMS","root","root");
           s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
