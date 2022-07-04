public class PedidoEstadoConfirmado extends PedidoEstado {

    private PedidoEstadoConfirmado() {};
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();
    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmado";
    }

    public boolean trocar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoTrocado.getInstance());
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

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
