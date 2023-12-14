package br.edu.imepac.daos;

import br.edu.imepac.util.Conexao;
import br.edu.imepac.entidades.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 231-001265
 */
public class PacienteDAO {

    public void save(Paciente paciente) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto-poo?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "010102");
        String sql = "INSERT INTO pacientes (nome, cpf, nascimento, telefone, sexo, imagem, cidade, complemento, celular, endereco, rg, estado, codigo_paciente, convenio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "nome");
            ps.setString(2, "cpf");
            ps.setString(3, "nascimento");
            ps.setString(4, "telefone");
            ps.setString(5, "sexo");
            ps.setString(6, "imagem");
            ps.setString(7, "cidade");
            ps.setString(8, "complemento");
            ps.setString(9, "celular");
            ps.setString(10, "endereco");
            ps.setString(11, "rg");
            ps.setString(12, "estado");
            ps.setString(13, "codigo_paciente");
            ps.setString(14, "convenio");
            ps.execute();
            ps.close();

        }
    }

    public void delete(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void saveOrUpdate(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
