
package com.bandtec.projeto.lista.desafio;

import com.sptech.projeto.lista.desafio.ListaUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Teste classe ListaUtil")
public class ListaUtilTest {

    @Test
    @DisplayName("add(): Quando adicionado valores positivos e negativos aumenta o tamanho da lista")
    public void testAddQuandoAcionadoComValorPositivosENegativosAumentaTamanhoDaLista() {
        ListaUtil instance = new ListaUtil();
        instance.add(1);
        instance.add(21);
        instance.add(-21);
        Integer valorRetornado = instance.count();
        assertEquals(3, valorRetornado);
    }
    
    @Test
    @DisplayName("add(): Quando adicionado valor null não altera o tamanho da lista")
    public void testAddQuandoAcionadoComArgumentoNuloNaoAlteraTamanhoDaLista() {
        Integer valor = null;
        ListaUtil instance = new ListaUtil();
        instance.add(valor);
        Integer valorRetornado = instance.count();
        assertEquals(0, valorRetornado);
    }

    @Test
    @DisplayName("remove(): Quando remover um valor null não altera o tamanho da lista")
    public void testRemoveQuandoAcionadoComArgumentoNuloNaoAlteraTamanhoDaLista() {
        ListaUtil instance = new ListaUtil();
        instance.add(10);
        instance.add(30);
        instance.add(40);
        assertEquals(3, instance.count());
        instance.remove(null);
        assertEquals(3, instance.count());
    }
    
    @Test
    @DisplayName("remove(): Quando passado um valor que existe na lista o valor deve ser removido")
    public void testRemoveQuandoAcionadoComArgumento10DiminuiTamanhoDaLista() {
        ListaUtil instance = new ListaUtil();
        instance.add(10);
        instance.add(30);
        instance.add(40);
        assertEquals(3, instance.count());
        instance.remove(10);
        assertEquals(2, instance.count());
    }
    
    @Test
    @DisplayName("remove(): Quando passado um valor que não existe, não altera o tamanho da lista")
    public void testRemoveQuandoAcionadoComArgumento101NaoDiminuiTamanhoDaLista() {
        ListaUtil instance = new ListaUtil();
        instance.add(10);
        instance.add(30);
        instance.add(40);
        assertEquals(3, instance.count());
        instance.remove(101);
        assertEquals(3, instance.count());
    }
    
    @Test
    @DisplayName("count(): Quando a lista estiver vazia deve retornar 0")
    public void testCountQuandoAcionadoEListaEstaVaziaRetorna0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.count();
        assertEquals(0, result);
    }
    
    @Test
    @DisplayName("count(): Quando a lista possuir 3 valores retorna 3")
    public void testCountQuandoAcionadoEListaPossui3IndicesPreenchidosRetorna3() {
        ListaUtil instance = new ListaUtil();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        Integer result = instance.count();
        assertEquals(3, result);
    }

    
    @Test
    @DisplayName("countPares(): Quando a lista possuir 6 valores pares retorna 6")
    public void testCountParesQuandoAcionadoEListaPossui6ParesRetorna6() {
        ListaUtil instance = new ListaUtil();
        instance.add(2);
        instance.add(4);
        instance.add(6);
        instance.add(12);
        instance.add(24);
        instance.add(32);
        instance.add(101);
        instance.add(-1);
        Integer result = instance.countPares();
        assertEquals(6, result);
    }
    
    @Test
    @DisplayName("countPares(): Quando a lista estiver vazia retorna 0")
    public void testCountParesQuandoAcionadoEListaEstaVaziaRetorna0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.countPares();
        assertEquals(0, result);
    }

    @Test
    @DisplayName("countImpares(): Quando a lista estiver vazia retorna 0")
    public void testCountImparesQuandoAcionadoEListaEstaVaziaRetorna0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.countImpares();
        assertEquals(0, result);
    }
    
    @Test
    @DisplayName("countImpares(): Quando a lista possuir 3 valores ímpares retorna 3")
    public void testCountImparesQuandoAcionadoEListaPossui3ImparesRetorna3() {
        ListaUtil instance = new ListaUtil();
        instance.add(3);
        instance.add(9);
        instance.add(131);
        instance.add(32);
        instance.add(40);
        Integer result = instance.countImpares();
        assertEquals(3, result);
    }

    @Test
    @DisplayName("somar(): Quando a lista possuir valores 30, 10 e 2 deve retornar a soma correta (42)")
    public void testSomarQuandoAcionadoDeveRetornar42() {
        ListaUtil instance = new ListaUtil();
        instance.add(30);
        instance.add(10);
        instance.add(2);
        Integer result = instance.somar();
        assertEquals(42, result);
    }
    
    @Test
    @DisplayName("somar(): Quando a lista possuir valores 20, 10, 50, 17 e 2 deve retornar a soma correta (99)")
    public void testSomarQuandoAcionadoDeveRetornar99() {
        ListaUtil instance = new ListaUtil();
        instance.add(20);
        instance.add(10);
        instance.add(50);
        instance.add(17);
        instance.add(2);
        Integer result = instance.somar();
        assertEquals(99, result);
    }

    @Test
    @DisplayName("somar(): Quando a lista estiver vazia deve retornar 0")
    public void testSomarQuandoAcionadoEListaEstavaziaDeveRetornar0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.somar();
        assertEquals(0, result);
    }
    
    @Test
    @DisplayName("getMaior(): Quando a lista estiver vazia deve retornar 0")
    public void testGetMaiorQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.getMaior();
        assertEquals(0, result);
    }
    
    @Test
    @DisplayName("getMaior(): Quando a lista possuir valores deve retornar o maior")
    public void testGetMaiorQuandoAcionadoDeveRetornar42() {
        ListaUtil instance = new ListaUtil();
        instance.add(-5);
        instance.add(11);
        instance.add(37);
        instance.add(42);
        instance.add(16);
        Integer result = instance.getMaior();
        assertEquals(42, result);
    }

    @Test
    @DisplayName("getMenor(): Quando a lista estiver vazia deve retornar 0")
    public void testGetMenorQuandoAcionadoEListaEstaVaziaDeveRetornar0() {
        ListaUtil instance = new ListaUtil();
        Integer result = instance.getMenor();
        assertEquals(0, result);
    }

    @Test
    @DisplayName("getMenor(): Quando a lista possuir valores deve retornar o menor")
    public void testGetMenorQuandoAcionadoDeveRetornar10Negativo() {
        ListaUtil instance = new ListaUtil();
        
        instance.add(12);
        instance.add(2);
        instance.add(101);
        instance.add(-10);
        instance.add(-2);
        instance.add(5);
        instance.add(32);
        Integer result = instance.getMenor();
        assertEquals(-10, result);
    }
    
    @Test
    @DisplayName("hasDuplicidade(): Quando a lista possuir valores duplicados deve retornar true")
    public void testHasDuplicidadeQuandoAcionadoEListaPossuiDuplicidadeDeveRetornarTrue() {
        ListaUtil instance = new ListaUtil();
        
        instance.add(13);
        instance.add(10);
        instance.add(18);
        instance.add(42);
        instance.add(32);
        instance.add(42);
        
        assertTrue(instance.hasDuplicidade());
    }
    
    @Test
    @DisplayName("hasDuplicidade(): Quando a lista não possuir valores duplicados deve retornar false")
    public void testHasDuplicidadeQuandoAcionadoEListaNaoPossuiDuplicidadeDeveRetornarFalse() {
        ListaUtil instance = new ListaUtil();
        
        instance.add(42);
        instance.add(10);
        instance.add(18);
        instance.add(32);
        instance.add(65);
        instance.add(51);
        
        assertFalse(instance.hasDuplicidade());
    }
    
    @Test
    @DisplayName("hasDuplicidade(): Quando a lista estiver vazia deve retornar true")
    public void testHasDuplicidadeQuandoAcionadoEListaEstaVaziaDeveRetornarFalse() {
        ListaUtil instance = new ListaUtil();
        assertFalse(instance.hasDuplicidade());
    }
}
