package continuada1.src.main.java.atividade02.idade;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idadeUsuario = leitor.nextInt();

        Idade idade = new Idade();

        idade.classificaIdade(idadeUsuario);

    }
}
