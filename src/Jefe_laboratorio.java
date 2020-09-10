public class Jefe_laboratorio {
    private int idjefeLaboratorio;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Jefe_laboratorio(int idjefeLaboratorio, String nombre, String primerApellido, String segundoApellido) {
        this.setIdjefeLaboratorio(idjefeLaboratorio);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
    }

    public int getIdjefeLaboratorio() {
        return idjefeLaboratorio;
    }

    public void setIdjefeLaboratorio(int idjefeLaboratorio) {
        this.idjefeLaboratorio = idjefeLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
