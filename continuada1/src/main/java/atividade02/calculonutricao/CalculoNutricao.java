package continuada1.src.main.java.atividade02.calculonutricao;

public class CalculoNutricao {
    void calculaIMC(Double altura, Double peso){

        Double imc = peso /(altura * altura);

        System.out.println("""
                            Com %.2f de altura,
                            pesando %.2f,
                            Seu IMC é de: %.2f.
                """.formatted(altura,peso,imc));
    }
 }
