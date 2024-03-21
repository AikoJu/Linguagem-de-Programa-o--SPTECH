package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
    */
    public Boolean existsAlunoPorNome(String nome) {
        Boolean existeAluno = false;
                for (Aluno aluno : alunos) {
                    if (nome != null){
                        if (nome.equalsIgnoreCase(aluno.getNome())){
                            existeAluno = true;
                    }
                    }else{
                        existeAluno = false;
                    }
                }
            return existeAluno;
    };

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
    */
    public void matricularAluno(Aluno aluno) {
        if (aluno != null){
            String nomeAluno = aluno.getNome();
                if (existsAlunoPorNome(nomeAluno) == false) {
                    alunos.add(aluno);
                }
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
    */
    public void cancelarMatricula(String ra) {
        if (ra != null ){
            for (Aluno aluno: alunos) {
                if (aluno.getRa().equals(ra)){
                    aluno.setAtivo(false);
                }
            }
        }

    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
    */
    public Integer getQuantidadeAlunos() {
        Integer aluno1 = 0;
        for (Aluno aluno: alunos) {
            if (aluno.isAtivo()){
                aluno1 ++;
            }
        }
        return aluno1;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
    */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer total = 0;
        for (Aluno aluno:alunos) {
            if (semestre != null){
                if (aluno.getSemestre() == semestre){
                    total ++;
                }
            }

        }
        return total;

    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
    */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer total = 0;
        for (Aluno aluno:alunos) {
            if (!aluno.isAtivo()){
                total ++;
            }
        }
        return total;
    }

    public String getNome() {
        return null;
    }
}
