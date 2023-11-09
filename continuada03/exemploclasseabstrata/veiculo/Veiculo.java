package continuada03.exemploclasseabstrata.veiculo;

import java.time.LocalDateTime;

public abstract class Veiculo {
    protected String nomeProprietario;
    protected String marca;
    protected Double valor;
    protected Integer anoFabricacao;

    public Veiculo(String nomeProprietario, String marca, Double valor, Integer anoFabricacao) {
        this.nomeProprietario = nomeProprietario;
        this.marca = marca;
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void relatorioDeRevisao();

    public Integer tempoDeVida(){
       Integer ano =  LocalDateTime.now().getYear();
       return ano - anoFabricacao;
    };



    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
