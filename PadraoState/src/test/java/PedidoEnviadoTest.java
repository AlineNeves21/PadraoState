import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoEnviadoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConfirmarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveTrocarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveDevolverPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void deveReceberPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertTrue(pedido.receber());
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }
}
