/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;


public class Médicos {

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    
    public Medico() {
        
    }
    
    public Medico(int id, String nome, String cpf, String rua, String numero, String bairro, String cidade, String estado, String cep, String telefone, String nascimento, String sexo, String crm, String especialidade, String valorConsulta) {
        super(id, nome, cpf, rua, numero, bairro, cidade, estado, cep, telefone, nascimento, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
}
