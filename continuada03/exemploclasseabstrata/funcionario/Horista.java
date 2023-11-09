package continuada03.exemploclasseabstrata.funcionario;

public class Horista extends Funcionario {
    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return """
                %s
                Quantidade de Horas: %d
                Valor por Hora: %.2f
                Total: R$ %.2f
                """.formatted(super.toString(),qtdHora,valorHora,calcSalario());
    }
}
