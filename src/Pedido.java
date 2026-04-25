public class Pedido {
    //Atributos
    private Cliente cliente;
    private double monto;
    private boolean validado;

    //Constructor
    public Pedido(Cliente cliente, double monto, boolean validado) {
        this.cliente = cliente;
        this.monto = monto;
        this.validado = validado;
    }

    //Getters

    public double getMonto() {
        return monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isValidado() {
        return validado;
    }
}
