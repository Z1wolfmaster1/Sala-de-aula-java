package wolf;

public class ContaBancaria {
    int numero;
    double saldo=0;
    Cliente dono=new Cliente();

    void consultarsaldo(){
        System.out.printf("%.2f", saldo);
    }

    void depositar(double x){
        saldo+=x;
        System.out.println("Deposito efetuado.");
    }

    void sacar(double x){
        if(x<saldo){
            saldo-=x;
            System.out.println("");
        }

        else{
            System.out.println("Esse valor não pode ser sacado.");
        }
    }
}