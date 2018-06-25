/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoes1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOÃO VICTOR
 */
public class SistemaAcademia {
    
    private static ArrayList<RotinaAluno> rotina = new ArrayList();
    
    public static void addAlunoArquio(ArrayList<Aluno> alunos){
    String nomeArquivo = ".\\alunos.dat";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(alunos.size());
            for (Aluno alu : alunos){
                oos.writeObject(alu);
            }
            System.out.println("teste2");
            oos.close();
            fos.close();
        }catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public static ArrayList<Aluno> recuperarAlunos(){
        String nomeArquivo = ".\\alunos.dat";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Aluno> alunos = new ArrayList(); 
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            int numAlunos = ois.readInt();
            for (int i=0; i<numAlunos; i++){
                Aluno aluno = (Aluno) ois.readObject();
                alunos.add( aluno );
            }
            System.out.println("teste");
            return alunos;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public static RotinaAluno buscarRotina(int cpf){
        for(int i=0;i<rotina.size();i++){
            if(rotina.get(i).getCpf() == cpf){
                RotinaAluno rot = rotina.get(i);
                rotina.remove(i);
                return rot;
            }
        }
        return null;
    }

    private static int buscarRotinaInd(int cpf){
        for(int i=0;i<rotina.size();i++){
            if(rotina.get(i).getCpf() == cpf)
                return i;
        }
        return -1;
    }
    
    public static void addRotina(RotinaAluno rotina) {
        SistemaAcademia.rotina.add(rotina);
    }
    
    public static void marcarPrsenca(int cpf){
        int i= SistemaAcademia.buscarRotinaInd(cpf);
        rotina.get(i).atualizaPresenca();
    }
}
