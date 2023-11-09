package continuada01.src.main.java;

import java.util.Scanner;

public class JulyaAikoRodriguesAono {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer opcaoUsuario = 0;
        Integer pontoUsuario = 0;


       do {
           System.out.println(("""
                   *------------------------------*
                   | Bem Vindo a Café Tech!       |
                   *------------------------------*
                                   
                   *------------------------------*
                   |Digite a opção desejada:      |
                   |1) Registrar pontos           |
                   |2) Trocar pontos por café     |
                   |3) Simular recarga programada |
                   |4) Sair                       |
                   *------------------------------*
                   """));

           opcaoUsuario = in.nextInt();
           switch (opcaoUsuario) {
               case 1:
                   System.out.println("Quantos pontos deseja cadastrar:");
                   Integer pontosCadastrar = in.nextInt();
                   if (pontosCadastrar < 0){
                       System.out.println("Valor inválido!");
                   }else{
                       pontoUsuario += pontosCadastrar;
                       System.out.println(String.format("Recarga efetuada! Quantidade atual de pontos: %d",pontoUsuario));
                   }
                   break;

               case 2:
                   System.out.println("Informe a quantidade de cafés desejada:");
                   Integer quantidadeCafe = in.nextInt();
                   Integer resgateCafe = quantidadeCafe * 10;
                   if (resgateCafe > pontoUsuario){
                       System.out.println("""
                               *-----------------Atenção-----------------*
                               Pontos insuficientes para comprar %d cafés
                               Pontos necessários: %d
                               Saldo atual de pontos: %d
                               """.formatted(quantidadeCafe,resgateCafe,pontoUsuario));
                   }else{
                       pontoUsuario -= resgateCafe;
                       System.out.println(String.format("Preparando café! Saldo atual de pontos: %d",pontoUsuario));
                   }

                   break;

               case 3:
                   System.out.println("Informe a quantidade mensal de pontos:");
                   Integer quantidadePontosMensal = in.nextInt();
                   Integer totalPontos = pontoUsuario ;

                   System.out.println("Por quantos meses deseja realizar essa recarga?");
                   Integer quantidadeMeses = in.nextInt();

                   System.out.println("""
                           *--------------------------*
                           Saldo atual de pontos: %d
                           """.formatted(pontoUsuario));
                   for (int i = 1 ; i <= quantidadeMeses; i++){

                       totalPontos += quantidadePontosMensal;
                       System.out.println("""
                               *--------------------------*
                               Saldo no %dº Mês = %d
                               """.formatted(i,totalPontos));

                   }
                   Integer quantidadeCafeMensal = totalPontos/10;
                   System.out.println(String.format("Com esse saldo você consegue tomar %d cafés!",quantidadeCafeMensal));


                   break;

               default:
                   System.out.println("Valor inválido");
           }

       }while (opcaoUsuario != 4);
        System.out.println("Tchau!");
    }
}
