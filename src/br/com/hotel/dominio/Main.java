package br.com.hotel.dominio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel =new Hotel("Hotel Dev");
        Scanner scanner = new Scanner(System.in);
        int opcao= -1;

        while (opcao !=0){
            System.out.println("***** Hotel Dev *****");
            System.out.println("============================");
            System.out.println("Escolha Uma Opção!");
            System.out.println("1 - Checkin -");
            System.out.println("2 - Checkout -");
            System.out.println("3 - Listar Todos Os Quartos");
            System.out.println("4 - Listar Quartos Disponiveis");
            System.out.println("5 - Listar Quartos Ocupados");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de quarto(Simples/Duplo/Suite)");
                    String tipo = scanner.next();
                    Quarto quarto = hotel.buscarDisponivel(tipo);
                    if (quarto == null){
                        System.out.println("Nenhum quarto disponivel desse tipo");
                        break;
                    }
                    System.out.println("Digite o nome do hospede: ");
                    scanner.nextLine();
                    String nome =scanner.nextLine();

                    System.out.println("Digite a idade: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.next();

                    System.out.println("Digite o numero de diarias: ");
                    int diarias = scanner.nextInt();

                    Hospede hospede = new Hospede(nome,idade,cpf);
                    quarto.checkin(hospede,diarias);
                    break;

                case 2:
                    System.out.println("Digite o numero do quarto para Check-out");
                    int numero =scanner.nextInt();
                    hotel.checkout(numero);
                    break;

                case 3:
                    System.out.println("Listar quartos");
                    hotel.listaQuartos();
                    break;

                case 4:
                    hotel.listarDisponiveis();
                    break;

                case 5:
                    hotel.listarOcupados();
                    break;

                case 0:
                    System.out.println("Encerrando sistema!");

                default:
                    System.out.println("Opção invalida!");

            }
        }
        scanner.close();
    }
}
