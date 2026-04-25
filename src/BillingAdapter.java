public class BillingAdapter implements FacturaService {
    //Atributos
    private LegacyBillingSystem sistema;

    //Constructor
    public BillingAdapter(LegacyBillingSystem sistema) {
        this.sistema = sistema;
    }

    //Metodos
    @Override
    public void emitirFactura(Cliente cliente, double monto) {
       int centavos = (int) (monto * 100);
       sistema.generarDoc(cliente.getNombre(), centavos, cliente.getTipo());
    }
    public String verificarEstado (){
        return sistema.getUltimoEstado();
    }
}