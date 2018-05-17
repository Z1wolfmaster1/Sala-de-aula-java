package Construtores;

import java.util.Scanner;

public class Endereco {
    Scanner input=new Scanner(System.in);
    String rua, cep;
    
    void cadastrar(){
        System.out.print("Digite o nome da rua: ");
        rua=input.nextLine();
        System.out.print("Digite o cep: ");
        cep=input.nextLine();
    }
}