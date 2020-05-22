package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    
    public Connection conecta(){
        try{
            
            String url = "jdbc:postgresql://localhost:5432/EnderecoDoBancoAqui";
            String usuario = "postgres";
            String senha = "SenhaDoBancoAqui";
            
            return DriverManager.getConnection(url, usuario, senha);
            
        } catch(SQLException e){
           
            throw new RuntimeException(e);
            
        }
    }
    
}
