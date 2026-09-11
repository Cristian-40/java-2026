package oo;

public class TestaPessoa {
    public static void main(String[] args) {
        /// Cria(obj) Objeto fulano a partir da classe Pessoa
        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano da silva";
        fulano.idade = 18;
        fulano.peso = 80.5;
    System.out.printf("\n %s tem %d anos e pesa %.2f kg \n", fulano.nome, fulano.idade, fulano.peso);
    fulano.comer();
    fulano.dormir();
    fulano.respirar();

    /// Meus dados a partir da classe Pessoa.
        Pessoa cristian = new Pessoa();
        cristian.nome = "Cristian Souza da Luz";
        cristian.idade = 21;
        cristian.peso = 60;
        System.out.printf("\n %s tem %d anos e pesa %.2f kg \n", cristian.nome, cristian.idade, cristian.peso);
    cristian.comer();
    cristian.dormir();
    cristian.respirar();
    }
}
