package org.example;

public class CuentaBasica extends CuentaUsuario{
    public CuentaBasica(String correo, int mesesActivo) {
        super(correo, mesesActivo,new PlanBasico());
    }
}
