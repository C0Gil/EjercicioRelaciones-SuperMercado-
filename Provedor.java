/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelaciones;

/**
 *
 * @author gilbe
 */
public class Provedor {
    
    private String razonSocial;
    private String direccionFiscal;
    private String rfc;
    private String cadenas;

    public Provedor(String razonSocial, String direccionFiscal, String rfc, String cadenas) {
        this.razonSocial = razonSocial;
        this.direccionFiscal = direccionFiscal;
        this.rfc = rfc;
        this.cadenas = cadenas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCadenas() {
        return cadenas;
    }

    public void setCadenas(String cadenas) {
        this.cadenas = cadenas;
    }

    @Override
    public String toString() {
        return "Provedor{ " + "Razon social: " + razonSocial + ", Direccion fiscal: " + direccionFiscal + ", RFC: " + rfc + ", Cadenas a las que Distribuye: " + cadenas + " }";
    }        
    
}
