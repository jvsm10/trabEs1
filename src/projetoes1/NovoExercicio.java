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
public class NovoExercicio {
    
    public static Exercicio criarExercicio(String nome,String descricao,char tipo){
        Exercicio novo = new Exercicio(nome,descricao,tipo);
        return novo;
    }
}
