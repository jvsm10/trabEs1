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
public class ListaAlunos {
    private static ArrayList<Aluno> alunos = new ArrayList();
    
    public static void limpar(){
        alunos.clear();
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void setAlunos(ArrayList<Aluno> alunos) {
        ListaAlunos.alunos = alunos;
    }
    
    public static Aluno obterAluno(int cpf){
        for(int i=0;i<alunos.size();i++){
            if(alunos.get(i).getCpf() == cpf)
                return alunos.get(i);
        }
        return null;
    }
    
    public static void addAluno(String nome,String id,String senha,int cpf){
        Aluno aluno = new Aluno(nome,id,senha,cpf);
        alunos.add(aluno);
    }
    
    public static int buscarLogin(String login,String senha){
        for(int i=0;i<alunos.size();i++){
            if(alunos.get(i).getId().equals(login) && alunos.get(i).getSenha().equals(senha))
                return alunos.get(i).getCpf();
        }
        return -1;
    }
}
