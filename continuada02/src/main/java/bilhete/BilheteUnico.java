package bilhete;

public class BilheteUnico {
    //Atributos = Caracteristicas
    String nomeTitular;
    Double saldo;

    //Metodos = comportamentos
    void carregar(Double valor){

        System.out.println("""
                Saldo antes de carregar : %.2f""".formatted(saldo));
        saldo += valor;

        System.out.println("""
                Saldo após carregar: %.2f""".formatted(saldo));
    }
}
