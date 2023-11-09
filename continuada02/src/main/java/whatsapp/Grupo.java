package whatsapp;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }

    public void exibeContatos(){
        System.out.println(String.format("Grupo %s",nome));
      for (Contato c : contatos){
          System.out.println(c);
      }
    };

    public void adicionar(Contato c){
        contatos.add(c);
    }public void remover(Contato c){
        contatos.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }


}
