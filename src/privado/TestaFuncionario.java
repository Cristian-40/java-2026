package privado;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario fulano = new Funcionario();
        fulano.setNome("Fulano Silva");
        fulano.setIdade(21);
        fulano.setSalario(1620);
        System.out.println("Nome: " + fulano.getNome());
        System.out.println("Idade: " + fulano.getIdade());
        System.out.println("Salário: " + fulano.getSalario());
    }
}
