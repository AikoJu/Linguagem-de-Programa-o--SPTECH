package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if ((valor != null)) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                if (numAtual == valor) {
                    inteiros.remove(i);
                } else {
                    inteiros.size();
                }
            }
        }
    }

    public Integer countPares() {
        Integer pares = 0;
        if (inteiros.size() != 0) {
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                if (numAtual % 2 == 0) {
                    pares++;
                }
            }
            ;
        } else {
            pares = 0;
        }
        return pares;
    }

    public Integer countImpares() {
        Integer impares = 0;
        if (inteiros.size() != 0) {
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                if (numAtual % 2 != 0) {
                    impares++;
                }
            }
            ;
        } else {
            impares = 0;
        }
        return impares;
    }

    public Integer somar() {
        Integer soma = 0;
        if (inteiros.size() != 0) {
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                soma = numAtual + soma;
            }
            ;
        } else {
            soma = 0;
        }
        return soma;
    }


    public Integer getMaior() {
        Integer maior;
        if (!inteiros.isEmpty()) {
            maior = inteiros.get(0);
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                if (numAtual > maior) {
                    maior = numAtual;
                }
            }
            ;
        } else {
            maior = 0;
        }
        return maior;
    }

    public Integer getMenor() {
        Integer menor;
        if (inteiros.size() != 0) {
            menor = inteiros.get(0);
            for (int i = 0; i < inteiros.size(); i++) {
                Integer numAtual = inteiros.get(i);
                if (numAtual < menor) {
                    menor = numAtual;
                }
            }
            ;
        } else {
            menor = 0;
        }
        return menor;
    }
    public Boolean hasDuplicidade() {
        for (Integer inteiro : inteiros) {
            if (inteiros.lastIndexOf(inteiro) != inteiros.indexOf(inteiro)) {
                return true;
            }

        };
        return false;
    };
};


