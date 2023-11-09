package continuada01.src.main.java.aula3008.investimentos;

public class InvestimentoMetodos {

    String linha() {
        String linha = "------------------------------";
        return linha;
    }

    Double deposito(Double saldoUsuario, Double valorDeposito){
        Double resultado = 0.0;
        if (valorDeposito < 0){
            System.out.println("Valor inválido");
            resultado = saldoUsuario;
        }else{
            resultado = saldoUsuario + valorDeposito;
            System.out.println(String.format("Depósito realizado - Saldo atual: R$%.2f",resultado));
        }
        return resultado;
    }

    Double saque(Double saldoUsuario, Double valorSaque){
        Double resultado = 0.0;
        if(valorSaque > saldoUsuario){
            System.out.println("Valor inválido");
            resultado = saldoUsuario;
        }else{
            resultado = saldoUsuario - valorSaque;
            System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f",resultado));
        }
        return resultado;
        }
    }