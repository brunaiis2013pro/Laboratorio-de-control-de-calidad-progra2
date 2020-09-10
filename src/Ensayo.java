public class Ensayo {
    private int idEnsayo;
    private String codigo;
    private Tipo tipo;

    public Ensayo(int idEnsayo, String codigo, Tipo tipo) {
        this.setIdEnsayo(idEnsayo);
        this.setCodigo(codigo);
        this.setTipo(tipo);
    }

    public int getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
