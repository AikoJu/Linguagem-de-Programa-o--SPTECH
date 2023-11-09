package desafio;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    List listaCofrinhos = new ArrayList();
    String propositoCofrinho;
    Double saldoCofrinho;
    Boolean quebrado;

    String linha(){
      String linha = "--------------------------------------------";
        return linha;
    }
    void depositarCofrinho(Double valor) {
        System.out.println("""
                Valor anterior ao depósito: %.2f
                """.formatted(saldoCofrinho));
        saldoCofrinho += valor;
        System.out.println("""
                Valor atual: %.2f
                """.formatted(saldoCofrinho));
    }

    void cadastrar(String meta){
        listaCofrinhos.add(meta);
        System.out.println("Cofrinho Adicionado!");
    }

}
