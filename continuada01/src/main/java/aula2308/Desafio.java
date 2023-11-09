package continuada01.src.main.java.aula2308;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double num1 = 0.0;
        Double num2 = 0.0;
        Integer numOperacao = 0;

        Calculadora calc = new Calculadora();

        System.out.println("Digite 2 números: ");
        num1= leitor.nextDouble();
        num2= leitor.nextDouble();

        System.out.println("""
                            Escolha uma operação: 
                            1 - Somar 
                            2 - Subtrair
                            3 - Multiplicar
                            4 - Dividir
                """);
        numOperacao = leitor.nextInt();



    }
}
