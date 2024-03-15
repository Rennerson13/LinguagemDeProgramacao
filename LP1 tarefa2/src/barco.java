public class barco {
    //atributos
    private String nome;

    private String tipo;

    private Double peso;

// metodos

    public String nome_barco() {
        return (this.nome);
    }

    public void setNome(String n){
        this.nome=n;
    }

    public String tipo_barco() {
        return (this.tipo);
    }

    public void setTipo(String t){
        this.tipo=t;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPeso(){
        return this.peso;
    }
}
