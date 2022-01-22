
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    String matricula;
    List<Disciplina> disciplinas = new ArrayList<>();

    // CONSTRUTORES
    public Aluno() {
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
        
    public Aluno(String nome, String matricula, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }
    
    // MÉTODOS
    public void geraResultado(){
        double media;
        double totalNotas;
        
        for(Disciplina d : disciplinas){
            media = 0;
            totalNotas = 0;
            for(int i=0; i < d.notas.size(); i++){
                totalNotas += d.getNotas().get(i).getNota();
            }
          
            media = totalNotas / d.notas.size();
           
       
            if(media >= 7) {
                System.out.println("Aluno {" + this.nome +"} está Aprovado na Disciplina {" + d.getNome() +"}, com média = " 
                        + media);
            }else if (media<7 && media>=4){
                System.out.println("Aluno {" + this.nome +"} está de Recuperação na Disciplina {" + d.getNome() +"}, com média = " 
                        + media);
            } else {
                System.out.println("Aluno {" + this.nome +"} está Reprovado na Disciplina {" + d.getNome() +"}, com média = " 
                        + media);
            }
            
        } 
    }
    
    public void adicionaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno = {" + 
                "\nnome=" + nome + 
                ",\nmatricula=" + matricula + 
                ",\ndisciplinas=" + disciplinas + 
                "\n}";
    }
    
    
    
    
    
}
