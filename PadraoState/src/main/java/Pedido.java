public class Pedido {

    private String nome;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoConfirmado.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean receber() {
        return estado.receber(this);
    }

    public boolean trocar() {
        return estado.trocar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
