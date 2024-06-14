package Examen_TufinoAndres;

public class Main {
    public static void main(String[] args){
        R1_UIO_GYE v1 = new R1_UIO_GYE(0,null,0,"16/08/2024",15,"Ventana",0,"ACE123",12,20);
        R1_UIO_GYE_Vip v2 = new R1_UIO_GYE_Vip(0,null,0,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",12,20);
        R2_UIO_TLC v3 = new R2_UIO_TLC(0,null,0,"16/08/2024",15,"Ventana",0,"PAQ123",6,20);
        R2_UIO_TLC_vip v4 = new R2_UIO_TLC_vip(0,null,0,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",12,20);

        System.out.println("--- Sistema de Venta de Tickets ---");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v2.calcularCostovip();
        v3.mostrarInfo();
        v4.mostrarInfo();
        v4.calcularCostovip();

    }
}
