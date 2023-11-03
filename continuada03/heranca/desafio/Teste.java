package continuada03.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
    VendedorComissao vendedorComissao01 = new VendedorComissao(123,"João",850.00,8.0);
    VendedorComissaoMaisFixo vendedorComissao02 = new VendedorComissaoMaisFixo(123,"Maria",850.00,8.0,5000.0);

        System.out.println(vendedorComissao01.calcularSalario());
        System.out.println(vendedorComissao02.calcularSalario());


    }
}
