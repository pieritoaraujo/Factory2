public class ClaroProveedor extends ProveedorFactory{
    @Override
    public PlanDatos crearPlanDatos(String tipo){
        if (tipo.equals("Personal")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(0.6);
            return plan;
        }
        if (tipo.equals("Academico")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(1.2);
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
