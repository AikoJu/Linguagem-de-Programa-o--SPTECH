package continuada03.exemploclasseabstrata.funcionario;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor01 = new Vendedor("1231223","Larissa",8000.0,2.0);
        Vendedor vendedor02 = new Vendedor("1231223","Manu",10000.0,8.0);
        Horista horista01 = new Horista("123456","Henrique",50, 5.10);

        Empresa empresa01 = new Empresa();

        empresa01.adicionaFunc(vendedor01);
        empresa01.adicionaFunc(vendedor02);
        empresa01.adicionaFunc(horista01);

        empresa01.exibeTodos();
        empresa01.exibeTotalSalario();
    }
}
