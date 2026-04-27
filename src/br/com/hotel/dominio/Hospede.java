package br.com.hotel.dominio;

public class Hospede {
    private String nome;
    private int idade;
    private String cpf;

    public Hospede(String nome, int idade, String cpf){
        this.nome =nome;
        this.idade =idade;
        this.cpf =cpf;
    }

    public String getNome() {

        return nome;
    }

    public int getIdade() {

        return idade;
    }

    public String getCpf() {

        return cpf;
    }


    @Override
    public String toString(){
        return "Hospede: Nome: "+nome+" Cpf: "+cpf+ " Idade: "+idade;
    }
}
