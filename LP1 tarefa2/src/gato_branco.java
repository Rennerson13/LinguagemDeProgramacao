public class gato_branco {
    //atributos
        private String life;
        private String quantidade_patas;
        private String tipo ;


        //métodos


        public void setMostrar(String m){ // transforma o atributo em uma nova string

            this.quantidade_patas=m;
        }
        public String mostrar_patas(){  // transforma o atributo em um objeto

            return(this.quantidade_patas);
        }

        public void setTipo(String t){ // transforma o atributo em uma nova string

            this.tipo=t;
        }
        public String mostrar_especie(){ // transforma o atributo em um objeto

            return(this.tipo);
        }


        // Se a resposta for um numero impar, irá mostrar true, se mostrar um numero par sera falso
        public boolean show_life(int i){
            boolean vivo = true;
            if(i%2==0) vivo = false;
            return vivo;
        }
}
