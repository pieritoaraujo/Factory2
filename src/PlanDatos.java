public abstract class PlanDatos {
    protected String nombre;
    protected double tasa;

    public void setTasa(double tasa) {
        this.tasa=tasa;
    }

    public double calculoPago(int datos){
        return datos * tasa;
    }

    @Override
    public String toString() {
        return "Plan: " + nombre +
                "\nTasa: " + tasa;
    }
}
