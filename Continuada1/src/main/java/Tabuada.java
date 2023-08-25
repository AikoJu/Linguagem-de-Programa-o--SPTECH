import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número correspondente a operação desejada: \n1 - Soma\n2 - Multiplicação\n3 - Divisão\n4 - Subtração\n0 - Sair\n");
        Integer numeroOperacao = leitor.nextInt();

        if (numeroOperacao == 0) {
            System.out.println("Tchau!");
        } else if (numeroOperacao > 4) {
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
        }
    }
}
