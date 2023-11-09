package continuada01.src.main.java.atividade01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Morango");
        frutas.add("Laranja");
        frutas.add("Limão");
        frutas.add("Kiwi");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Veja se sua fruta favorita está na lista:");
        String frutaUsuario = leitor.nextLine();

        int frutaListada = 0;

        for (int i = 0; i < frutas.size(); i++) {
            if (frutaUsuario.equalsIgnoreCase(frutas.get(i))) {
                frutaListada++;
            };
        }
        String mensagem = String.format("A fruta %s existe na lista", frutaUsuario);
        String mensagem2 = String.format("Não existe a fruta %s na lista", frutaUsuario);

        if (frutaListada > 0){
            System.out.println(mensagem);
        }else {
            System.out.println(mensagem2);
        }
    }
}
