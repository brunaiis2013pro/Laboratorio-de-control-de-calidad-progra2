import java.util.Date;

public class Ensayo  {

    private  String codigojefelab;

    private  Control control;
    private Certificado certificado;
    private Muestra muestra;
    private int cantidadEnsayos;
    private String tipo;

    public Ensayo(String codigojefelab, Control control, Certificado certificado, Muestra muestra, int cantidadEnsayos, String tipo) {
        this.codigojefelab = codigojefelab;
        this.control = control;
        this.certificado = certificado;
        this.muestra = muestra;
        this.cantidadEnsayos = cantidadEnsayos;
        this.tipo = tipo;
    }

    public String getCodigojefelab() {
        return codigojefelab;
    }

    public void setCodigojefelab(String codigojefelab) {
        this.codigojefelab = codigojefelab;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public int getCantidadEnsayos() {
        return cantidadEnsayos;
    }

    public void setCantidadEnsayos(int cantidadEnsayos) {
        this.cantidadEnsayos = cantidadEnsayos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
