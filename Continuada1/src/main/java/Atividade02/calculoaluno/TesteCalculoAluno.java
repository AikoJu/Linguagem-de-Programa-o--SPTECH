package ex2.calculoaluno;

import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite duas notas:");
        Double nota1 = leitor.nextDouble();
        Double nota2 = leitor.nextDouble();

        calcularMedia calcMedia = new calcularMedia();

        Double media = calcMedia.calcularMedia(nota1,nota2);
        System.out.println("""
                       Sua média foi de: %.1f     
                """.formatted(media));
    }
}
