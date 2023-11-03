package continuada03.atividades.Atividade0111.produtora;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
    private String nome;
    private Integer vagas;
    private List<Ator> atores ;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome){
        Boolean existe = null;
        if (nome != null){
            if (!atores.isEmpty()){
                for (Ator ator: atores) {
                    if (ator.getNome().equalsIgnoreCase(nome)){
                        existe = true;
                    }else{
                        existe = false;
                    }
                }
            }else{
                existe = false;
            }

        }
        return existe;
    };

    public void contratar (Ator ator){
        if (ator != null && !existePorNome(ator.getNome()) && vagas > 0) {
            atores.add(ator);
            vagas--;
        }
    }

    public Integer getQuantidadeAtores(){
        return atores.size();
    };

    public Integer getQuantidadeProtagonistas(){
        Integer total = 0;
        for (Ator ator: atores) {
            if (ator instanceof Protagonista){
                total ++;
            }
        }

        return total;
    };

    public Double getTotalSalarios() {
        Double salarioTotal = 0.0;
        for (Ator ator: atores) {
            salarioTotal += ator.getSalario();
        }
        return salarioTotal;
    };

    public Ator buscarAtorPorNome(String nome){
        for (Ator ator: atores) {
            if (ator.getNome().equalsIgnoreCase(nome)){
                return ator;
            }
        }
        return null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

}
