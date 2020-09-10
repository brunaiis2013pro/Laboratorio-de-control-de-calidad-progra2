import java.util.Date;

public class Lote {
    private int idLote;
    private String codigo;
    private Date fechaVencimiento;
    private Producto producto;

    public Lote(int idLote, String codigo, Date fechaVencimiento, Producto producto) {
        this.setIdLote(idLote);
        this.setCodigo(codigo);
        this.setFechaVencimiento(fechaVencimiento);
        this.setProducto(producto);
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
