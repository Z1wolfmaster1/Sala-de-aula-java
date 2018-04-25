package wolf;

import java.util.Scanner;

public class Cliente {
    Scanner input=new Scanner(System.in);
    String nome;
    String rg;
    String cpf;
    String telefone;
    String endereco;
    
    void cadastar(){
        System.out.println("Informe nome: ");
        nome=input.nextLine();
        
        System.out.println("Informe RG: ");
        nome=input.nextLine();
        
        System.out.println("Informe CPF: ");
        nome=input.nextLine();
        
        System.out.println("Informe Telefone: ");
        nome=input.nextLine();
        
        Endereço clientex=new Endereço();
        clientex.cadastrar();
    }
    
}
