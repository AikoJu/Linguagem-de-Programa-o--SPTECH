package continuada03.exemploclasseabstrata.figura;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionaFigura(Figura f) {
        figuras.add(f);
    }

    public void exibeFiguras() {
        for (Figura figura : figuras) {
            System.out.println("""
                    %s""".formatted(figura));
        }
    }

    public void exibeSomaArea() {
        for (Figura figura : figuras) {
            Double total = 0.0;
            total += figura.calculaArea();
            System.out.println(total);
        }
    }

    public void exibeFiguraAreaMaior20() {
        for (Figura figura : figuras) {
            if (figura.calculaArea() > 20.0) {
                System.out.println(figura);
            }
        }
    }

    public void exibeQuadrado() {
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                System.out.println(figura);
            }
        }
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}