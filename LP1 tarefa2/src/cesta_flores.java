public class cesta_flores {
    //atributos
    private String nome;

    private String cor;

    private Double quantidade;

// metodos

    public String nome_flor() {
        return (this.nome);
    }

    public void setNome(String n){
        this.nome=n;
    }

    public String tipo_cor() {
        return (this.cor);
    }

    public void setTipo(String t){
        this.cor=t;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public Double getQuantidade(){
        return this.quantidade;
    }
}
