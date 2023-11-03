package continuada03.heranca;

public class AlunoPos extends Aluno {
    private Double notaArtigo;

    public AlunoPos(String nome, String ra, Double notaProva, Double notaEntrega, Double notaArtigo) {
        super(nome, ra, notaProva, notaEntrega);
        this.notaArtigo = notaArtigo;
    }

    public void exibirAprovacao(){
        if (calcularNotaFinal() > 6){
            System.out.println(nome + " Aprovado!");
        }else{
            System.out.println(nome + " Reprovado");
        }
    }

    @Override
    public Double calcularNotaFinal() {
        return super.calcularNotaFinal() + notaArtigo;
    }

    @Override
    public String toString() {
        return """
                %s
                Nota artigo: %.2f  
                """.formatted(super.toString(),notaArtigo);
    }
}
