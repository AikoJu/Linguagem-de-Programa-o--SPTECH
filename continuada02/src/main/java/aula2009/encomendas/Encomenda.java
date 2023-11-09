package aula2009.encomendas;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia = 0.0;
    Double valorEncomenda = 0.0;

    Double calcularFrete(){
        Double addTamanho = 0.0;
        Double addDistancia = 3.0;
        if(tamanho.equals("P") ){
            addTamanho = 0.01;
        }else if (tamanho.equals("M")){
            addTamanho = 0.03;
        }else if (tamanho.equals("G")){
            addTamanho = 0.05;
        }
        if (distancia >= 51.0 && distancia <= 200.0){
            addDistancia = 5.0;
        }else if (distancia > 200.0){
            addDistancia = 7.0;
        }
        Double frete = (valorEncomenda * addTamanho) + addDistancia;

        return frete;
    };

    void emitirEtiqueta(){
        Double frete = calcularFrete();
        Double valorTotal = frete + valorEncomenda ;
        String tamanhoTexto = "Pequeno";

        if (tamanho.equals("P")){
            tamanhoTexto = "Pequeno";
        } else if (tamanho.equals("M")) {
            tamanhoTexto = "Médio";
        } else if (tamanho.equals("G")) {
            tamanhoTexto = "Grande";
        }

        System.out.println("""
                    ********* ETIQUETA PARA ENVIO *********
                    Endereço do remetente: %s
                    Endereço do destinatário: %s
                    Tamanho: %s
                --------------------------------------------------
                    Valor encomenda: R$ %.2f
                    Valor frete: R$ %.2f
                --------------------------------------------------
                    Valor total: R$ %.2f
                """.formatted(enderecoRemetente,enderecoDestinatario,tamanhoTexto,valorEncomenda,frete,valorTotal));
    };
}