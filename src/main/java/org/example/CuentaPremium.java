package org.example;

public class CuentaPremium extends CuentaUsuario{
    public CuentaPremium(String correo, int mesesActivo) {
        super(correo, mesesActivo,new PlanPremium());
    }
    @Override
    public String nom() {
        return "Cuenta Premium";
    }
}

