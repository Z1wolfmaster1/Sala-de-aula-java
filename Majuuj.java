package wolf;

import java.util.*;
import java.io.IOException;

public class Majuuj {
    public static void main(String args[]) throws IOException{
        ContaBancaria n1=new ContaBancaria();
        ContaBancaria n2=new ContaBancaria();
        Scanner input=new Scanner(System.in);
        String comando="C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\Wolf\\limpar.bat";
        double x;
        int i;
        
        for(;;){
            System.out.printf("1. Sacar\n2. Depositar\n3. Ver Saldo\n4. Finalizar\n\n=> ");
            x=input.nextDouble();
            
            if(x==1){
                
            }
            
            else if(x==2){
                try {
                    Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+comando); 
                } 
                catch (IOException e) {
                }
            }
            
            else if(x==3){
                
            }
            
            else if(x==4){
                System.out.print("\nObrigado pela preferência.");
                Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+comando);
                System.in.read();
                break;
            }
            
        }
    }
}