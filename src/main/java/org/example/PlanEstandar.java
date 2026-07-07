package org.example;

public class PlanEstandar implements PlanSuscripcion {
    @Override
    public double calcular(int meses) {
        return 9.0 * meses;
    }
}
