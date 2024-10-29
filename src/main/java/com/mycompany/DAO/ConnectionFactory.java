package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = ""; //Definir senha do banco de dados; Coloque a senha do seu root para testes
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "scholarpath";

    public Connection obtemConexao() {
    try {
        Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+bd+"?serverTimeZone=UTC", usuario, senha);
        System.out.println("Conexao estabelecida com sucesso!");
        return c;
    }
    catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    
    }
}