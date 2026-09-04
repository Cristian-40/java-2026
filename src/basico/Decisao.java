package basico;

public class Decisao {
    static void main(String[] args) {
        int nota = 9;

        if (nota >= 7) {
            System.out.print("Aprovado");
        } else if (nota >= 4 && nota < 7) {
            System.out.print("Reprovado");
        } else {
            System.out.print("Reprovado");
        }
    }
}
