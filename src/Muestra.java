public class Muestra {
    private int idMuestra;
    private String codigo;

    public Muestra(int idMuestra, String codigo) {
        this.setIdMuestra(idMuestra);
        this.setCodigo(codigo);
    }

    public int getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(int idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
