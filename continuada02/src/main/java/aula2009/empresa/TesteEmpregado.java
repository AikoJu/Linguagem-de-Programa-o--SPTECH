package aula2009.empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.nome = "João";
        empregado1.cargo = "Analista de sistemas";
        empregado1.salario = 5400.0;
        empregado1.reajustarSalario(15);

        Empregado empregado2 = new Empregado();
        empregado2.nome = "Larissa";
        empregado2.cargo = "Coordenadora de Projetos";
        empregado2.salario = 7000.0;
        empregado2.reajustarSalario(8);
    }
}
