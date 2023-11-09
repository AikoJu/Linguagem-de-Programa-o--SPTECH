package continuada03.exemploclasseabstrata.figura;

public class App {
    public static void main(String[] args) {
        Imagem imagem01 = new Imagem();
        Imagem imagem02 = new Imagem();

        Retangulo retangulo01 = new Retangulo("Rosa",5,10.2,2.0);
        Circulo circulo01 = new Circulo("Vermelho",4,5.1);
        Triangulo triangulo01 = new Triangulo("Azul", 3,5.0,4.6);
        Quadrado quadrado01 = new Quadrado("Amarelo",10,7.0);
        Quadrado quadrado02 = new Quadrado("Vermelho",8,1.2);
        Quadrado quadrado03 = new Quadrado("Verde",2,2.1);

        imagem01.adicionaFigura(retangulo01);
        imagem01.adicionaFigura(circulo01);
        imagem01.adicionaFigura(quadrado03);

        imagem02.adicionaFigura(triangulo01);
        imagem02.adicionaFigura(quadrado01);
        imagem02.adicionaFigura(quadrado02);

        System.out.println("Lista de figuras:");
        imagem01.exibeFiguras();

        System.out.println("Lista de figuras:");
        imagem02.exibeFiguras();

        System.out.println("Soma da area");
        imagem01.exibeSomaArea();
        imagem02.exibeSomaArea();

        System.out.println("Area maior de 20");
        imagem01.exibeFiguraAreaMaior20();
        imagem02.exibeFiguraAreaMaior20();

        System.out.println("Quadrados");
        imagem01.exibeQuadrado();
        imagem02.exibeQuadrado();

    }
}
