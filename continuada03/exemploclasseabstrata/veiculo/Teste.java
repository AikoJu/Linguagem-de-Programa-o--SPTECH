package continuada03.exemploclasseabstrata.veiculo;

public class Teste {
    public static void main(String[] args) {
        Bicicleta bicicleta01 = new Bicicleta("Larissa","Kaloi",2200.00,2015,80.5,70.0);
        Carro carro01 = new Carro("Carlos","Hyundai",50000.0,2020,5.1,true);

        bicicleta01.relatorioDeRevisao();
        carro01.relatorioDeRevisao();
    }
}
