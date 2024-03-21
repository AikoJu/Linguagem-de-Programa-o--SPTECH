public class ProdutoNacional extends Produto{
    private String estadoOrigem;

    public ProdutoNacional(String codigoBarras, String nome, String descricao, Double preco, Integer quantidade, String categoria, String estadoOrigem) {
        super(codigoBarras, nome, descricao, preco, quantidade, categoria);
        this.estadoOrigem = estadoOrigem;
    }

    @Override
    public Double calcularPrecoUnitario() {
        return preco;
    }

    @Override
    public Double calcularPrecoTotal() {
        return preco * quantidade;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    @Override
    public String toString() {
        return """
                Produto Nacional
                %s
                Estado de origem: %s \n""".formatted(super.toString(),estadoOrigem);
    }
}
