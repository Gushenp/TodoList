
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
        
        for(int i = 0; i < lista.size(); i++){
            TarefaModel tarefa = (TarefaModel) lista.get(i);
            
            if (tarefa.getNome() != null && tarefa.getNome().equalsIgnoreCase(nome)) {
                lista.remove(i);
                i--;
            }
        }
    }

    //Metodo Listar
    
    public ArrayList<TarefaModel> lista(){
        return lista;
    }
}
