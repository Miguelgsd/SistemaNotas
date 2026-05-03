# Sistema de Notas em Java
## Sobre o projeto
Este projeto-teste foi criado com o intuito de gerenciar notas e boletins de alunos, possibilitando o lançamento de notas, emissão de boletins, visualização da maior média bimestral e analisar aprovados.

## Preparando o código
Para realizar a instalação e deixar o código pronto para uso, clone o repositório:  

`git clone https://github.com/Miguelgsd/SistemaNotas.git`  

Isso criará uma pasta com os arquivos do projeto, armazenados no repositório.

<hr>

Para que o código funcione, é necessário possuir o Java previamente instalado. Caso não possua, instale [aqui](https://www.oracle.com/br/java/technologies/downloads/).

Como o projeto está em código-fonte (.java), precisamos do bytecode (.class). Para isso, compile o arquivo com:  

`javac TesteNotas.java`

Em seguida, execute o bytecode com:  

`java TesteNotas`

## Funcionamento
O código mostrará um menu interativo em looping que possibilita ao usuário escolher entre 5 opções:  
1 - Emitir boletins  
2 - Exibir quantidade de apovados  
3 – Exibir aluno com maior média  
4 – Lançar notas para um aluno pelo índice  
0 – Sair do sistema  

Cada opção possui um método que será executado de acordo com o necessário e com saídas formatadas.

## Classes
O sistema possui 3 classes, com as seguintes funções:  

<hr>

### Aluno
Classe criada para dar atributos e métodos aos alunos que serão cadastrados. Possui um construtor parametrizado e um construtor default.  

**Atributos:**  
- String nome;
- String matrícula;
- Double Nota 1, Nota 2, Nota 3 (Notas referentes a 3 bimestres).

**Métodos:**  
- getAluno() - retorna o nome do aluno;
- lancarNotas() - lança as 3 notas ao determinado aluno;
- calcularMedia() - calcula a média aritmética das 3 notas do aluno;
- verificarSituacao() - analisa a situação do aluno. Baseado em comparações com a média, retorna se ele está aprovado, reprovado ou em recuperação;
- exibirBoletim() - reúne todas as informações do aluno e retorna com saída formatada ao usuário.  

<hr>

### GerenciadorTurma
Classe responsável por criar e gerenciar uma turma, tratando os alunos no coletivo. Possui um construtor parametrizado e um construtor default.  

**Atributos:**  
- String nomeTurma;
- Aluno[] arrayAluno;
- int i (contador);

**Métodos:**  
- cadastrarAluno() - adiciona um aluno ao array, caso ainda haja espaço;
- emitirBoletins() - chama o método *exibirBoletim* de cada aluno dentro do array;
- contarAprovados() - conta quantos alunos possuem média igual ou maior que 6;
- exibirMaiorMedia() - percorre o array e analisa qual dos alunos possui maior média. Em seguida, exibe o resultado.

