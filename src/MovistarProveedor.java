public class MovistarProveedor extends ProveedorFactory{
    @Override
    public PlanDatos crearPlanDatos(String tipo){
        if (tipo.equals("Personal")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(0.8);
            return plan;
        }
        if (tipo.equals("Academico")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(1.25);
            return plan;
        }
        if (tipo.equals("Negocio")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(1.6);
            return plan;
        }
        return null;
    }
}
