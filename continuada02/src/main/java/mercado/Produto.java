package mercado;

public class Produto {
    private String nome;
    private String categoria;
    private Double valor;

    public Produto(String nome, String categoria, Double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return """
                %s
                categoria: %s
                R$%.2f""".formatted(nome,categoria,valor);
    }
}
