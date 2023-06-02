package colegio;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conex {
    Connection conect;
    
    public Conex(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://localhost:3306/institucion","root","root");
        }catch(Exception e){
            System.err.println("ERROR: "+e);         
        }    
    }
   
}
