package basico;

import java.sql.SQLOutput;

public class Basico {
    static void main(String[] args) {
        /// For() Crescente
        System.out.println("Lista de 1 até 10");
        for (int i = 1; i <=10; i++){
            System.out.print(i + " ");
        }
        /// For() Decrescente
        System.out.println("\n\nLista de 10 até 1");
        for (int i = 10; i>= 1; i--){
            System.out.print(i + " ");
        }
        /// While() Crescente
        System.out.println("\n\n Lista  Crescente While");
        int numero = 1; ///Inicialização da variavel
        while(numero <= 10){
            System.out.print(numero + " ");
            numero ++;
        }
        /// While() Decrescente
        System.out.println("\n\n Lista Decrescente While");
        numero = 10; ///Inicialização da variavel
        while(numero >= 1) {
            System.out.print(numero + " ");
            numero--;
        }
    }
}
