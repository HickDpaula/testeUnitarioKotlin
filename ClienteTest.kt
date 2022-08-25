import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {



    val cliente = Cliente(
        "Henrique",
        "endereco",
        131313)


    @BeforeEach
    fun addProdutos(){
        cliente.addProdutos("Toddy")
        cliente.addProdutos("Macarrão")
        cliente.addProdutos("Margarina")
        cliente.addProdutos("requeijão")



    }



    @Test
    fun ClienteTest(){

        var erro = false

        try {
            val clienteTest = Cliente("Henrique","endereco",  5656)
        }catch (e: Exception){
            erro = true
        }




    }

    @Test
    fun addProdutosTest() {




        assertEquals(4, cliente.listaProdutos.size)
        assertTrue(cliente.listaProdutos.contains("Toddy"))

    }

    @Test
    fun removerProdutos() {

        cliente.removerProdutos("Toddy")

        assertEquals(3, cliente.listaProdutos.size)
        assertFalse(cliente.listaProdutos.remove("Toddy"))

    }
}