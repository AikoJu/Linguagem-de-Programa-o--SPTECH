import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        Double primeiraNota = leitor.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double segundaNota = leitor.nextDouble();

        Double media = (primeiraNota * 0.4) + (segundaNota * 0.6);

        String mensagem = """
                             Primeira nota: %.2f
                             Segunda nota: %.2f
                             Sua média é %.2f """.formatted(primeiraNota,segundaNota,media);


        System.out.println(mensagem);
    }
}
