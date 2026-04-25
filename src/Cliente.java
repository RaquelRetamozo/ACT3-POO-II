public class Cliente {

    //Atributos
    private String nombre;
    private String documento;
    private String tipo;

    //Constructor
    public Cliente(String nombre, String tipo, String documento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.documento = documento;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDocumento() {
        return documento;
    }
}