public class PedidoEstadoEnviado extends PedidoEstado {

    private PedidoEstadoEnviado() {};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean receber(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        return true;
    }
}
