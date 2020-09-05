import java.util.Date;

public class Control {
    private int idControl;
    private Date fecha;
    Laboratorio laboratorio;

    public Control(int idControl, Date fecha, Laboratorio laboratorio) {
        this.idControl = idControl;
        this.fecha= fecha;
        this.laboratorio = laboratorio;
    }

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha= fecha;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
