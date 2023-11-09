package encapsulamentoatividade.gestaopetshop;

public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetShop;
    private Double valorGastoEmPetShop;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasAoPetShop = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasAoPetShop() {
        return qtdVisitasAoPetShop;
    }

    public void setQtdVisitasAoPetShop(Integer qtdVisitasAoPetShop) {
        this.qtdVisitasAoPetShop = qtdVisitasAoPetShop;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    @Override
    public String toString() {
        return """
                Pet
                Nome = %s
                Raça = %s
                Visitas Ao PetShop = %d
                Gasto Em PetShop = %.2f
               """.formatted(nome,raca,qtdVisitasAoPetShop,valorGastoEmPetShop);
    }
}
