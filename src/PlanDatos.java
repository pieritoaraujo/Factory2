public abstract class PlanDatos {
    protected String nombre;
    protected float tasa;

    public abstract void setTasa();

    public float calculoPago(int datos){
        return datos * tasa;
    }

    @Override
    public String toString() {
        return "PlanDatos{" +
                "nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
