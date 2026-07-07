package org.example;

public class PlanEstandar implements PlanSuscripcion{
    public double CalculoCost(int meses){
        return 9.0 * meses;
    }
}
