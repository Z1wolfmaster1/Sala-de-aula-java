package wolf_casa;

import java.util.Scanner;

public class Principal_casa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Casa_casa[] casa=new Casa_casa[3];
        double x;
        
        for(int i=0; i<casa.length; i++){
            casa[i]=new Casa_casa();
        }
        
        for(;;){
           System.out.printf("1. Pintar\n2. Verificar se a casa está aberta\n3. Abrir a porta da frente da casa\n4. Fechar a casa\n5. Ver o responsavel\n6. Mudar o responsavel\n7. Mostrar quantas casas tem o responsavel chamado \"Alberto\"\n8. Sair\n\n=> ");
           x=input.nextDouble();
           
           if(x==1){
               System.out.println(casa[0].cor);
           }
           else if(x==2){}
           else if(x==3){}
           else if(x==4){}
           else if(x==5){}
           else if(x==6){}
           else if(x==7){}
           else if(x==8){
               break;
           }
        }
    }
}
