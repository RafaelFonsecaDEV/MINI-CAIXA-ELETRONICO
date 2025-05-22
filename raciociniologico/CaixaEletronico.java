package raciociniologico;

public class CaixaEletronico {




    private double saldo;

    public  CaixaEletronico(){
        this.saldo = 1000.0; // saldo inicial

    }
      public void menu(){
        System.out.println("Bem - vindo ao caixa eletronico");
        System.out.println("1- ver saldo");
        System.out.println("2 - depositar");
        System.out.println(" 3 - sacar");
        System.out.println("4 - sair");
      }
   

     public void verSaldo(){
        System.out.println("seu saldo e" + saldo);

     }

      public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de " + valor + " realizado com sucesso.");

        }else{
            System.out.println("Valor de deposito invalido");
        }
      }

      public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("saque de " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
      }
      public void sair() {
        System.out.println("voce saiu do sistema");
        System.out.println("obrigado por usar o caixa eletronico");
      }
    
    
    
    
    
    }





















}
