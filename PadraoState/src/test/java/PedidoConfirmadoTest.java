import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoConfirmadoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveConfirmarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void deveTrocarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.trocar());
        assertEquals(PedidoEstadoTrocado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveReceberPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.receber());
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEnviarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveDevolverPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }
}
