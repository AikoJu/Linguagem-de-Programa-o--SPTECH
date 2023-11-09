package mercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }

    public Integer getQuantidade(){
      Integer quantidadeProdutos = produtos.size();
      return quantidadeProdutos;
    };
    public void adicionar(Produto p){
        produtos.add(p);
    }

    public boolean existsPorNome(String nome){
        Boolean produtoExiste = false;
        for (Produto p : produtos){
            if (p.getNome().equals(nome)){
                produtoExiste = true;
            }
        }
        return produtoExiste;
    };

    public Integer getQuantidadePorCategoria(String nome){
      Integer quantidadeCategoria = 0;
      for (Produto p : produtos){
        if (p.getCategoria().equals(nome)){
            quantidadeCategoria =+ 1;
        }
      }
      return quantidadeCategoria;
    };

    public void limpar(){
        produtos.clear();
    };

    public void removerPorNome(String nome){
        for (int i = 0; i <= produtos.size(); i++){
            Produto produtoDaVez = produtos.get(i);
           if (produtoDaVez.equals(nome)){
               produtos.remove(i);
               i--;
           }
        }
    };

    public void getPorNome(String nome){
        for (Produto p : produtos){
            if (!(p.getNome().equals(nome))){
                System.out.println("Não possuimos esse produto!");
            }
        }
    }

    public double getValorTotal(){
        Double valorTotal = 0.0;

        for (Produto produto : produtos){
            valorTotal += produto.getValor();
        };

        return valorTotal;
    };

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return """
                Carrinho de %s
                Produtos:
                %s
                """.formatted(cliente,produtos);
    }
}