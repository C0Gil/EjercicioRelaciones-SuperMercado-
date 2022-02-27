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
    private Provedor provedores;

    public Sucursal(String nombre, String direccion, int numeroEmpleados, CuentaBancaria cuenta, Provedor provedores, String clave, float monto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
        this.cuenta = new CuentaBancaria(clave, monto);
        this.provedores = provedores;
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

    public Provedor getProvedores() {
        return provedores;
    }

    public void setProvedores(Provedor provedores) {
        this.provedores = provedores;
    }

    @Override
    public String toString() {
        return "Sucursal{ " + "Nombre: " + nombre + ", Direccion: " + direccion + ", Numero de empleados: " + numeroEmpleados + ", Cuenta: " + cuenta + ", Provedores:" + provedores + " }";
    }        
    
}
