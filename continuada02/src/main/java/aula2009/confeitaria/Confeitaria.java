package aula2009.confeitaria;

public class Confeitaria {
        String sabor;
        Double preco;
        Integer qntVendida = 0;

    void comprarBolo(Integer quantidadeVendida){
        Integer verificação = qntVendida + quantidadeVendida;
        if (verificação > 100 ){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }else{
            qntVendida += quantidadeVendida;
        }
    };
    void exibirRelatorio() {
        Double valorFinal = qntVendida * preco;
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f",sabor,qntVendida,valorFinal));
    };

}
