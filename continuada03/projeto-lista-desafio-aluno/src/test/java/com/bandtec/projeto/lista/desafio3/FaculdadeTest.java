
package com.bandtec.projeto.lista.desafio3;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaculdadeTest {
    
    private List<Aluno> alunos;
    
    @Test
    public void testExistsAlunoPorNomeQuandoAcionadoComValorNuloDeveRetornarFalso() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertFalse(instance.existsAlunoPorNome(null));
    }

    @Test
    public void testExistsAlunoPorNomeQuandoAcionadoComValorInexistenteDeveRetornarFalso() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertFalse(instance.existsAlunoPorNome("Vera Goulart"));
    }
    
    @Test
    public void testExistsAlunoPorNomeQuandoAcionadoComValorExistenteDeveRetornarVerdadeiro() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertTrue(instance.existsAlunoPorNome("diego Brito"));
    }
    
    @Test
    public void testMatricularAlunoQuandoAcionadoComValorNuloNaoDeveAlterarTamanhoDaLista() {
        Faculdade instance = new Faculdade("Bandtec");
        instance.matricularAluno(null);
        assertEquals(0, instance.getQuantidadeAlunos());
    }
    
    @Test
    public void testMatricularAlunoQuandoAcionadoComValorDuplicadoNaoDeveAlterarTamanhoDaLista() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        instance.matricularAluno(new Aluno("#32", "Diego brito", 4));
        assertEquals(this.alunos.size(), instance.getQuantidadeAlunos());
    }
    
    @Test
    public void testMatricularAlunoQuandoAcionadoComValorUnicoDeveAlterarTamanhoDaLista() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        instance.matricularAluno(new Aluno("#32", "Marise Miranda", 4));
        assertEquals((this.alunos.size() + 1), instance.getQuantidadeAlunos());
    }

    @Test
    public void testCancelarMatriculaQuandoAcionadoEListaEstaVaziaDeveRetornar0AoAcionarGetCancelados() {
        Faculdade instance = new Faculdade("Bandtec");
        instance.cancelarMatricula("#1");
        assertEquals(0, instance.getQuantidadeAlunosComMatriculaCancelada());
    }
    
    @Test
    public void testCancelarMatriculaQuandoAcionadoComValorNuloNaoDeveAlterarQuantidadeDeAlunoComMatriculaCancelada() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        instance.cancelarMatricula(null);
        assertEquals(0, instance.getQuantidadeAlunosComMatriculaCancelada());
    }
    
    @Test
    public void testCancelarMatriculaQuandoAcionadoComValorExistenteDeveAlterarQuantidadeDeAlunoComMatriculaCancelada() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        instance.cancelarMatricula("#1");
        assertEquals(1, instance.getQuantidadeAlunosComMatriculaCancelada());
    }

    @Test
    public void testGetQuantidadeAlunosQuandoAcionadoEListaEstaVaziaDevRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        assertEquals(0, instance.getQuantidadeAlunos());
    }
    
    @Test
    public void testGetQuantidadeAlunosQuandoAcionadoEListaPossui4AlunosDevRetornar4() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertEquals(4, instance.getQuantidadeAlunos());
    }

    @Test
    public void testGetQuantidadeAlunosPorSemestreQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        assertEquals(0, instance.getQuantidadeAlunosPorSemestre(1));
    }
    
    @Test
    public void testGetQuantidadeAlunosPorSemestreQuandoAcionadoComValorNuloDeveRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertEquals(0, instance.getQuantidadeAlunosPorSemestre(null));
    }
    
    @Test
    public void testGetQuantidadeAlunosPorSemestreQuandoAcionadoComValorInexistenteDeveRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertEquals(0, instance.getQuantidadeAlunosPorSemestre(42));
    }

    @Test
    public void testGetQuantidadeAlunosPorSemestreQuandoAcionadoCom2DeveRetornar2() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertEquals(2, instance.getQuantidadeAlunosPorSemestre(2));
    }
    
    @Test
    public void testGetQuantidadeAlunosComMatriculaCanceladaQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        assertEquals(0, instance.getQuantidadeAlunosComMatriculaCancelada());
    }
    
    @Test
    public void testGetQuantidadeAlunosComMatriculaCanceladaQuandoAcionadoEListaNaoPossuiAlunosComMatriculaCanceladaDeveRetornar0() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        assertEquals(0, instance.getQuantidadeAlunosComMatriculaCancelada());
    }
    
    @Test
    public void testGetQuantidadeAlunosComMatriculaCanceladaQuandoAcionadoEListaPossui1AlunoComMatriculaCanceladaDeveRetornar1() {
        Faculdade instance = new Faculdade("Bandtec");
        this.matricularAlunos(instance);
        instance.cancelarMatricula("#2");
        assertEquals(1, instance.getQuantidadeAlunosComMatriculaCancelada());
    }
    
    private void matricularAlunos(Faculdade faculdade){
        
         this.alunos = Arrays.asList(
                new Aluno("#1", "Diego Brito", 2),
                new Aluno("#2", "Giuliana Miniguiti", 3),
                new Aluno("#3", "Gerson Santos", 4),
                new Aluno("#4", "Célia Taniwaki", 2)
        );
        
        for (Aluno aluno : alunos) {
            faculdade.matricularAluno(aluno);
        }
    }
}
