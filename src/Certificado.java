public class Certificado {
    private  int idCertificado;
    private String nombreLab;
    private  Producto producto;
    private  String calidad;
    private String firma;

    public Certificado(int idCertificado, String nombreLab, Producto producto, String calidad, String firma) {
        this.idCertificado = idCertificado;
        this.nombreLab = nombreLab;
        this.producto = producto;
        this.calidad = calidad;
        this.firma = firma;
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
