package wolf_casa;

import java.util.Scanner;

public class Casa_casa {
    Scanner input=new Scanner(System.in);
    String cor;
    int numero=0;
    Porta_casa portaDaFrente=new Porta_casa();
    Porta_casa portaDeFundo=new Porta_casa();
    
    void pintar(){
        System.out.print("Escolha a nova cor: ");
        cor=input.nextLine();
        System.out.print("Pintando casa de numero "+numero+"...");
        System.out.printf("\nPintura Concluida");
    }
    
    void estaAberta(){
        if(portaDaFrente.aberta==false&&portaDeFundo.aberta==false){
            System.out.println("A casa está fechada");
            
        }
        
        else{
            System.out.println("A casa está aberta");
        }
    }
    
    void fecharCasa(){
        System.out.print("Fechando casa de numero "+numero+"...");
        portaDaFrente.aberta=false;
        portaDeFundo.aberta=false;
        System.out.printf("\nCasa fechada.");
    }
}