package basico;

import java.util.Scanner;

public class Decisao {
    static void main(String[] args) {
       /// Para que o sistema saiba o que o usuário está digitando
        Scanner entrada = new Scanner(System.in);
        int nota;
        do {

            System.out.print("Digite uma nota de 0 a 10 [ -1 para finalizar]: ");
            nota = entrada.nextInt();
            /// Para que a nota não ultrapasse o limite
            if(nota < -1 || nota >10){
                System.out.println("Valor invalido");
                continue;
            }
            /// -1 para encerrar o sistema
            if (nota == -1){
                System.out.println("Fim!")
                break;

            }
            /// O programa em si
            if (nota >= 7) {
                System.out.print("Aprovado\n");
            } else if (nota >= 4 &&  nota < 7) {
                System.out.print("Exame\n");
            } else if(nota >=0) {
                System.out.print("Reprovado\n");
            }
        } while(nota!= -1);
    }
}
