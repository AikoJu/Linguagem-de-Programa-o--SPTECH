package continuada03.exemploclasseabstrata.veiculo;

public class Bicicleta extends Veiculo {
    private Double calibragemPneu;

    private Double pesoCiclista;

    public Bicicleta(String nomeProprietario, String marca, Double valor, Integer anoFabricacao, Double calibragemPneu, Double pesoCiclista) {
        super(nomeProprietario, marca, valor, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatório de Revisão da bicicleta:");
        if (pesoCiclista <= 70.0 && calibragemPneu >78.0){
            System.out.println("Ajuste a calibragem");
        }else{
            System.out.println("Calibragem o");
        }
    }

    public Double getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Double calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    public Double getPesoCiclista() {
        return pesoCiclista;
    }

    public void setPesoCiclista(Double pesoCiclista) {
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "calibragemPneu=" + calibragemPneu +
                ", pesoCiclista=" + pesoCiclista +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
