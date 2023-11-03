package continuada03.atividades.Atividade0111.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    public Boolean existePorNome(String nome){
        Boolean existe = null;
        if (nome != null){
            if (!devs.isEmpty()){
                for (Dev dev: devs) {
                    if (dev.getNome().equalsIgnoreCase(nome)){
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

    public void contratar (Dev dev){
        if (dev != null && !existePorNome(dev.getNome()) && vagas > 0) {
            devs.add(dev);
                vagas--;
        }
    }

    public Integer getQuantidadeDevs(){
      return devs.size();
    };

    public Integer getQuantidadeDevsMobile(){
      Integer total = 0;
      for (Dev dev: devs) {
            if (dev instanceof DevMobile){
                total ++;
            }
        }

        return total;
    };

    public Double getTotalSalarios() {
        Double salarioTotal = 0.0;
        for (Dev dev: devs) {
             salarioTotal += dev.getSalario();
        }
        return salarioTotal;
    };

    public Dev getDevPorNome(String nome){
        for (Dev dev: devs) {
            if (dev.getNome().equalsIgnoreCase(nome)){
                return dev;
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
