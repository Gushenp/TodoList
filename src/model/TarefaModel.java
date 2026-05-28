package model;

public class TarefaModel {

    //Atributos
    private String nome;
    private boolean concluida;

    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        if (concluida){
            return "- [ X ] " + nome;
        } else {
            return "- [ㅤㅤ] " + nome;
        }
    }
}
