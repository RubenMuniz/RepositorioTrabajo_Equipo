package org.example;

public abstract class CuentaUsuario{
    private String correo;
    private int mesesActivo;
    private PlanSuscripcion planSuscripcion;

    public CuentaUsuario(String correo, int mesesActivo, PlanSuscripcion planSuscripcion) {
        this.correo = correo;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }
    public double calculo(){
        return planSuscripcion.calcular(mesesActivo);
    }
    public abstract String nom();

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMesesActivo() {
        return mesesActivo;
    }

    public void setMesesActivo(int mesesActivo) {
        this.mesesActivo = mesesActivo;
    }

    public PlanSuscripcion getPlanSuscripcion() {
        return planSuscripcion;
    }

    public void setPlanSuscripcion(PlanSuscripcion planSuscripcion) {
        this.planSuscripcion = planSuscripcion;
    }

    @Override
    public String toString() {
        return "Correo: " + correo +
                "\nMeses activos: " + mesesActivo +
                "\nTipo de cuenta: " + nom() +
                "\nTotal a pagar: $" + calculo() + " USD";
    }
}
