package wolf;

import java.util.Scanner;

public class Endereço {
    Scanner input=new Scanner(System.in);
    String rua;
    String bairro;
    String cep;
    String cidade;
    String estado;
    
    void cadastrar() {
        System.out.println("Informe o nome da Rua: ");
        rua=input.nextLine();
        
        System.out.println("Informe o nome do bairro: ");
        bairro=input.nextLine();
        
        System.out.println("Informe o CEP: ");
        cep=input.nextLine();
        
        System.out.println("Informe o nome da cidade: ");
        cidade=input.nextLine();
        
        System.out.println("Informe o nome do estado: ");
        estado=input.nextLine();
    }
}
