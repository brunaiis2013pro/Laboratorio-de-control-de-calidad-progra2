public class Producto {
    private  int idProducto;
    private String nombre;
    private String lote;

    public Producto(int idProducto, String nombre, String lote) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.lote = lote;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
