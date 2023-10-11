package continuada1.src.main.java.atividade02.descontoprogressivo;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo calc = new DescontoProgressivo();

        System.out.println("Bem-vindo ao sistema de desconto progressivo! \n\nDigite o valor unitário do produto:");
        Double valorProduto = leitor.nextDouble();
        System.out.println("Digite a quantidade: ");
        Integer qtdProduto = leitor.nextInt();

        calc.exibirNotaFiscal(valorProduto,qtdProduto);

    }
}
