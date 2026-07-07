package org.example;

public class PlanPremium implements PlanSuscripcion{
    @Override
    public double calcularCosto (int meses){
        return (meses *14.00) + 3.00;

    }





    @Override
    public double calcular(int meses){
        return (14.0 * meses) + 3;
    }
}
