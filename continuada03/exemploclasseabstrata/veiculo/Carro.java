package continuada03.exemploclasseabstrata.veiculo;

public class Carro extends Veiculo {
    private Double nivelOleo;
    private Boolean possuiEstepe;

    public Carro(String nomeProprietario, String marca, Double valor, Integer anoFabricacao, Double nivelOleo, Boolean possuiEstepe) {
        super(nomeProprietario, marca, valor, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatório de Revisão de Carro:");
        if (possuiEstepe){
            System.out.println("Estepe ok!");
        }else{
            System.out.println("Não possui estepe, compre conosco!");
        }

        if (nivelOleo < 1.5){
            System.out.println("Nível de óleo baixo, compre conosco!");
        }else {
            System.out.println("Nível de óleo ok!");
        }
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nivelOleo=" + nivelOleo +
                ", possuiEstepe=" + possuiEstepe +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
