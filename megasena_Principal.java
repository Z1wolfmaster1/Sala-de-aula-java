package MegaSena;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        MegaSena jogo=new MegaSena();
        int x;
        int[] palpite=new int[jogo.numeros.length];
        
        for(;;){
            System.out.printf("1. Sortear\n2. Verificar palpite\n3. Imprimir Bilhete\n4. Sair\n\n==>");
            x=input.nextInt();
            
            if(x==1){
                jogo.sortear();
                System.out.println("Os números foram sorteados!\n\nDigite "+jogo.numeros.length+" números de palpite: ");
                for(int i=0; i<jogo.numeros.length; i++){
                    palpite[i]=input.nextInt();
                }
                
            }
            else if(x==2){
                System.out.print("Você acertou "+jogo.VerificarPalpite(palpite)+" números de "+jogo.numeros.length);
            }
            else if(x==3){}
            else if(x==4){
                System.out.printf("\n\n\nAté a próxima!");
                break;
            }
        }
    }
}