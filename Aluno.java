public class Aluno {
    private String nome;
    private String matricula;
    private double nota;
    private Professor professorResponsavel; 

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    
    public void setProfessor(Professor professor) {
        this.professorResponsavel = professor;
    }

    public Professor getProfessor() {
        return this.professorResponsavel;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void exibir() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula + " | Nota: " + nota);
        if (professorResponsavel != null) {
            System.out.print("  -> Responsável: ");
            professorResponsavel.exibir(); 
        } else {
            System.out.println("  -> Sem professor responsável associado.");
        }
    }
}