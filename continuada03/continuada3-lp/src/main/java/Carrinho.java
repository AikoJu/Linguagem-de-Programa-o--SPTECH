import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List <Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    };
    public Boolean existeProdutoPorCodigoBarra(String codigoBarras) {
        for(Produto produto : produtos) {
            return produto.codigoBarras.equalsIgnoreCase(codigoBarras);
        }
        return false;
    };
    public void adicionarProduto(Produto produto){
            if (!existeProdutoPorCodigoBarra(produto.codigoBarras)){
                produtos.add(produto);
                System.out.println("Produto adicionado");
            }else{
                System.out.println("Já possui produto no carrinho");
            }
    };
    public Boolean existePorIndice(Integer indice){
        for (int i = 0; i < produtos.size();i++ ) {
            if (indice - 1 == i) {
                return true;
            }
        }
      return false;
    };
    public void removerProduto (Integer indice){
        if (existePorIndice(indice)){
            produtos.remove(indice - 1);
            System.out.println("Produto removido");
        }else {
            System.out.println("Não há produto para remover");
        }

    };
    public Produto obterProduto(Integer indice){
        if (existePorIndice(indice - 1)){
            System.out.println(produtos.get(indice - 1));
        }
        return null;
    }
    public Double calcularValorTotal(){
        Double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularPrecoTotal();
        }
        return  valorTotal;
    }

    public List<Produto> buscarPorCategoria(String categoria){
        List <Produto> produtosCategoria = new ArrayList<>();
        for (Produto produto: produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)){
                produtosCategoria.add(produto);
            }
        }
        return produtosCategoria;
    }
    public Double calcularValorTotalPorCategoria(String categoria){
        Double valorTotal = 0.0;
        for (Produto produto: buscarPorCategoria(categoria)) {
            valorTotal += produto.calcularPrecoTotal();
        }
        return valorTotal;
    }


    @Override
    public String toString() {
        return "Carrinho\n" +
                "produtos:\n" + produtos;
    }
}
