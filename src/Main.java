public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Raquel Retamozo", "12345678", "natural");
        Pedido pedido = new Pedido(cliente, 150.50, true);
        LegacyBillingSystem legacy = new LegacyBillingSystem();
        BillingAdapter adapter = new BillingAdapter(legacy);
        SistemaPedidos sistema = new SistemaPedidos(adapter);
        sistema.registrarPedido(pedido);
    }
}