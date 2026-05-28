
package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    // Metodo Adiconar
    
    public void adicionar(String nome){
        if (!nome.isBlank() && verificarDuplicatas(nome)){        
            TarefaModel tarefa = new TarefaModel(nome);
            lista.add(tarefa);
        } else {
            if (verificarDuplicatas(nome) == false){
                mostrarMensagem("Essa tarefa já existe!!!");
            } 
            
            if (nome.isBlank()){
                mostrarMensagem("O campo NOME não pode estar vazio!");
            }
        }
    }
    
    public void marcarConcluida(String nome){
       for(TarefaModel tarefa : lista){
           if(tarefa.getNome().equalsIgnoreCase(nome) && !nome.isBlank()){
               tarefa.setConcluida(true);
           } else {
               mostrarMensagem("Selelecione antes uma tarefa para concluir.");
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
    
    private boolean verificarDuplicatas(String nome){
        for(int i = 0; i < lista.size(); i++){
            TarefaModel tarefa = (TarefaModel) lista.get(i);
            if (tarefa.getNome().equalsIgnoreCase(nome)){
                return false;
            }
        }
        return true;
    }

    private void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    //Metodo Listar 
    
    public ArrayList<TarefaModel> lista(){
        return lista;
    }
}
