
public class Muestra {
    private int idMuestra;
    private  String nombre;
    private Producto producto;

    public Muestra(int idMuestra, String nombre, Producto producto) {
        this.idMuestra = idMuestra;
        this.nombre = nombre;
        this.producto = producto;
    }

    public int getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(int idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}

