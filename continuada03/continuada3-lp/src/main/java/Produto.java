public abstract class Produto {
    protected String codigoBarras;
    protected String nome;
    protected String descricao;
    protected Double preco;
    protected Integer quantidade;
    protected String categoria;


    public Produto(String codigoBarras, String nome, String descricao, Double preco, Integer quantidade, String categoria) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public abstract Double calcularPrecoUnitario();
    public abstract Double calcularPrecoTotal();

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return """
                Código de Barras: %s
                Nome: %s
                Descrição: %s
                Preço: %.2f
                Quantidade: %d
                Categoria: %s""".formatted(codigoBarras,nome,descricao,preco,quantidade,categoria);
    }
}
