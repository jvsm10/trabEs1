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
public class Exercicio {
    
    private String nome;
    private String descricao;
    private char tipo;

    public Exercicio(String nome, String descricao, char tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
