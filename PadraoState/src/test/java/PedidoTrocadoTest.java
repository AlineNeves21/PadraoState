import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTrocadoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveTrocarPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveCancelarPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void deveConfirmarPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertTrue(pedido.confirmar());
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveReceberPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertTrue(pedido.receber());
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEnviarPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveDevolverPedidoTrocado() {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }
}
