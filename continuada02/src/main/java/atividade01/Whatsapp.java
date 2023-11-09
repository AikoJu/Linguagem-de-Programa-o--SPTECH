package atividade01;

import whatsapp.Contato;
import whatsapp.Grupo;

public class Whatsapp {
    public static void main(String[] args) {
        whatsapp.Contato contato01 = new whatsapp.Contato("Marcia","(11)95888-8888");
        whatsapp.Contato contato02 = new whatsapp.Contato("Felipe","(11)98484-4596");
        whatsapp.Contato contato03 = new Contato("Gordox","(11)95555-1234");

        whatsapp.Grupo grupo01 = new whatsapp.Grupo("Duvidas Trabalho");
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        whatsapp.Grupo grupo02 = new Grupo("Alo");
        grupo02.adicionar(contato01);
        grupo02.adicionar(contato03);

        grupo01.exibeContatos();
        grupo02.exibeContatos();

    }
}
