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
        
        boolean exec = true;
        do {
            System.out.println("\n\n1 - Emitir boletins de todos os alunos.\n2 - Exibir quantidade de alunos aprovados.\n3 - Exibir aluno com maior média\n4 - Lançar notas para um aluno pelo índice\n0 - Sair do sistema");
            System.out.print("\nEscolha uma opção: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    turma1.emitirBoletins();
                    break;

                case 2:
                    turma1.contarAprovados();
                    break;

                case 3:
                    turma1.exibirMaiorMedia();
                    break;

                case 4:
                    int indice;
                    double n1, n2, n3;
                    System.out.println("Digite o índice do aluno (0, 1, 2): ");
                    indice = input.nextInt();
                
                    System.out.println("Digite as 3 notas bimestrais (pressione Enter após cada nota):");
                    n1 = input.nextDouble();
                    n2 = input.nextDouble();
                    n3 = input.nextDouble();

                    if(indice == 0){
                        aluno1.lancarNotas(n1, n2, n3);
                    } else if(indice == 1){
                        aluno2.lancarNotas(n1, n2, n3);
                    } else if(indice == 2){
                        aluno3.lancarNotas(n1, n2, n3);
                    } else {System.out.println("Opção de índice inválida.");}
                    break;

                case 0:
                    exec = false;
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        } while(exec);
    }
}