package aula2009.termometro;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double temperaturaAumentar){
        Double temperaturaAumentada = temperaturaAtual + temperaturaAumentar;

        if(temperaturaAumentada > temperaturaMax){
            temperaturaMax = temperaturaAumentada;
        }
        System.out.println("""
                Temperatura atual: %.1fºC
                Temperatura aumentada: %.1fºC
                Temperatura Max: %.1fºC
                Temperatura Min: %.1fºC
                """.formatted(temperaturaAtual, temperaturaAumentada, temperaturaMax,temperaturaMin));

        temperaturaAtual = temperaturaAumentada;
    }
    void diminuiaTemperatura(Double temperaturaDiminuir){

        Double temperaturaDiminuida = temperaturaAtual - temperaturaDiminuir;

        if(temperaturaDiminuida < temperaturaMin){
            temperaturaMin = temperaturaDiminuida;
        }
        System.out.println("""
                Temperatura atual: %.1fºC
                Temperatura diminuida: %.1fºC
                Temperatura Max: %.1fºC
                Temperatura Min: %.1fºC
                """.formatted(temperaturaAtual, temperaturaDiminuida, temperaturaMax,temperaturaMin));

        temperaturaAtual = temperaturaDiminuida;
    }

    void exibeFahreinheit(){
        Double temperaturaFahreinheit = (temperaturaAtual * 1.8) + 32;

        System.out.println("""
                Temperatura atual em Cº: %.1f                
                Temperatura atual em Fº: %.1f                
                """.formatted(temperaturaAtual,temperaturaFahreinheit));

    }
}
