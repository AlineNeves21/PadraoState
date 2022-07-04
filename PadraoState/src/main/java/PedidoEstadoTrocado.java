public class PedidoEstadoTrocado extends PedidoEstado {

    private PedidoEstadoTrocado() {};
    private static PedidoEstadoTrocado instance = new PedidoEstadoTrocado();
    public static PedidoEstadoTrocado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Trocado";
    }
    public boolean confirmar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

    public boolean receber(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        return true;
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

    public boolean devolver(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        return true;
    }
}
