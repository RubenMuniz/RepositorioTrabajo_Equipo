package org.example;

public class CuentaEstandar extends CuentaUsuario{
    public CuentaEstandar(String correo, int mesesActivo) {
        super(correo, mesesActivo, new PlanEstandar());
    }
}
