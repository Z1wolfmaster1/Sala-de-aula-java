package wolf_casa;

import java.util.Scanner;

public class Porta_casa {
    Scanner input=new Scanner(System.in);
    String cor="Branco";
    double altura=2.5, largura=1;
    boolean aberta=false;
    
    void abrir(){
        if(aberta==false){
            aberta=true;
            System.out.println("Porta aberta.");
        }
        
        else{
            System.out.println("A porta já está aberta.");
        }
    }
    
    void fechar(){
        if(aberta==true){
            aberta=false;
            System.out.println("Porta fechada.");
        }
        
        else{
            System.out.println("A porta já está fechada.");
        }
    }
    
    void pintar(){
        System.out.printf("Escolha uma nova cor: ");
        cor=input.nextLine();
    }
}
