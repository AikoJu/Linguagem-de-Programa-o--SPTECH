package aula2009.termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 23.0;
        termometro.temperaturaMin = 15.0;
        termometro.temperaturaMax = 30.0;

        termometro.aumentaTemperatura(2.0);
        termometro.diminuiaTemperatura(14.0);
        termometro.exibeFahreinheit();
    }
}
