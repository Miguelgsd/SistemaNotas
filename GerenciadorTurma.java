public class GerenciadorTurma {
    private String nomeTurma;
    private Aluno[] arrayAluno;
    private int i;

    public GerenciadorTurma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.arrayAluno = new Aluno[4];
        this.i = 0;
    }

    public void cadastrarAluno(Aluno a){
        if(i < arrayAluno.length){
            arrayAluno[i] = a;
            i += 1;
        } else {
            System.out.println("Turma com capacidade máxima atingida.");
        }
    }

    public void emitirBoletins(){
        System.out.println("Emissão dos Boletins: \n---------------------------");
        for(int j = 0; j < i; j++){
            arrayAluno[j].exibirBoletim();
        }
    }

    public int contarAprovados(){
        int aprovados = 0;
        for(int j = 0; j < i; j++){
            if(arrayAluno[j].calcularMedia() >= 6.0){
                aprovados += 1;
            }
        }

        return aprovados;
    }

    public void exibirMaiorMedia(){
        double maiorMedia = 0;
        String maiorAluno = "";
        for(int j = 0; j < i; j++){
            if(maiorMedia < arrayAluno[i].calcularMedia()){
                maiorMedia = arrayAluno[i].calcularMedia();
                maiorAluno = arrayAluno[i].getAluno();
            }
        }

        System.out.println("O aluno com a maior média foi: " + maiorAluno + "\nSua nota foi: " + maiorMedia);
    }
}