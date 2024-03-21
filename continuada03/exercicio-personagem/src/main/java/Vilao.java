public class Vilao extends Personagem{
    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double total = 0.0;
        for (SuperPoder poder:poderes) {
            total += poder.getCategoria();
        }
        return total;
    }

}
