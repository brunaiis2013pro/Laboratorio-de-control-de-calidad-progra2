public class Medida {
    private int idMedida;
    private String nombre;
    private Double valor;

    public Medida(int idMedida, String nombre, Double valor) {
        this.setIdMedida(idMedida);
        this.setNombre(nombre);
        this.setValor(valor);
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
