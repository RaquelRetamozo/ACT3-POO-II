public class SistemaPedidos {
    //Atributos
    private FacturaService facturaService;

    //Constructor
    public SistemaPedidos(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    //Metodo
    public void registrarPedido (Pedido pedido) {
        System.out.println("Procesando pedido...");
        if (pedido.isValidado()) {
            facturaService.emitirFactura(pedido.getCliente(), pedido.getMonto());
            String estado = facturaService.verificarEstado();
            if (estado.equals("OK")) {
                System.out.println("Factura generada correctamente para: " + pedido.getCliente().getNombre());
                System.out.println("Monto facturado: S/. " + pedido.getMonto());
            } else {
                System.out.println("Error al generar la factura.");
            }
        } else {
            System.out.println("El pedido no está validado, no se puede emitir factura.");
        }
    }
}