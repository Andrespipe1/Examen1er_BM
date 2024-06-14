package Examen_TufinoAndres;

public class Main {
    public static void main(String[] args){
        //o	Instanciar al menos 5 objetos con valores nulos y posteriormente setear algunos de  sus atributos. Utilizar setters con valores quemados, no es necesario el ingreso de datos por consola.
        R1_UIO_GYE v6 = new R1_UIO_GYE(0,null,0,"16/08/2024",15,"Ventana",0,"ACE123",12,20);
        R1_UIO_GYE_Vip v7 = new R1_UIO_GYE_Vip(0,null,0,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",12,20);
        R2_UIO_TLC v8 = new R2_UIO_TLC(0,null,0,"16/08/2024",15,"Ventana",0,"PAQ123",6,17.50);
        R2_UIO_TLC_vip v9 = new R2_UIO_TLC_vip(0,null,0,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",6,17.50);
        R3_UIO_PUYO v10 = new R3_UIO_PUYO(0,null,0,"16/08/2024",15,"Ventana",0,"PAQ123",5,15);
        v6.getCedula();
        v6.getNombre();
        v6.getIdTicket();
        v6.setCedula(1754270864);
        v6.setNombre("Andres Tufiño");
        v6.setIdTicket(3215);
        v7.getCedula();
        v7.getNombre();
        v7.getIdTicket();
        v7.setCedula(1987270864);
        v7.setNombre("Juan Tufiño");
        v7.setIdTicket(5463);
        v8.getCedula();
        v8.getNombre();
        v8.getIdTicket();
        v8.setCedula(16549873);
        v8.setNombre("Julio Condor");
        v8.setIdTicket(6543);
        v9.getCedula();
        v9.getNombre();
        v9.getIdTicket();
        v9.setCedula(654351321);
        v9.setNombre("Pepe Condor");
        v9.setIdTicket(6543);
        v10.getCedula();
        v10.getNombre();
        v10.getIdTicket();
        v10.setCedula(876514345);
        v10.setNombre("Pedro Perez");
        v10.setIdTicket(6325);

        //Instanciar al menos 5 objetos con valores iniciales.
        R1_UIO_GYE v1 = new R1_UIO_GYE(1754278064,"Juan Paucar",2455,"16/08/2024",15,"Ventana",0,"ACE123",12,20);
        R1_UIO_GYE_Vip v2 = new R1_UIO_GYE_Vip(175413213,"Alexander Hurtado",2654,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",12,20);
        R2_UIO_TLC v3 = new R2_UIO_TLC(1765498320,"Andres Tufino",6543,"16/08/2024",15,"Ventana",0,"PAQ123",6,17.50);
        R2_UIO_TLC_vip v4 = new R2_UIO_TLC_vip(1769843216,"Ruben Galarza",6593,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",6,17.50);
        R3_UIO_PUYO v5 = new R3_UIO_PUYO(1798654320,"Julio Condor",9873,"16/08/2024",15,"Ventana",0,"PAQ123",5,15);

        System.out.println("--- Sistema de Venta de Tickets ---");
        System.out.println("--- Instanciados con datos nulos ---");


        System.out.println("--- Sistema de Venta de Tickets ---");
        System.out.println("--- Instanciados con datos iniciales ---");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v2.calcularCostovip();
        v3.mostrarInfo();
        v4.mostrarInfo();
        v4.calcularCostovip();
        v5.mostrarInfo();
        v6.mostrarInfo();
        v7.mostrarInfo();
        v7.calcularCostovip();
        v8.mostrarInfo();
        v9.mostrarInfo();
        v9.calcularCostovip();
        v10.mostrarInfo();
    }
}
