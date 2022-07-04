public abstract class PedidoEstado {

    public abstract String getEstado();
    public boolean confirmar(Pedido pedido){
        return false;
    }
    public boolean cancelar(Pedido pedido){
        return false;
    }
    public boolean devolver(Pedido pedido){
        return false;
    }
    public boolean enviar(Pedido pedido){
        return false;
    }
    public boolean receber(Pedido pedido){
        return false;
    }
    public boolean trocar(Pedido pedido){
        return false;
    }
}
