import java.util.Scanner;

public class TesteNotas{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int opcao;
        GerenciadorTurma turma1 = new GerenciadorTurma("3° Ano A");
        Aluno aluno1 = new Aluno("João", "001");
        Aluno aluno2 = new Aluno("Gabriel", "002");
        Aluno aluno3 = new Aluno();
        aluno2.lancarNotas(10.0, 5.0, 7.5);

        turma1.cadastrarAluno(aluno1);
        turma1.cadastrarAluno(aluno2);
        turma1.cadastrarAluno(aluno3);

        System.out.println("\n===== SISTEMA DE NOTAS - 3° Ano A =====");
        System.out.println("1 - Emitir boletins de todos os alunos.\n2 - Exibir quantidade de alunos aprovados.\n3 - Exibir aluno com maior média\n4 - Lançar notas para um aluno pelo índice\n0 - Sair do sistema");
        System.out.print("\nEscolha uma opção: ");
        opcao = input.nextInt();


    }
}