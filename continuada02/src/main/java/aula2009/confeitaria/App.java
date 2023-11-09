package aula2009.confeitaria;

public class App {
    public static void main(String[] args) {

        Confeitaria bolo1 = new Confeitaria();
        bolo1.sabor = "Chocolate";
        bolo1.preco = 30.00;

        Confeitaria bolo2 = new Confeitaria();
        bolo2.sabor = "Morango";
        bolo2.preco = 40.00;

        Confeitaria bolo3 = new Confeitaria();
        bolo3.sabor = "Abacaxi";
        bolo3.preco = 50.00;

        bolo1.comprarBolo(10);
        bolo2.comprarBolo(20);
        bolo3.comprarBolo(102);
        bolo3.comprarBolo(10);
        bolo3.comprarBolo(15);
        bolo1.comprarBolo(12);

        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();






    }
}
