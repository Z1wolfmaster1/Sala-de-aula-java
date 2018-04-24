package wolf;

import java.util.Scanner;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    String telefone;
    String endereco;
    
    void cadastar(){
        Scanner input=new Scanner(System.in);
        System.out.println("Informe nome: ");
        nome=input.nextLine();
    }
    
}
