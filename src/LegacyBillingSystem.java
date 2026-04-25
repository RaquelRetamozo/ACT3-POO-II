public class LegacyBillingSystem {
    //Atributos
    private String ultimoEstado;

    //Metodos
    public void generarDoc (String nombreCliente, int centavos, String tipo) {
        System.out.println("Generando documento legacy para:" + nombreCliente);
        ultimoEstado = "OK";
    }
    public String getUltimoEstado(){
        System.out.println("Consultando estado en sistema legacy...");
        return ultimoEstado;
    }
}
