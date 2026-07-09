package org.example;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<CuentaUsuario> cuentaUsuarios;
    public  void registroPlataforma(CuentaUsuario cuentaUsuario){
        cuentaUsuarios.add(cuentaUsuario);
    }
    public void imprimirReporte() {
        double total = 0;
        System.out.println(" Reporte del Día ");
        for (CuentaUsuario v : cuentaUsuarios) {
            double costo = v.calculo();
            total += costo;
            System.out.println("Tipo de vehiculo: "+ v.nom());
            System.out.println( v.toString());
        }

        System.out.println("Total Recaudado: " + total);
    }
}
