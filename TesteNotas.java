public class TesteNotas{
    public static void main(String[] args){
        GerenciadorTurma turma1 = new GerenciadorTurma("3° Ano A");
        Aluno aluno1 = new Aluno("João", "001");
        Aluno aluno2 = new Aluno("Gabriel", "002");
        Aluno aluno3 = new Aluno();
        aluno2.lancarNotas(10.0, 5.0, 7.5);

        turma1.cadastrarAluno(aluno1);
        turma1.cadastrarAluno(aluno2);
        turma1.cadastrarAluno(aluno3);

        
    }
}