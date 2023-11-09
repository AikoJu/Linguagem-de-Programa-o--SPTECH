package continuada01.src.main.java.atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroUsuario;
        List <Integer> listaNumeros = new ArrayList<>();

        System.out.println("Insira números inteiros na lista (Insira 0 para terminar): ");
        numeroUsuario = leitor.nextInt();

       do {
           listaNumeros.add(numeroUsuario);
           numeroUsuario = leitor.nextInt();
       }while (numeroUsuario != 0);

       List <Integer> listaPares = new ArrayList<>();
       List <Integer> listaImpares = new ArrayList<>();
       Integer soma = 0;
       Integer maior = listaNumeros.get(0);
       Integer menor = listaNumeros.get(0);

       for(int i = 0; i < listaNumeros.size(); i++ ){
           Integer numeroAtual = listaNumeros.get(i);
           soma += numeroAtual;


           if(numeroAtual % 2 == 0){
               listaPares.add(numeroAtual);
           }else{
               listaImpares.add(numeroAtual);
           };

           if(numeroAtual > maior){
               maior = numeroAtual;
           };
           if(numeroAtual < menor){
               menor = numeroAtual;
           };
       }
       String relatorio = """
               Números Pares: %s 
               Números Impares: %s
               Soma: %d
               Maior Número: %d 
               Menor Número: %d       
               """.formatted(listaPares,listaImpares,soma,maior,menor);
        System.out.println(relatorio);
    }
}
