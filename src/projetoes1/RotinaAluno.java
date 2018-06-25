/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoes1;

import java.util.ArrayList;

/**
 *
 * @author JOÃO VICTOR
 */
public class RotinaAluno {
    
    private  ArrayList<Exercicio> exercicios;
    private  int presenca;
    private  int cpf;

    public RotinaAluno() {
        presenca = 0;
        exercicios = new ArrayList();
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public int getPresenca() {
        return presenca;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public void atualizaPresenca(){
        presenca+=1;
    }
    
}
