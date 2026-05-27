
package controller;

import model.TarefaModel;
import java.util.ArrayList;

public class TarefaController {
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    // Metodo Adiconar
    
    public void adicionar(String nome){
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
    }
    
    public void marcarConcluida(String nome, boolean status){
       for(TarefaModel tarefa : lista){
           if(tarefa.getNome().equalsIgnoreCase(nome)){
               tarefa.setConcluida(true);
           }
        }
    };
    
    public void removerTarefa(String nome){
        
        for(TarefaModel tarefa : lista){
            if(tarefa.getNome().equalsIgnoreCase(nome)){
                System.out.println("a");
                //lista.remove(tarefa);
            }
    }
    }

    //Metodo Listar
    
    public ArrayList<TarefaModel> lista(){
        return lista;
    }
}
