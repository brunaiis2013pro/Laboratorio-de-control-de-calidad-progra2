public class Certificado {
    private int idCertificado;
    private String hash;
    private Lote lote;

    public Certificado(int idCertificado, String hash, Lote lote) {
        this.setIdCertificado(idCertificado);
        this.setHash(hash);
        this.setLote(lote);
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}
