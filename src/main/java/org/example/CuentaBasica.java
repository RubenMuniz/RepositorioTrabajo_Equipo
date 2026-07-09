package org.example;

public class CuentaBasica extends CuentaUsuario{
    public CuentaBasica(String correo, int mesesActivo) {
        super(correo, mesesActivo,new PlanBasico());
    }
    @Override
    public String nom() {
        return "Cuenta Basica";
    }
}
