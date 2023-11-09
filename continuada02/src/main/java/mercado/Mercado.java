package mercado;

public class Mercado {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Leite", "Laticinios",4.00);
        Produto produto02 = new Produto("Queijo", "Laticinios",10.00);
        Produto produto03 = new Produto("Suco", "Bebidas",4.84);

        Carrinho carrinho01 = new Carrinho("Fátima");
        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto03);

        System.out.println(carrinho01.existsPorNome("Suco"));
        System.out.println(carrinho01.getQuantidadePorCategoria("Laticinios"));

        Carrinho carrinho02 = new Carrinho("Larissa");
        carrinho02.adicionar(produto02);
        carrinho02.getPorNome("Arroz");

        carrinho01.removerPorNome("Leite");
        carrinho02.limpar();
        System.out.println(carrinho01.getValorTotal());
        System.out.println(carrinho01);
        System.out.println(carrinho02);
    }
}
