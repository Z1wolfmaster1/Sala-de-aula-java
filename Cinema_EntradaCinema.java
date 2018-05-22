package Cinema;

import java.util.Scanner;

public class EntradaCinema {
    Scanner input=new Scanner(System.in);
    String data, hora, horario, filme, sala;
    double valor;
    
    public EntradaCinema(){}
    
    public EntradaCinema(String data, String hora, String horario, String filme, String sala, double valor){
        this.data=data;
        this.hora=hora;
        this.horario=horario;
        this.filme=filme;
        this.sala=sala;
        this.valor=valor;
    }
    
    void cadastrar(){
        System.out.print("Digite o nome do filme: ");
        filme=input.nextLine();
        System.out.print("Digite a data: ");
        data=input.nextLine();
        System.out.print("Digite o horário: ");
        horario=input.nextLine();
        System.out.print("Digite a hora: ");
        hora=input.nextLine();
        System.out.print("Digite a sala: ");
        sala=input.nextLine();
        System.out.print("Digite o valor: ");
        valor=input.nextDouble();
    }
    
    double calcularDesconto(int idade){
        if(idade<12){
            return valor-valor*0.7;
        }
        
        else if(idade>12&&idade<18||idade>65){
            return valor-valor*0.5;
        }
    }
    
    double calcularDescontoHorario(int idade){
        double valorDescontado=calcularDesconto(idade);
        
        if(horario.equals("inicio da tarde")){
            return valorDescontado-valorDescontado*0.1;
        }
    }
    
    void consultarEntrada(){
        System.out.println("Filme: "+filme);
        System.out.println("Data: "+data);
        System.out.println("Horário: "+horario);
        System.out.println("Hora: "+hora);
        System.out.println("Sala: "+sala);
        System.out.println("Valor: "+valor);
    }
    
    void trocarSessao(){
        System.out.print("Digite o nome do novo filme: ");
        filme=input.nextLine();
        System.out.print("Digite o novo horário: ");
        horario=input.nextLine();
        System.out.print("Digite a nova hora: ");
        hora=input.nextLine();
        System.out.print("Digite a nova sala: ");
        sala=input.nextLine();
    }
}