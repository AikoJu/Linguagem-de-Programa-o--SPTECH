package continuada01.src.main.java.aula2308;

public class TesteMetodos {
    public static void main(String[] args) {
        String nome01 = "Xampson";
        String nome02 = "Julya";

        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();

        System.out.println("Usando a calculadora");
        Double resultado = calc.somar(20.1,70.4);
        Double resultado3 = calc.somar(20.1,70.4);

        System.out.println("Soma " + resultado);
        System.out.println("Soma de 3 " + (resultado3));
        System.out.println("Soma + 10: " + (resultado + 10));

//        util.exibirMensagem(nome01);
//        util.exibirMensagem(nome02);
//        util.exibirNome("Npapa","nanana");
    }
}
