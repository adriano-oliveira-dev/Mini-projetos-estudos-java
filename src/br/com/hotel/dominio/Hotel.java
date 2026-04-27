package br.com.hotel.dominio;



public class Hotel {
    private String nome;
    private Quarto[] quartos;

    public Hotel(String nome){
        this.nome=nome;
        this.quartos = new Quarto[10];
        quartos[0] = new Quarto(10,"simples",100);
        quartos[1] = new Quarto(11,"simples",100);
        quartos[2] = new Quarto(12,"simples",100);
        quartos[3] = new Quarto(13,"simples",100);
        quartos[4] = new Quarto(14,"duplo",150);
        quartos[5] = new Quarto(15,"duplo",150);
        quartos[6] = new Quarto(16,"duplo",150);
        quartos[7] = new Quarto(17,"suite",250);
        quartos[8] = new Quarto(18,"suite",250);
        quartos[9] = new Quarto(19,"suite",250);
    }

    public void listaQuartos(){
        for (Quarto q  :quartos) {
            System.out.println(q);

        }
    }
    public Quarto buscarDisponivel(String tipo) {

        for (Quarto q : quartos) {
            if (q.getTipo().equals(tipo) && q.isDisponivel()) {
                System.out.println(q);
                return q;

            }

        }
        return null;
    }
    public void listarDisponiveis(){
        boolean encontrou =false;
        for (Quarto q : quartos) {
            if (q.isDisponivel()) {
                System.out.println(q);
                encontrou = true;

            }

        }
        if (!encontrou){
            System.out.println("Nenhum quarto disponivel no momento!");
        }
    }


        public void listarOcupados (){
            boolean encontrou =false;
            for (Quarto q : quartos) {
                if (!q.isDisponivel()) {
                    System.out.println(q);
                    encontrou = true;

                }

            }
             if (!encontrou){
                System.out.println("Nenhum quarto ocupado no momento!");
            }


        }

    public void checkout(int numero) {
        for (Quarto q :quartos){
            if (q.getNumero()==numero){
                q.checkout();

              break;
            }else {
                System.out.println("quarto " + numero + " não encontrado");
            }

        }




    }
}