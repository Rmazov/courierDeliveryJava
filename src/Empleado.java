public class Empleado extends Usuario{

    private int antiguedad;
    private String rH;

    private TipoEmpleado tipoEmpleado;

    public Empleado(String cedulaCliente, String nombre, String apellido, String celular, String correoElectronico, String ciudad, int antiguedad,String rH,TipoEmpleado tipoEmpleado) {
        super(cedulaCliente, nombre, apellido, celular, correoElectronico, ciudad);
        this.antiguedad= antiguedad;
        this.rH= rH;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getrH() {
        return rH;
    }

    public void setrH(String rH) {
        this.rH = rH;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}
