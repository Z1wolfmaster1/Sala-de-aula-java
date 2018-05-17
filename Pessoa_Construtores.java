package Construtores;

import java.util.Scanner;

public class Pessoa {
    Scanner input=new Scanner(System.in);
    String nome, cpf;
    Endereco ende=new Endereco();
    
    void cadastrar(){
        System.out.printf("Digite o nome: ");
        nome=input.nextLine();
        System.out.printf("Digite o cpf: ");
        cpf=input.nextLine();
        ende.cadastrar();
    }
    
    public Pessoa(String n, String c){
        nome=n;
        cpf=c;
    }
}