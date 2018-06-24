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
public class ListaExercicios {
    
    private static ArrayList<Exercicio> exercicios;

    public ListaExercicios() {
        this.exercicios = new ArrayList();
    }
    
    public static Exercicio selecionarExercicio(String nome){
        for(int i=0;i<exercicios.size();i++){
            if(exercicios.get(i).getNome() == null ? nome == null : exercicios.get(i).getNome().equals(nome))
                return exercicios.get(i);
        }
        return null;
    }
    
    public static void addExercicio(String nome,String descricao,String tipo){
        exercicios.add(NovoExercicio.criarExercicio(nome, descricao, tipo));
    }
}
