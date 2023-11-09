package continuada03.exemploclasseabstrata.figura;

public class Circulo extends Figura {
    private Double raio;
    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI * raio * raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return """
                Circulo
                Raio: %f,
                Cor: %s,
                Espessura: %d,
                Area: %f
                """.formatted(raio,cor,espessura,calculaArea());
    }
}
