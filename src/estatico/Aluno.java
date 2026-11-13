package estatico;

public class Aluno {
    String nome;
    int idade;
    /// Atributo estático (de classe)
    static int quantidadeAlunos = 0;

    public Aluno(){
        quantidadeAlunos ++;
        System.out.println("Criando o " + quantidadeAlunos + "°");


    }
}
