package com.mycompany.Tela;

import com.mycompany.DAO.ConnectionFactory;

public class ProjetoA3Prototipo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ConnectionFactory cf = new ConnectionFactory();
        cf.obtemConexao();
    }
}
