package encapsulamentoatividade.controledeestimativa;

public class ControleTeste {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("Atividade 15", "Kaique", 8);
        Atividade atividade02 = new Atividade("Atividade 20", "Julia", 9);
        Atividade atividade03 = new Atividade("Atividade 5", "Felipe", 15);

        atividade01.terminarAtividade(8);
        atividade02.terminarAtividade(10);
        atividade03.terminarAtividade(10);

        atividade01.exibirRelatorio();
        System.out.println(atividade01);

        atividade02.exibirRelatorio();
        System.out.println(atividade02);

        atividade03.exibirRelatorio();
        System.out.println(atividade03);

    }
}
