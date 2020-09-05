import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Laboratorio
        Laboratorio univalle = new Laboratorio(1,"Univalle","Av.Sprinfield");

        //Producto
        Producto p1 = new Producto(1,"Manzanas","250 ");
        Producto p2 = new Producto(2,"Sandias","100");

        //Control
        Control c1 = new Control(1, Calendar.getInstance().getTime(),univalle);

        //Certificado
        Certificado certificado = new Certificado(3,univalle.getNombre(),p1,"Recomendada","Albert Flores");

        //Muestra
        Muestra muestra = new Muestra(5,"B15",p1);

        //Ensayo
        Ensayo ensayo = new Ensayo("H20",c1,certificado,muestra,5,"Cientifico");


        System.out.println("\nEnsayos realizados: "+ensayo.getCantidadEnsayos());
        System.out.println("Laboratorio: "+univalle.getNombre());
        System.out.println("Direccion: "+univalle.getDireccion());
        System.out.println("Codigo Jefe-Laboratorio: "+ensayo.getCodigojefelab());
        System.out.println("Fecha: "+c1.getFecha());
        System.out.println("Muestra: "+muestra.getNombre());
        System.out.println("Tipo de ensayo: "+ensayo.getTipo());
        System.out.println("\n");

        System.out.println("Certificado Control Calidad");
        System.out.println("=============================");
        System.out.println("Codigo Certificado: "+certificado.getIdCertificado());
        System.out.println("Laboratorio: "+certificado.getNombreLab());
        System.out.println("Producto: "+p1.getNombre());
        System.out.println("Lote analizado: "+p1.getLote());
        System.out.println("Calidad: "+certificado.getCalidad());
        System.out.println("Firma : "+certificado.getFirma());

    }
}
