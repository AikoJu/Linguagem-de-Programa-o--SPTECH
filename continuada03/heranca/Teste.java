package continuada03.heranca;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Larissa","123", 3.0,5.0);
        AlunoPos alunoPos01 = new AlunoPos("Raissa","124",2.4,5.0,7.0);
        Faculdade faculdade01 = new Faculdade("Bandtec");

        faculdade01.getAlunos().add(aluno01);
        faculdade01.getAlunos().add(alunoPos01);

        System.out.println(aluno01);
        System.out.println("\n Alunos Pós");
        System.out.println(alunoPos01);

        System.out.println("Nota Final:" + aluno01.calcularNotaFinal());
        System.out.println("Nota Final:" + alunoPos01.calcularNotaFinal());

        alunoPos01.exibirAprovacao();
        faculdade01.exibirAlunos();
    }
}
