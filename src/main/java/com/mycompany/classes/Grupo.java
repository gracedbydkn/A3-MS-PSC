package com.mycompany.classes;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Grupo {
    private int codGrupo;
    private String nomeGrupo;
    private String senhaGrupo;
    private String tema;

    public Grupo(String nomeGrupo, String tema, String senhaGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.tema = tema;
        this.senhaGrupo = senhaGrupo;
    }
    
    public Grupo(){
    }
    
    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nome) {
        this.nomeGrupo = nome;
    }

    public String getSenhaGrupo() {
        return senhaGrupo;
    }

    public void setSenhaGrupo(String senha) {
        this.senhaGrupo = senha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }
    
    public boolean validaGrupo() throws SQLException {
        String sql = "SELECT * FROM tb_grupo WHERE nomegrupo = ? AND tema = ? AND senhagrupo = ?";
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);)
        {
        ps.setString(1, getNomeGrupo());
        ps.setString(2, getTema());
        ps.setString(3, getSenhaGrupo());
        ResultSet rs = ps.executeQuery();
        return rs.next();
        }
    }

}    

        
