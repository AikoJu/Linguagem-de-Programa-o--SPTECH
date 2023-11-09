package desafio;

import java.util.Scanner;

public class TesteCofrinho {
    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho();
        String linha = cofrinho.linha();
        Scanner in = new Scanner(System.in);
        Integer opcaoUsuario;


        do {
            System.out.println("""
                    %s
                    |Bem vindo(a) ao gerenciamento de cofrinhos!|
                    %s                                          
                    |1)Cadastrar novo cofrinho!                 |
                    %s                                          
                    |2)Visualizar cofrinhos!                    |
                    %s                                          
                    |3)Quebrar cofrinho!                        |
                    %s                                          
                    |4)Sacudir cofrinho!                        |
                    %s
                    |5)Sair!
                    """.formatted(linha, linha, linha, linha, linha, linha));
            opcaoUsuario = in.nextInt();

            switch (opcaoUsuario){
                case 1:
                    System.out.println("Qual é a meta?");
                    String meta = in.next();
                    cofrinho.cadastrar(meta);

            }
        } while (opcaoUsuario != 5);
    }
}
