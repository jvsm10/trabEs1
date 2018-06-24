/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoes1;

/**
 *
 * @author JOÃO VICTOR
 */
public class Aluno {
    
    private String nome;
    private String id;
    private String senha;
    private int cpf;

    public Aluno(String nome, String id, String senha, int cpf) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
}
