package continuada01.src.main.java.aula2308;

public class Utilitaria {
    //Um método tem as seguintes parte:
    //Retorno: void
    //Nome: exibirLinha
    //Argumentos:Dentro dos ()
    //Corpo:

    void exibirLinha (){
        System.out.println("*------*------*------*");
    }

    void exibirNome(String nome){
        System.out.println("Olá " + nome);
    }
    void exibirNome(String nome, String sobrenome){
        System.out.println(String.format("Olá %s %s",nome,sobrenome));
    }

    void exibirMensagem(String nome){
      exibirLinha();
      exibirNome(nome);
    }



}
