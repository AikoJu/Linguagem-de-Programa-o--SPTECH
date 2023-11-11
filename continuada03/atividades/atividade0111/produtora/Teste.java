package continuada03.atividades.atividade0111.produtora;

public class Teste {
    public static void main(String[] args) {
        Ator ator1 = new Ator("Márcia", 100,80.0);
        Ator ator2 = new Ator("Valéria", 400,200.0);
        Ator ator3 = new Ator("Paula", 100,79.5);
        Protagonista protagonista1 = new Protagonista("Miranda", 700,500.0,600,100.0);
        Protagonista protagonista2 = new Protagonista("Momo", 400,421.1,60,79.0);
        Protagonista protagonista3 = new Protagonista("Suzuka", 245,499.23,70,56.0);

        Produtora produtora1 = new Produtora("Warnar",5);
        Produtora produtora2 = new Produtora("Blumcasa",2);

        produtora1.contratar(ator1);
        produtora1.contratar(protagonista2);
        produtora1.contratar(ator2);

        produtora2.contratar(ator2);
        produtora2.contratar(protagonista3);
        produtora2.contratar(protagonista1);

        System.out.println(produtora1.buscarAtorPorNome("Márcia"));
        System.out.println(produtora2.buscarAtorPorNome("Miranda"));

        System.out.println(produtora2.getQuantidadeAtores());
        System.out.println(produtora2.getQuantidadeProtagonistas());

        System.out.println(produtora1.getTotalSalarios());
        System.out.println(produtora2.getTotalSalarios());


    }
}
