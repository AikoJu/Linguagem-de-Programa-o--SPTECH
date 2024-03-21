public class Compra {
    public static void main(String[] args) {
        ProdutoImportado produtoImportado01 = new ProdutoImportado("123","Vestido","Vestido Rosa",25.00,1,"Vestuário",5.0,"Alemanha");
        ProdutoNacional produtoNacional01 = new ProdutoNacional("125","Boné","Boné vermelho", 12.00,2,"Chapéus","São Paulo");
        ProdutoNacional produtoNacional02 = new ProdutoNacional("124","Bucket Hat","Feio", 15.00,2,"Chapéus","São Paulo");

        Carrinho carrinho01 = new Carrinho();

        carrinho01.adicionarProduto(produtoImportado01);
        System.out.println(carrinho01.existeProdutoPorCodigoBarra("123"));
        System.out.println(carrinho01);
        System.out.println(carrinho01.existePorIndice(2));
        System.out.println("\n" + carrinho01);
        carrinho01.adicionarProduto(produtoNacional01);
        carrinho01.obterProduto(2);
        System.out.println("\n" +carrinho01);
        carrinho01.adicionarProduto(produtoNacional02);
        System.out.println(carrinho01.buscarPorCategoria("Chapéus"));
        carrinho01.removerProduto(1);
        carrinho01.adicionarProduto(produtoNacional02);
        System.out.println("Valor total do carrinho: R$" + carrinho01.calcularValorTotal() + "\n");
        System.out.println("Valor total do carrinho por categoria: R$" + carrinho01.calcularValorTotalPorCategoria("Chapéus") + "\n");
        System.out.println(carrinho01);

    }
}
