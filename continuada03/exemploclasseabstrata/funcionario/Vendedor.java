package continuada03.exemploclasseabstrata.funcionario;

public class Vendedor extends Funcionario {
    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas * taxa / 100;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return """
                %s
                Vendas: %.2f
                Taxa: %.2f
                Total: R$%.2f
                """.formatted(super.toString(),vendas,taxa,calcSalario());
    }
}
