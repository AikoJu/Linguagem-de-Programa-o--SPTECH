public class App {
    public static void main(String[] args) {
        //Herois
        Heroi heroi01 = new Heroi("Homem Aranha","Peter Parker");
        heroi01.adicionaPoder("Soltar Teia",4);
        heroi01.adicionaPoder("Andar em paredes",2);
        heroi01.adicionaPoder("Sentido Aranha",6);

        Heroi heroi02 = new Heroi("Batman","Bruce Wayne");
        heroi02.adicionaPoder("Intelecto de Gênio",10);
        heroi02.adicionaPoder("'Dinheiro'",9);

        //Vilões
        Vilao vilao01 = new Vilao("Duende Verde","Norman Osborn");
        vilao01.adicionaPoder("Força",6);
        vilao01.adicionaPoder("Explosivos",3);

        Vilao vilao02 = new Vilao("Hera Venenosa","Pamela Isley");
        vilao02.adicionaPoder("Imunidade Tóxica",6);
        vilao02.adicionaPoder("Manipulação de plantas",8);
        vilao02.adicionaPoder("Hipnose",8);

        //Confrontos
        Confronto confronto = new Confronto();

        confronto.lutar(heroi01,vilao01);
        confronto.lutar(heroi01,vilao02);
        confronto.lutar(heroi02,vilao01);
        confronto.lutar(heroi02,vilao02);
    }
}
