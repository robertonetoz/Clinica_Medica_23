/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roberto
 */
public class Conexao {
    public static Connection getConexao() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", "root", "010102");
            System.out.println ("Conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }
    
}
