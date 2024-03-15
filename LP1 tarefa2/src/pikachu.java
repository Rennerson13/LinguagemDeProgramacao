public class pikachu {
        //atributos
        private String nome;

        private String tipo;

        private Double ataque;

// metodos

        public String nome_pokemon() {
            return (this.nome);
        }

        public void setNome(String n){
            this.nome=n;
        }

        public String tipo_pokemon() {
            return (this.tipo);
        }

        public void setTipo(String t){
            this.tipo=t;
        }

        public void setAtaque(Double ataque) {
            this.ataque = ataque;
        }
        public Double getAtaque(){
            return this.ataque;
        }
}


