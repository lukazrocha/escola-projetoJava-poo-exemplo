
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    String codigo;
    List<Aluno> alunos = new ArrayList<>();
    

    //CONSTRUTORES
    public Turma() {
    }

    public Turma(String codigo) {
        this.codigo = codigo;
    }
    

    public Turma(String codigo, List<Aluno> alunos) {
        this.codigo = codigo;
        this.alunos = alunos;
    }
    
    //MÉTODOS
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    //GETTERS and SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
        
    
    
    @Override
    public String toString() {
        return "Turma = {" + 
                "\ncodigo=" + codigo + 
                ",\nalunos=" + alunos + 
                "\n}";
    }
    
    
 
    
}
