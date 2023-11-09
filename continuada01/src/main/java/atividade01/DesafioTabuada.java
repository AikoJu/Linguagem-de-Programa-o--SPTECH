package continuada01.src.main.java.atividade01;

import java.util.Scanner;

public class DesafioTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número correspondente a operação desejada: \n1 - Soma\n2 - Multiplicação\n3 - Divisão\n4 - Subtração\n5 - Potência\n6 - Resto \n0 - Sair\n");
        Integer numeroOperacao = leitor.nextInt();

        if (numeroOperacao == 0) {
            System.out.println("Tchau!");
        } else if (numeroOperacao > 6) {
            System.out.println("Operação inválida!");
        } else{
            System.out.println("Qual tabuada deseja ver (Inteiro):");
            Integer numeroTabuada = leitor.nextInt();


            if (numeroOperacao == 1) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = i + numeroTabuada;
                    String mensagem = String.format("%d + %d = %d", numeroTabuada, i, resultado);
                    System.out.println(mensagem);

                }
                ;
            }
            if (numeroOperacao == 2) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = i * numeroTabuada;
                    String mensagem = String.format("%d X %d = %d", numeroTabuada, i, resultado);
                    System.out.println(mensagem);
                }
                ;
            }
            if (numeroOperacao == 3) {
                for (int i = 1; i <= 10; i++) {
                    double resultado = numeroTabuada / i ;
                    String mensagem = String.format("%d / %d = %f", numeroTabuada, i, resultado);
                    System.out.println(mensagem);
                };
                System.out.println("\n");
                for (int i = 1; i <= 10; i++) {
                    double resultado =  i / numeroTabuada;
                    String mensagem = String.format("%d / %d = %f",i,numeroTabuada, resultado);
                    System.out.println(mensagem);
                };
            }
            if (numeroOperacao == 4) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = numeroTabuada - i;
                    String mensagem = String.format("%d - %d = %d", numeroTabuada, i, resultado);
                    System.out.println(mensagem);
                };
            }
            if (numeroOperacao == 5) {
                for (int i = 1; i <= 10; i++) {
                   Integer resultado = 1;
                    for(int j = 1; j <= i ; j++){
                            resultado *= numeroTabuada;
                    }
                    String mensagem = String.format("%d ^ %d = %d", numeroTabuada, i, resultado);
                    System.out.println(mensagem);
                };
            }
            if (numeroOperacao == 6) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = numeroTabuada % i;
                    String mensagem = String.format("%d %% %d = %d", numeroTabuada, i, resultado);
                    System.out.println(mensagem);
                };
            }
        }
    }
}
