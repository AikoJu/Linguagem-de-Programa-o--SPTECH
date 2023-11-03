package continuada03.heranca;

public class Aluno {
    protected String nome;
    protected String ra;
    protected Double notaProva;
    protected Double notaEntrega;

    public Aluno(String nome, String ra, Double notaProva, Double notaEntrega) {
        this.nome = nome;
        this.ra = ra;
        this.notaProva = notaProva;
        this.notaEntrega = notaEntrega;
    }

    public Double calcularNotaFinal(){
        return notaProva + notaEntrega;
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    @Override
    public String toString() {
        return """
                Aluno 
                Nome: %s,
                RA: %s,
                Nota Prova: %.2f
                Nota Entrega :%.2f""".formatted(nome,ra,notaProva,notaEntrega);
    }
}
