
package Logica;


public class Empleado extends Persona{
    
    private int Cod_Empleado;
    private String Cargo;

    public int getCod_Empleado() {
        return Cod_Empleado;
    }

    public void setCod_Empleado(int Cod_Empleado) {
        this.Cod_Empleado = Cod_Empleado;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
