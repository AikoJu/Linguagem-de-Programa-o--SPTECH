package continuada1.src.main.java.atividade02.calculonutricao;

import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao calc = new CalculoNutricao();

        System.out.println("Quantas pessoas calcularão o IMC?");
        Integer qtdPessoas = leitor.nextInt();

        for (int i = 1; i <= qtdPessoas; i++){
            System.out.println("Digite a altura: ");
            Double altura = leitor.nextDouble();
            System.out.println("Digite o peso: ");
            Double peso = leitor.nextDouble();

            calc.calculaIMC(altura,peso);
        };

    }
}
