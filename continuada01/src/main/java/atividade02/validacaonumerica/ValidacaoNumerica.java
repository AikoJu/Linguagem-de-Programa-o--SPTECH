package continuada01.src.main.java.atividade02.validacaonumerica;

public class ValidacaoNumerica {

        void verificarPrimo(Integer num){
            Integer divisores = 0;
            for (int i = 1; i <= num; i++) {
                if(num % i == 0){
                    divisores++;
                }
            }
            if(divisores == 2){
                System.out.println(String.format("O número %d é primo!", num));
            }else {
                System.out.println(String.format("O número %d não é primo!", num));
        }
    }

}
