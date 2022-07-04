public class PedidoEstadoRecebido extends PedidoEstado {

    private PedidoEstadoRecebido() {};
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();
    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }

    public boolean trocar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
        return true;
    }

    public boolean devolver(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        return true;
    }
}
