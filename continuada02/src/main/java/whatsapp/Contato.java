package whatsapp;

public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    public void bloquear(){
        bloqueado = true;
    }public void desbloquear(){
        bloqueado = false;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return """
                Contato
                Nome = %s
                Telefone = %s 
                Bloqueado = %b \n""".formatted(nome,telefone,bloqueado);
    }
}
