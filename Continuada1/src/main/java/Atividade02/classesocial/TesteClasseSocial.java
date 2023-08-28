package ex1.classesocial;

import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in) ;
        CalculoIBGE calc = new CalculoIBGE();

        System.out.println("Digite sua renda: ");
        Double rendaUsuario = leitor.nextDouble();

        Double salarios = calc.quantidadeSalariosMinimos(rendaUsuario);
        String classe = calc.classeSocial(salarios);



        System.out.println("""
                            Você recebe aproximadamente %.1f salários-mínimos.
                            Você pertence a classe social: %s.
                """.formatted(salarios,classe));

    }
}
