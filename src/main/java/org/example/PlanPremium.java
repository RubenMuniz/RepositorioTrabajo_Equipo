package org.example;

public class PlanPremium implements PlanSuscripcion{
    @Override
    public double calcular(int meses){
        return (14.0 * meses) + 3;
    }
}
