package continuada03.exemploclasseabstrata.figura;

public class Retangulo extends Figura{
    private  Double base;
    private  Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {

        return base * altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return """
                Retangulo
                Base: %f
                Altura: %f
                Cor: %s,
                Espessura: %d
                Area: %f
                """.formatted(base,altura,cor,espessura,calculaArea());
    }
}
