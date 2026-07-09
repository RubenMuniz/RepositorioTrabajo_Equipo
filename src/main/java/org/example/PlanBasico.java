package org.example;

public class PlanBasico implements  PlanSuscripcion{

    @Override
    public double calcular (int meses){
        return 5*meses;
    }


}
