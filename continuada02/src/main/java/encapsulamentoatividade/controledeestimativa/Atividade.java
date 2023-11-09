package encapsulamentoatividade.controledeestimativa;

public class Atividade {
    private String nomeAtividade;
    private  String responsavel;
    private  Integer diasEstimados;
    private  Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;
    };

    public void exibirRelatorio(){
        if(diasUsados > diasEstimados){
            Integer diasAMais = diasUsados - diasEstimados;
            System.out.println("""
                    Você estimou %d dias, mas a tarefa foi
                    feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa.
                    """.formatted(diasEstimados,diasUsados,diasAMais));

        } else if (diasUsados < diasEstimados) {
            Integer diasAMenos = diasEstimados - diasUsados;
            System.out.println("""
                    Você estimou %d
                    dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado).
                    Parabéns!
                    """.formatted(diasEstimados,diasUsados,diasAMenos));
        }else{
            System.out.println("""
                    Você estimou %d dias, e a tarefa foi feita em %d dias, 
                    atendendo a estimativa com precisão
                    """.formatted(diasEstimados,diasUsados));
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    @Override
    public String toString() {
        return "ControleDeEstimativa{" +
                "nomeAtividade='" + nomeAtividade + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", diasEstimados=" + diasEstimados +
                ", diasUsados=" + diasUsados +
                '}'+ '\n';
    }
}
