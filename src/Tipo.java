public class Tipo {
    private int idTipo;
    private String nombre;

    public Tipo(int idTipo, String nombre) {
        this.setIdTipo(idTipo);
        this.setNombre(nombre);
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
