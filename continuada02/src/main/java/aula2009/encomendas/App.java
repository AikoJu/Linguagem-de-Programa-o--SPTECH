package aula2009.encomendas;

public class App {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda();
        encomenda1.tamanho = "P";
        encomenda1.enderecoRemetente = "Rua polo, 123";
        encomenda1.enderecoDestinatario = "Rua aloalo, 56";
        encomenda1.distancia = 25.8;
        encomenda1.valorEncomenda = 80.0;
        encomenda1.emitirEtiqueta();

        Encomenda encomenda2 = new Encomenda();
        encomenda2.tamanho = "M";
        encomenda2.enderecoRemetente = "Rua lopes, 55";
        encomenda2.enderecoDestinatario = "Rua opal, 700";
        encomenda2.distancia = 180.0;
        encomenda2.valorEncomenda = 20.0;
        encomenda2.emitirEtiqueta();

        Encomenda encomenda3 = new Encomenda();
        encomenda3.tamanho = "G";
        encomenda3.enderecoRemetente = "Rua pelels, 745";
        encomenda3.enderecoDestinatario = "Rua flores, 11";
        encomenda3.distancia = 1840.0;
        encomenda3.valorEncomenda = 400.0;
        encomenda3.emitirEtiqueta();

    }
}
