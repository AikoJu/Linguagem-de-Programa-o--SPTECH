package aula2009.empresa;

public class Empregado {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer porcentagemReajuste){
        Double salarioReajustado = salario + ((salario * porcentagemReajuste)/100);

        System.out.println("""
                O funcionário %s de cargo %s, recebe atualmente %.2f. 
                Com o reajuste de %d seu salário ficou %.2f
                """.formatted(nome,cargo,salario,porcentagemReajuste,salarioReajustado));
    }
}
