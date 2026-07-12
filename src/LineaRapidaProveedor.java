public class LineaRapidaProveedor extends ProveedorFactory{
    @Override
    public PlanDatos crearPlanDatos(String tipo){
        if (tipo.equals("Personal")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(0.5);
            return plan;
        }
        if (tipo.equals("Academico")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(1);
            return plan;
        }
        if (tipo.equals("Negocio")){
            PlanDatos plan = new PlanDatosPersonal();
            plan.setTasa(1.5);
            return plan;
        }
        return null;
    }
}
