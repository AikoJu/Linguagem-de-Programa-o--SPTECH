package avaliacao;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro1 = new Livro(123,"Coraline","Neil Gaiman",25.00,16);
        Livro livro2 = new Livro(56,"O gato preto","Edgar Allan Poe",15.80,22);

        livro1.venderLivro();
        livro2.venderLivro(5);
        livro1.venderLivro(17);
        livro2.venderLivro();

        System.out.println(livro1.calcularTotalVendas());
        System.out.println(livro2.calcularTotalVendas());

        livro1.aumentarEstoque(10);

        System.out.println(livro1);
        System.out.println(livro2);
    }
}
