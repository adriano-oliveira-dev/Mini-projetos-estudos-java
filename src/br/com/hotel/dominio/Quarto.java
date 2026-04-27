package br.com.hotel.dominio;

public class Quarto {
    private  int numero;
    private  String tipo;
    private  double precoDiaria;
    private Hospede hospede;
    private int numDiarias;


    public Quarto(int numero, String tipo, double precoDiaria){
        this.numero=numero;
        this.tipo=tipo;
        this.precoDiaria=precoDiaria;
        this.hospede=null;


    }
    public boolean isDisponivel(){

        return hospede==null;
    }

    public void checkin(Hospede hospede, int numDiarias){
        if (!isDisponivel()) {
            System.out.println("Quarto: "+numero+" já está ocupado");


        }else {
            this.hospede = hospede;
            this.numDiarias = numDiarias;
            System.out.println("Checkin realizado com sucesso!");
        }
    }
    public void checkout(){
        double totalDiarias = numDiarias * precoDiaria;
        if(isDisponivel()){
            System.out.println("Quarto "+numero+" já está vazio!");


        }else {
            System.out.println("Valor total de diarias a pagar: R$" + totalDiarias);
            System.out.println("Checkout de hospede " + hospede.getNome() + " realiado!");
            this.hospede = null;
        }
    }

    @Override
    public String toString() {
        String status = isDisponivel() ?"Disponivel" : "Ocupado por: "+hospede.getNome();
        return "Quarto: "+numero+" | Tipo: "+tipo+
                " | Diaraia: R$"+precoDiaria+" | "+status;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public int getNumDiarias() {
        return numDiarias;
    }
}
