package continuada03.atividades.atividade0111.produtora;

public class Protagonista  extends Ator{

    private Integer qtdHoraTrabalhadasProtagonista;

    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada, Integer qtdHoraTrabalhadasProtagonista, Double valorHoraTrabalhadaProtagonista) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasProtagonista = qtdHoraTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + qtdHoraTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista;
    }

    public Integer getQtdHoraTrabalhadasProtagonista() {
        return qtdHoraTrabalhadasProtagonista;
    }

    public void setQtdHoraTrabalhadasProtagonista(Integer qtdHoraTrabalhadasProtagonista) {
        this.qtdHoraTrabalhadasProtagonista = qtdHoraTrabalhadasProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public String toString() {
        return """
                %s
                Horas Protagonista: %d
                Valor Hora Protagonista: %.2f""".formatted(super.toString(),qtdHoraTrabalhadasProtagonista,valorHoraTrabalhadaProtagonista);
    }
}
