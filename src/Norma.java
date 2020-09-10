public class Norma {
    private int idNorma;
    private String nombre;
    private String condicion;
    private Double valor;
    private Tipo tipo;

    public Norma(int idNorma, String nombre, String condicion, Double valor, Tipo tipo) {
        this.setIdNorma(idNorma);
        this.setNombre(nombre);
        this.setCondicion(condicion);
        this.setValor(valor);
        this.setTipo(tipo);
    }

    public int getIdNorma() {
        return idNorma;
    }

    public void setIdNorma(int idNorma) {
        this.idNorma = idNorma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
