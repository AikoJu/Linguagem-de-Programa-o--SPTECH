package continuada03.atividades.Atividade0111.consultoria;

public class DevMobile extends Dev {
    private Integer qtdHoraMobile;
    private Double valorHoraMobile;

    public DevMobile(String nome, Integer qtdHoras, Double valorHora, Integer qtdHoraMobile, Double valorHoraMobile) {
        super(nome, qtdHoras, valorHora);
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + qtdHoraMobile * valorHoraMobile ;
    }

    public Integer getQtdHoraMobile() {
        return qtdHoraMobile;
    }

    public void setQtdHoraMobile(Integer qtdHoraMobile) {
        this.qtdHoraMobile = qtdHoraMobile;
    }

    public Double getValorHoraMobile() {
        return valorHoraMobile;
    }

    public void setValorHoraMobile(Double valorHoraMobile) {
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public String toString() {
        return """
                %s
                Quantidade hora mobile: %d
                Valor da hora mobile: %.2f
                """.formatted(super.toString(),qtdHoraMobile,valorHoraMobile);
    }
}
