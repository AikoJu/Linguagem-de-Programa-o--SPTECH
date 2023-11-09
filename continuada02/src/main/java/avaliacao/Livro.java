package avaliacao;

public class Livro {
    private Integer codigo;
    private String titulo;
    private String autor;
    private Double preco;
    private Integer quantidadeVendida;
    private Integer quantidadeEstoque;

    public Livro(Integer codigo, String titulo, String autor, Double preco, Integer quantidadeEstoque) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeVendida = 0;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void venderLivro(){
        if (quantidadeEstoque > 0){
            quantidadeVendida += 1;
            quantidadeEstoque -= 1;
            System.out.println("Livro vendido!");
        }else{
            System.out.println("Livro indisponível!");
        }
    }
    public void venderLivro(Integer quantidade){
      if(quantidade > quantidadeEstoque || quantidade < 1)
          System.out.println("Venda inválida!");
      else
          System.out.println("Livros vendidos!");
          quantidadeVendida += quantidade;
          quantidadeEstoque -= quantidade;

    }

    public Double calcularTotalVendas(){
      Double valorTotal =  preco * quantidadeVendida;
        return valorTotal;
    };

    public void aumentarEstoque(Integer quantidade){
        if (quantidade > 0 ){
            quantidadeEstoque += quantidade;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return """
                Livro %s 
                Codigo:%d
                Autor: %s
                Preco: R$%.2f
                Quantidade Vendida: %d
                Quantidade em Estoque: %d
                """.formatted(titulo,codigo,autor,preco,quantidadeVendida,quantidadeEstoque);
    }
}
