package estatico;

public class TestaUtils {
    static void main(String[] args) {
        System.out.println(Utils.PI);
        System.out.println(Utils.max(100, 50));
        System.out.println(Utils.max(-3, -5));
        System.out.println("<------------------------->");
        System.out.println("Qtd.alunos: " + Aluno.quantidadeAlunos);
        Aluno ze = new Aluno();
        System.out.println("Qtd.alunos: " + Aluno.quantidadeAlunos);
        Aluno maria = new Aluno();
        System.out.println("Qtd.alunos: " + Aluno.quantidadeAlunos);


    }
}
