package wolf_casa;

import java.util.Scanner;

public class Responsavel_casa {
    Scanner input=new Scanner(System.in);
    String nome="Valdir", sexo="M", dataDeNasc="? a.C";
    
    void cadastrar(){
        System.out.printf("Digite o nome: ");
        nome=input.nextLine();
        
        System.out.printf("Digite o sexo: ");
        sexo=input.nextLine();
        
        System.out.printf("Digite a data de nascimento: ");
        dataDeNasc=input.nextLine();
    }
}