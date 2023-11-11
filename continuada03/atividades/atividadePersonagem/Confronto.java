package continuada03.atividades.atividadePersonagem;

public class Confronto {
    public void lutar(Heroi heroi, Vilao vilao){
        if (heroi.getForcaTotal() > vilao.getForcaTotal()) {
            System.out.println("""
                    %s VS %s
                    O grande vencedor é:
                    %s
                    O bem venceu!
                    """.formatted(heroi.codinome,vilao.codinome,heroi.codinome));
        } else if (heroi.getForcaTotal() < vilao.getForcaTotal()) {
            System.out.println("""
                    %s VS %s
                    O grande vencedor é:
                    %s
                    O mau venceu!
                    """.formatted(heroi.codinome,vilao.codinome,vilao.codinome));
        }else{
            System.out.println("Empate??????");
        }
    }
}
