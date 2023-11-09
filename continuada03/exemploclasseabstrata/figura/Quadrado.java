package continuada03.exemploclasseabstrata.figura;

public class Quadrado  extends Figura{
    private Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return lado * lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return """
                Quadrado
                Lado : %s,
                Cor: %s,
                Espessura: %d,
                Area: %f
                """.formatted(lado,cor,espessura,calculaArea());
    }
}
