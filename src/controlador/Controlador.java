/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import projetoes1.Aluno;
import projetoes1.Exercicio;
import projetoes1.ListaAlunos;
import projetoes1.ListaExercicios;
import projetoes1.RotinaAluno;
import projetoes1.SistemaAcademia;

/**
 *
 * @author JOÃO VICTOR
 */
public class Controlador {
    
    public void addAluno(String nome,String id,String senha,int cpf){
         ListaAlunos.addAluno(nome, id, senha, cpf);
         //SistemaAcademia.addAlunoArquio(ListaAlunos.getAlunos());
    }
    
    public Aluno obterAluno(int cpf){
        //ListaAlunos.limpar();
        //ArrayList<Aluno> alunos = new ArrayList();
        //alunos = SistemaAcademia.recuperarAlunos();
        //ListaAlunos.setAlunos(alunos);
        return ListaAlunos.obterAluno(cpf);
    }
    
     public ArrayList<Aluno> obterAlunos(){
        //ListaAlunos.limpar();
        //ArrayList<Aluno> alunos = new ArrayList();
        //alunos = SistemaAcademia.recuperarAlunos();
        //ListaAlunos.setAlunos(alunos);
        return ListaAlunos.getAlunos();
    }
     
     public void addExercicio(String nome,char tipo,String descricao){
         ListaExercicios.addExercicio(nome, descricao, tipo);
     }
     
     public ArrayList<Exercicio> obterExercicios(){
         return ListaExercicios.getExercicios();
     }
     
     public Exercicio obterExercicio(String nome){
         return ListaExercicios.selecionarExercicio(nome);
     }
     
     public void addRotina(RotinaAluno rotina){
         SistemaAcademia.addRotina(rotina);
     }
     
     public RotinaAluno obterRotina(int cpf){
         return SistemaAcademia.buscarRotina(cpf);
     }
     
     public void marcarPrsenca(int cpf){
         SistemaAcademia.marcarPrsenca(cpf);
     }
}
