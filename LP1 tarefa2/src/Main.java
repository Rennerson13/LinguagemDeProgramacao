// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        pikachu s1;
        s1 = new pikachu();
        s1.setNome("Pikachu");
        System.out.println("Qual é esse pokémon? " + s1.nome_pokemon());
        s1.setTipo("Elétrico");
        System.out.println("Qual tipo: " + s1.tipo_pokemon());
        s1.setAtaque(31.2);
        System.out.println("Quantos o peso dele: " + s1.getAtaque());

        gato_branco s2=new gato_branco();
        s2.show_life(2);
        s2.setTipo("Gato");
        System.out.println("Especie: " + s2.mostrar_especie());
        s2.setMostrar("4");
        System.out.println("Quantas patas tem? " + s2.mostrar_patas());
        System.out.println("A Especie está viva! " + s2.show_life(1));

        cesta_flores s3;
        s3 = new cesta_flores();
        s3.setNome("Rosa");
        System.out.println("Qual flor é essa? " + s3.nome_flor());
        s3.setTipo("Vermelha");
        System.out.println("Qual a cor? " + s3.tipo_cor());
        s3.setQuantidade(12.0);
        System.out.println("Quantas tem: " + s3.getQuantidade());

        cachorro s4;
        s4 = new cachorro();
        s4.setNome("Rex");
        System.out.println("Qual é nome do cachorro? " + s4.nome_cao());
        s4.setTipo("Pastor Alemão");
        System.out.println("Qual a raça: " + s4.tipo_cao());
        s4.setPeso(45.5);
        System.out.println("Quantos kilos ele tem? " + s4.getPeso());

        celular s5;
        s5 = new celular();
        s5.setNome("Galaxy A10");
        System.out.println("Qual é nome do celular? " + s5.nome_cel());
        s5.setTipo("Samsung");
        System.out.println("Qual a marca? " + s5.tipo_cel());
        s5.setPeso(9.5);
        System.out.println("Quantos peso do celular? " + s5.getPeso());

        ovelha_pelucia s6;
        s6 = new ovelha_pelucia();
        s6.setNome("Ovelha");
        System.out.println("Qual o animal? " + s6.nome_ovelha());
        s6.setTipo("Lã");
        System.out.println("Qual o material: " + s6.tipo_ovelha());
        s6.setPeso(12.5);
        System.out.println("Quantos kilos ele tem? " + s6.getPeso());

        garrafa s7;
        s7 = new garrafa();
        s7.setNome("Laranja");
        System.out.println("Qual a cor " + s7.nome_garrafa());
        s7.setTipo("Plastico");
        System.out.println("Qual o material: " + s7.tipo_garrafa());
        s7.setPeso(12.5);
        System.out.println("Quantos kilos ele tem? " + s7.getPeso());

        Gengar g7;
        g7 = new Gengar();
        g7.setNome("Gengar");
        System.out.println("Qual é esse pokémon? " + g7.nome_pokemon());
        g7.setTipo("Fantasma");
        System.out.println("Qual o tipo: " + g7.tipo_pokemon());
        g7.setAtaque(62.6);
        System.out.println("Quantos de ataque ele tem: " + g7.getAtaque());

        peixe s8 = new peixe();
        s8.show_life(2);
        s8.setTipo("Sardinha");
        System.out.println("Especie 2: " + s8.mostrar_especie());
        s8.setMostrar("0");
        System.out.println("Quantas patas tem? " + s8.mostrar_patas());
        System.out.println("A Especie está morta! " + s8.show_life(2));

        barco s9;
        s9 = new barco();
        s9.setNome("Branco");
        System.out.println("Qual é nome do cachorro? " + s9.nome_barco());
        s9.setTipo("Lancha");
        System.out.println("Qual o tipo de barco: " + s9.tipo_barco());
        s9.setPeso(455.95);
        System.out.println("Quantos o peso desse barco? " + s9.getPeso());


        // atividade das frações

        TestaClasse f1 = new TestaClasse(2, 5);
        TestaClasse f2 = new TestaClasse(3, 5);

        TestaClasse resultado1 = f1.somar(f2);

        System.out.println("Soma: " + resultado1);
    }
}
