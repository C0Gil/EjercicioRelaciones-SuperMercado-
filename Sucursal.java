/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelaciones;

/**
 *
 * @author gilbe
 */
public class Sucursal {
    
    private String nombre;
    private String direccion;
    private int numeroEmpleados;
    private CuentaBancaria cuenta;
    private Provedor provedor_1;
    private Provedor provedor_2;
    private Provedor provedor_3;

    public Sucursal(String nombre, String direccion, int numeroEmpleados, String clave, float monto, Provedor provedor_1, Provedor provedor_2, Provedor provedor_3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
        this.cuenta = new CuentaBancaria(clave, monto);
        this.provedor_1 = provedor_1;
        this.provedor_2 = provedor_2;
        this.provedor_3 = provedor_3;
    }        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public Provedor getProvedor_1() {
        return provedor_1;
    }

    public void setProvedor_1(Provedor provedor_1) {
        this.provedor_1 = provedor_1;
    }

    public Provedor getProvedor_2() {
        return provedor_2;
    }

    public void setProvedor_2(Provedor provedor_2) {
        this.provedor_2 = provedor_2;
    }

    public Provedor getProvedor_3() {
        return provedor_3;
    }

    public void setProvedor_3(Provedor provedor_3) {
        this.provedor_3 = provedor_3;
    }

    

    @Override
    public String toString() {
        return "Sucursal{ " + "Nombre: " + nombre + ", Direccion: " + direccion + ", Numero de empleados: " + numeroEmpleados + ", Cuenta: " + cuenta + ", Provedor 1: " + provedor_1 + ", Provedor 2 " + provedor_2 + ", Provedor 3 " + provedor_3 +" }";
    }        
    
}
