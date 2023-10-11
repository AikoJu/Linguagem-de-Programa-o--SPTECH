package continuada1.src.main.java.atividade02.descontoprogressivo;

public class DescontoProgressivo {
    Double calcularDesconto(Double valor, Integer quantidade){
        Double valorTotal = 0.0;
        Double valorFinal = 0.0;

        valorTotal = valor * quantidade;

        if(quantidade == 1){
            valorFinal = valorTotal - (valorTotal * 0.1);
        };
        if (quantidade == 2){
            valorFinal = valorTotal - (valorTotal * 0.2);
        };
        if (quantidade >= 3){
            valorFinal = valorTotal - (valorTotal * 0.3);
        };
        return valorFinal;
}

    void linha (){
        System.out.println("-----------------------------------------------");
    };

    void exibirNotaFiscal(Double valor, Integer quantidade){
        Double valorFinal = calcularDesconto(valor,quantidade);

        linha();
        System.out.println("""
                            Valor do produto: R$%.2f
                            Quantidade: %d""".formatted(valor,quantidade));
        linha();
        System.out.println(String.format("Valor com desconto: R$%.2f",(valorFinal)));

    }
}

