package sesion5.entidades;
public class cliente extends persona{
    String codcliente;
    public static cliente fromPersona(persona per){
        cliente cli=new cliente();
        cli.setNombre(per.getNombre());
        cli.setApellido(per.getApellido());
        cli.setDni(per.getDni());
        return cli;
    }
    public cliente(){}
    public cliente(String codcliente){
        this.codcliente = codcliente;
    }
    @Override
    public String getText(){
        return "CLIENTE: "+ 
                this.getNombre() + " "+
                this.getApellido() + " | DNI: - CLIENTE: " + 
                this.getDni();
    }
    public String getCodcliente() {
        return codcliente;
    }
    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    } 
}
