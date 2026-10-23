package associacoes;

public class TestaAssociacao {
    static void main(String[] args) {
        Funcionario mayco = new Funcionario("Mayco Nunes", "Prof.Dr.");
        System.out.println(mayco.nomeCompleto());
        System.out.println(mayco);

        Funcionario p1 = new Funcionario("zé", "Sr.");
        Funcionario p2 = p1;
        System.out.println("Endereço de p1: " + p1);
        System.out.println("Endereço de p2: " + p2);
        p1.setNome("Maria");
        System.out.println("Nome de p1: " + p1.getNome());
        System.out.println("Nome do p2: "+ p2.getNome());

        System.out.println(p1 == p2);
    }
}
