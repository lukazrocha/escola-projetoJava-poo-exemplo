package visao;


import modelo.*;

public class Principal {

    public static void main(String[] args) {

        Turma turma = new Turma("2ANOB");

        Aluno jose = new Aluno("José", "2ANOB-1234");
        Aluno maria = new Aluno("Maria", "2ANOB-1133");

        Disciplina logicaJose = new Disciplina("Lógica de Programação");
        Disciplina logicaMaria = new Disciplina("Lógica de Programação");
        Disciplina estruturaJose = new Disciplina("Estrutura de Dados");
        Disciplina estruturaMaria = new Disciplina("Estrutura de Dados");

        Nota notaJoseLogica1 = new Nota(10);
        Nota notaJoseLogica2 = new Nota(8);
        Nota notaJoseLogica3 = new Nota(4);
        Nota notaJoseLogica4 = new Nota(6);

        Nota notaJoseEst1 = new Nota(7);
        Nota notaJoseEst2 = new Nota(5);
        Nota notaJoseEst3 = new Nota(6);

        logicaJose.adicionaNota(notaJoseLogica1);
        logicaJose.adicionaNota(notaJoseLogica2);
        logicaJose.adicionaNota(notaJoseLogica3);
        logicaJose.adicionaNota(notaJoseLogica4);

        estruturaJose.adicionaNota(notaJoseEst1);
        estruturaJose.adicionaNota(notaJoseEst2);
        estruturaJose.adicionaNota(notaJoseEst3);

        jose.adicionaDisciplina(logicaJose);
        jose.adicionaDisciplina(estruturaJose);
        
        //Maria não tem notas
        maria.adicionaDisciplina(logicaMaria);
        maria.adicionaDisciplina(estruturaMaria);

        turma.adicionarAluno(jose);
        turma.adicionarAluno(maria);

        System.out.println(turma);

        jose.geraResultado();
        

    }

}
