package MegaSena;

import java.util.Random;

public class MegaSena {
    Random random=new Random();
    int[] numeros=new int[6];
    
    void sortear(){
        for(int i=0; i<numeros.length; i++){
            numeros[i]=random.nextInt();
            if(eRepetido(i,numeros[i])){
                i--;
            }
        }
    }
    
    boolean eRepetido(int j, int numero){
        boolean repetido=false;
        for(int i=0; i<j; i++){
            if(numero==numeros[i]){
                repetido=true;
                break;
            }
        }
        
        return repetido;
    }
    
    void imprimir(int palpite[]){
        System.out.printf("******Mega Sena******\n\n******Resultados******\n\nNúmeros sorteados: ");
        
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
        
        System.out.printf("\nSeus números: ");
        
        for(int i=0; i<palpite.length; i++){
            System.out.print(palpite[i]+"");
        }
    }
    
    int VerificarPalpite(int palpite[]){
        int acertos=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]==palpite[i])
                acertos++;
        }
        return acertos;
    }
}