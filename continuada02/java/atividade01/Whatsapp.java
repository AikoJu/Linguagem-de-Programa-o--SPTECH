package continuada02.java.atividade01;

import continuada1.src.main.java.aula0410.whatsapp.Contato;
import continuada1.src.main.java.aula0410.whatsapp.Grupo;

public class Whatsapp {
    public static void main(String[] args) {
        continuada1.src.main.java.aula0410.whatsapp.Contato contato01 = new continuada1.src.main.java.aula0410.whatsapp.Contato("Marcia","(11)95888-8888");
        continuada1.src.main.java.aula0410.whatsapp.Contato contato02 = new continuada1.src.main.java.aula0410.whatsapp.Contato("Felipe","(11)98484-4596");
        continuada1.src.main.java.aula0410.whatsapp.Contato contato03 = new Contato("Gordox","(11)95555-1234");

        continuada1.src.main.java.aula0410.whatsapp.Grupo grupo01 = new continuada1.src.main.java.aula0410.whatsapp.Grupo("Duvidas Trabalho");
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        continuada1.src.main.java.aula0410.whatsapp.Grupo grupo02 = new Grupo("Alo");
        grupo02.adicionar(contato01);
        grupo02.adicionar(contato03);

        grupo01.exibeContatos();
        grupo02.exibeContatos();

    }
}
