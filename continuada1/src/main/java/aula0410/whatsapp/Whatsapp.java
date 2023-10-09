package continuada1.src.main.java.aula0410.whatsapp;

public class Whatsapp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Marcia","(11)95888-8888");
        Contato contato02 = new Contato("Felipe","(11)98484-4596");
        Contato contato03 = new Contato("Gordox","(11)95555-1234");

        Grupo grupo01 = new Grupo("Duvidas Trabalho");
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        Grupo grupo02 = new Grupo("Alo");
        grupo02.adicionar(contato01);
        grupo02.adicionar(contato03);

        grupo01.exibeContatos();
        grupo02.exibeContatos();

    }
}
