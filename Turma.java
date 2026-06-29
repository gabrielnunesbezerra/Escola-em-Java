public class Turma {
    private String nomeTurma;
    private Aluno[] alunos; 
    private Professor professorResponsavel;
    private int capacidadeMaxima;
    private int quantidadeAtual;

  
    public Turma(String nomeTurma, int capacidadeMaxima, Professor professorResponsavel) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.professorResponsavel = professorResponsavel;
        this.alunos = new Aluno[capacidadeMaxima];
        this.quantidadeAtual = 0;
    }

   
    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAtual < capacidadeMaxima) {
            alunos[quantidadeAtual] = aluno;
            quantidadeAtual++;
            System.out.println("Aluno " + aluno.getMatricula() + " adicionado com sucesso.");
        } else {
            System.out.println("Erro: Turma lotada! Não foi possível adicionar o aluno.");
        }
    }

   
    public void removerAluno(String matricula) {
        int indiceEncontrado = -1;

       
        for (int i = 0; i < quantidadeAtual; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
           
            for (int i = indiceEncontrado; i < quantidadeAtual - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[quantidadeAtual - 1] = null; 
            quantidadeAtual--;
            System.out.println("Aluno com matrícula " + matricula + " removido.");
        } else {
            System.out.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

  
    public void listarAlunos() {
        System.out.println("--- Lista de Alunos da Turma ---");
        if (quantidadeAtual == 0) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (int i = 0; i < quantidadeAtual; i++) {
                alunos[i].exibir(); 
            }
        }
    }

   
    public double calcularMediaGeral() {
        if (quantidadeAtual == 0) return 0.0;
        
        double soma = 0;
        for (int i = 0; i < quantidadeAtual; i++) {
            soma += alunos[i].getNota();
        }
        return soma / quantidadeAtual;
    }

   
    public void exibirInformacoesTurma() {
        System.out.println("\n============= DADOS DA TURMA =============");
        System.out.println("Turma: " + nomeTurma);
        System.out.print("Professor Regente: ");
        if (professorResponsavel != null) {
            professorResponsavel.exibir();
        } else {
            System.out.println("Nenhum");
        }
        System.out.println("Vagas: " + quantidadeAtual + "/" + capacidadeMaxima);
        listarAlunos();
        System.out.println("==========================================");
    }
}