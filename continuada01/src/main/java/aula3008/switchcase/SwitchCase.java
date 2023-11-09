package continuada01.src.main.java.aula3008.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer opcao;

        do {
            System.out.println("""
                    1 - Depositar
                    2 - Sacar
                    3 - Rendimento
                    0 - Sair
                    """);
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("11111111111");
                    break;

                case 2:
                    System.out.println("222222222222");
                    break;

                case 3:
                    System.out.println("3333333333");
                    break;

                default:
                    System.out.println("Opa!");
            }
        }while (opcao != 0);

        System.out.println("Tchau!");
    }
}
