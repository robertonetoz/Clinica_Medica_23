package br.edu.imepac.daos;

import br.edu.imepac.conexao.Conexao;
import br.edu.imepac.entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 231-001265
 */
public class PacienteDAO {

    private Connection connection = Conexao.getConexao();

    public void save(Paciente paciente) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO pacientes (nome, cpf, nascimento, telefone, sexo, imagem) VALUES (?, ?, ?, ?, ?, ?");
            ps.setString(1, "nome");
            ps.setString(2, "cpf");
            ps.setString(3, "nascimento");
            ps.setString(4, "telefone");
            ps.setString(5, "sexo");
            ps.setString(6, "imagem");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        public void update(Paciente paciente) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE pacientes SET nome=?, cpf=?, nascimento=?, telefone=?, sexo=? WHERE id=?");
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getNascimento());
            ps.setString(4, paciente.getTelefone());
            ps.setString(5, paciente.getSexo());
            ps.setString(6, paciente.getImagem());
            ps.setInt(7, paciente.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}    
