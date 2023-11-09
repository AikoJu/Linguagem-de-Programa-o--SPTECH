package continuada01.src.main.java.aula3008.investimentos;

import java.util.Scanner;

public class Investimentos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double saldoUsuario = 0.0;

        InvestimentoMetodos calc = new InvestimentoMetodos();
        String linha = calc.linha();

        Integer opcaoUsuario;
        do {
            System.out.println("""
                    %s
                    |    SPTech Investimentos   |
                    %s
                    | Olá, o que deseja fazer:  |
                    %s
                    |1 - Depositar              |
                    |2 - Sacar                  |
                    |3 - Simular rendimentos    |
                    |0 - Sair                   |
                    %s
                    """.formatted(linha, linha, linha, linha));
            opcaoUsuario = in.nextInt();

            if (opcaoUsuario == 1) {
                System.out.println("Digite o valor do depósito:");
                Double valorDeposito = in.nextDouble();
                saldoUsuario = calc.deposito(saldoUsuario,valorDeposito);

            } else if (opcaoUsuario ==  2) {
                System.out.println("Digite o valor do saque:");
                Double valorSaque = in.nextDouble();
                saldoUsuario = calc.saque(saldoUsuario,valorSaque);

            } else if (opcaoUsuario == 3) {

            }else if (opcaoUsuario >= 4){
                System.out.println("Escolha uma opção válida:");
                opcaoUsuario = in.nextInt();
            }
        } while (opcaoUsuario != 0);

        System.out.println("Tchau!");
    }
}
