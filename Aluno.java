public class Aluno{
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public Aluno(){
        this.nome = "Sem nome";
        this.matricula = "000";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public String getAluno(){
        return this.nome;
    }

    public void lancarNotas(double n1, double n2, double n3){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double calcularMedia(){
        return ((this.nota1 + this.nota2 + this.nota3) / 3);
    }

    public String verificarSituacao(){
        if(calcularMedia() >= 6.0){
            return "APROVADO";
        } else if(calcularMedia() >= 4.0 && calcularMedia() < 6.0){
            return "RECUPERACAO";
        } else {
            return "REPROVADO";
            }
    }

    public void exibirBoletim(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Notas:\n1º Bimestre: " + this.nota1 + "\n2º Bimestre: " + this.nota2 + "\n3º Bimestre: " + nota3);
        System.out.printf("Média do aluno: %.2f\n", calcularMedia());
        System.out.println("Situação do aluno: " + verificarSituacao());
    }
}