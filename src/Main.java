import java.util.Calendar;

public class Main {
    public static void main(String[]  args){

        //Producto
        Producto p1 = new Producto(10,"CocaCola");
        Producto p2 = new Producto(11,"Chocolike");

        //Muestra
        Muestra muestra1 = new Muestra(1,"C-1");
        Muestra muestra2 = new Muestra(2,"CH-2");

        //Medida
        Medida med1 = new Medida(123,"Azucar",152.45);
        Medida med2 = new Medida(456,"Azucar",100.16);

        //Tipo
        Tipo t1= new Tipo(987,"Gaseosa");
        Tipo t2= new Tipo(988,"Alimento");

        //Lote
        Lote lote1 = new Lote(147,"CC1",Calendar.getInstance().getTime(),p1);
        Lote lote2 = new Lote(258,"CHO2",Calendar.getInstance().getTime(),p2);

        //Certificado
        Certificado c1 = new Certificado(741,"560fbef8ed73983912a",lote1);
        Certificado c2 = new Certificado(852,"f7b931455365e265d28",lote2);

        //Jefe de Laboratorio
        Jefe_laboratorio jLab1 = new Jefe_laboratorio(159,"Andres","Flores","Machaca");
        Jefe_laboratorio jLab2 = new Jefe_laboratorio(357,"Miguel","Angel","Carrasco");

        //Ensayo
        Ensayo e1 = new Ensayo(248,"CO1",t1);
        Ensayo e2 = new Ensayo(268,"CHK2",t2);

        //Norma
        Norma norma1 = new Norma(157,"Sanitaria","Excelente",15.20,t1);
        Norma norma2 = new Norma(359,"Sanitaria","Regular",10.5,t2);

        System.out.println("\n\t\t\tControl 1");
        System.out.println("\t\t------------------");
        System.out.println("Producto: "+p1.getNombre()+"\t\tid: "+p1.getIdProducto());
        System.out.println("Muestra: "+muestra1.getCodigo());
        System.out.println("Medida: "+med1.getNombre()+"\t\t\tCantidad: "+med1.getValor());
        System.out.println("Tipo: "+t1.getNombre());
        System.out.println("Jefe del laboratorio: "+jLab1.getNombre()+" "+jLab1.getPrimerApellido()+" "+jLab1.getSegundoApellido());




        System.out.println("\n\n\t\t\tInforme de Calidad");
        System.out.println("\t\t=============================");
        System.out.println("#Certificado: "+c1.getIdCertificado()+" \tCodigo-Hash: "+c1.getHash()+" \nLote: "+c1.getLote().getCodigo()+"\nFecha: "+c1.getLote().getFechaVencimiento());
        System.out.println("Ensayo: "+e1.getCodigo()+" \t\tTipo: "+e1.getTipo().getNombre());
        System.out.println("Norma: "+norma1.getNombre()+"\tCalidad: "+norma1.getCondicion()+"\nValor: "+norma1.getValor());
        System.out.println("Firma: "+jLab1.getNombre()+" "+jLab1.getPrimerApellido()+" "+jLab1.getSegundoApellido());

        System.out.println("\n\n\n");

        System.out.println("\n\t\t\tControl 2");
        System.out.println("\t\t------------------");
        System.out.println("Producto: "+p2.getNombre()+"\t\tid: "+p2.getIdProducto());
        System.out.println("Muestra: "+muestra2.getCodigo());
        System.out.println("Medida: "+med2.getNombre()+"\t\t\tCantidad: "+med2.getValor());
        System.out.println("Tipo: "+t2.getNombre());
        System.out.println("Jefe del laboratorio: "+jLab2.getNombre()+" "+jLab2.getPrimerApellido()+" "+jLab2.getSegundoApellido());




        System.out.println("\n\n\t\t\tInforme de Calidad");
        System.out.println("\t\t=============================");
        System.out.println("#Certificado: "+c2.getIdCertificado()+" \tCodigo-Hash: "+c2.getHash()+" \nLote: "+c2.getLote().getCodigo()+"\nFecha: "+c2.getLote().getFechaVencimiento());
        System.out.println("Ensayo: "+e2.getCodigo()+" \t\tTipo: "+e2.getTipo().getNombre());
        System.out.println("Norma: "+norma2.getNombre()+"\tCalidad: "+norma2.getCondicion()+"\nValor: "+norma2.getValor());
        System.out.println("Firma: "+jLab2.getNombre()+" "+jLab2.getPrimerApellido()+" "+jLab2.getSegundoApellido());


        System.out.println("\n\n\n");
    }
}
