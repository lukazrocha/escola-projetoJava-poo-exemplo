
package modelo;

public class Nota {
    
    double nota;

    public Nota() {
    }

    public Nota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + 
                "\nnota=" + nota + "\n}";
    }
    
    
    
    
}
