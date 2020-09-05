public class Laboratorio {
    private int idLaboratorio;
    private String nombre;
    private String direccion;

    public Laboratorio(int idLaboratorio, String nombre, String direccion) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
