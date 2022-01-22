
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    String nome;
    List<Nota> notas = new ArrayList<>();

    // CONSTRUTORES
    public Disciplina() {
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }
    
    public Disciplina(String nome, List<Nota> notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    // MÉTODOS
    public void adicionaNota(Nota nota){
        notas.add(nota);
    }
    
    //GETTERS and SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Disciplina = {" + 
                "\nnome=" + nome + 
                ",\nnotas=" + notas + 
                "\n}";
    }
    
    
    
}
