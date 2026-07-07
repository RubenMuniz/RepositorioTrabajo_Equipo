package org.example;

public class PlanBasico implements PlanSuscripcion{
    public double CalculoCosto(int meses){
        return 5.0 * meses;
    }
}
