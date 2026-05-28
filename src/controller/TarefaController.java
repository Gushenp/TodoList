
package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    // Metodo Adiconar
    
    public void adicionar(String nome){
        if (!nome.isBlank() && verificarDulicatas(nome)){        
            TarefaModel tarefa = new TarefaModel(nome);
            lista.add(tarefa);
        } else {
            if (verificarDulicatas(nome) == false){
                JOptionPane.showMessageDialog(null, "Essa tarefa já existe!!!");
            } 
            
            if (nome.isBlank()){
                JOptionPane.showMessageDialog(null, "O campo NOME não pode estar vazio.");
            }
        }
    }
    
    public void marcarConcluida(String nome, boolean status){
       for(TarefaModel tarefa : lista){
           if(tarefa.getNome().equalsIgnoreCase(nome) && !nome.isBlank()){
               tarefa.setConcluida(true);
           } else {
               JOptionPane.showMessageDialog(null, "Selelecione antes uma tarefa para concluir.");
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
    
    private boolean verificarDulicatas(String nome){
        for(int i = 0; i < lista.size(); i++){
            TarefaModel tarefa = (TarefaModel) lista.get(i);
            if (tarefa.getNome().equalsIgnoreCase(nome)){
                return false;
            }
        }
        return true;
    }

    //Metodo Listar 
    
    public ArrayList<TarefaModel> lista(){
        return lista;
    }
}
