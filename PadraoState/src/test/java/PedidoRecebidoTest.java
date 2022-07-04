import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoRecebidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveReceberPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.receber());
    }

    @Test
    public void naoDeveConfirmarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveEnviarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.cancelar());
    }
    @Test
    public void deveTrocarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.trocar());
        assertEquals(PedidoEstadoTrocado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveDevolverPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }
}
