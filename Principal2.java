public class Principal2 {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos Alberto", "Matemática", 8);

    
        Aluno aluno1 = new Aluno("Ana Silva", "MAT101", 8.5);
        Aluno aluno2 = new Aluno("Bruno Souza", "MAT102", 7.0);
        Aluno aluno3 = new Aluno("Carla Dias", "MAT103", 9.5);

        Turma turma = new Turma("3º Ano A", 5, prof);
        aluno1.setProfessor(prof);
        aluno2.setProfessor(prof);
        aluno3.setProfessor(prof);

        System.out.println("--- Matriculando Alunos ---");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.exibirInformacoesTurma();

        System.out.printf("Média Geral da Turma: %.2f\n", turma.calcularMediaGeral());
        System.out.println("\n--- Removendo Aluno ---");
        
        turma.removerAluno("MAT102"); 
        turma.exibirInformacoesTurma();
        System.out.printf("Nova Média Geral da Turma: %.2f\n", turma.calcularMediaGeral());
    }
}