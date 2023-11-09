package continuada01.src.main.java.atividade02.validacaonumerica;

import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica validacao = new ValidacaoNumerica();

        Integer numUsuario = 0;


        System.out.println("Digite um número para saber se é primo: ");


        do {
            numUsuario = leitor.nextInt();

            if(numUsuario >= 0){
                validacao.verificarPrimo(numUsuario);
            }

        }while(numUsuario >= 0);

        System.out.println("Tchau!");

    }
}
