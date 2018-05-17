package Construtores;

import java.util.Scanner;


public class Principal {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        Pessoa[] contrs=new Pessoa[2];
        
        contrs[0]=new Pessoa("Dj Rogerinho", "13956","Rua Borboletas Pisicodélicas","04313-110");
        contrs[1]=new Pessoa("","","","");
        
        contrs[1].cadastrar();
        
        
    }
    
}