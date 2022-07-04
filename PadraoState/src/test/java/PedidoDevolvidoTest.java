import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoDevolvidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveDevolverPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveCancelarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConfirmarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.confirmar());
    }

    @Test
    public void naoDeveTrocarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.trocar());
    }

    @Test
    public void naoDeveEnviarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveReceberPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.receber());
    }
}
