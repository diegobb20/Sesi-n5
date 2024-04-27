package sesion5.entidades;
public class empleado extends persona{
    private String codempleado;    
    public static empleado fromPersona(persona per){
        empleado emp=new empleado();
        emp.setNombre(per.getNombre());
        emp.setApellido(per.getApellido());
        emp.setDni(per.getDni());
        return emp;
    }  
    public empleado(){}
    public empleado(String codempleado, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.codempleado = codempleado;
    }
    @Override
    public String getText(){
        return "EMPLEADO: "+ 
                this.getNombre() + " "+
                this.getApellido() + " | DNI: "+
                this.getDni();
    }
    public String getCodempleado() {
        return codempleado;
    }
    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }  
}
