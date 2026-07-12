void main() {
    ProveedorFactory proveedor;
    PlanDatos plan;

    System.out.println("BIENVENIDOS A LINEA RAPIDA");
    proveedor = new LineaRapidaProveedor();
    plan = proveedor.crearPlanDatos("Personal");
    System.out.println(plan);
    System.out.println("Pago por 500MB: " +plan.calculoPago(500));

    System.out.println("BIENVENIDOS A CLARO");
    proveedor = new ClaroProveedor();
    plan = proveedor.crearPlanDatos("Academico");
    System.out.println(plan);
    System.out.println("Pago por 1000MB: " +plan.calculoPago(1000));

    System.out.println("BIENVENIDOS A MOVISTAR");
    proveedor = new MovistarProveedor();
    plan = proveedor.crearPlanDatos("Negocio");
    System.out.println(plan);
    System.out.println("Pago por 200MB: " +plan.calculoPago(200));
}