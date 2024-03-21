public class ProdutoImportado extends Produto{
    private Double taxaImportacao;
    private String paisOrigem;

    public ProdutoImportado(String codigoBarras, String nome, String descricao, Double preco, Integer quantidade, String categoria, Double taxaImportacao, String paisOrigem) {
        super(codigoBarras, nome, descricao, preco, quantidade, categoria);
        this.taxaImportacao = taxaImportacao;
        this.paisOrigem = paisOrigem;
    }

    @Override
    public Double calcularPrecoUnitario() {
        return preco + (preco * taxaImportacao / 100);
    }

    @Override
    public Double calcularPrecoTotal() {
        return calcularPrecoUnitario() * quantidade;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return """
                ProdutoImportado
                %s
                Preço Unitário com taxa: %.2f
                País de Origem: %s\n""".formatted(super.toString(),calcularPrecoUnitario() ,paisOrigem);
    }
}
