/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelaciones;

import java.util.Scanner;

/**
 *
 * @author gilbe
 */
public class EjercicioRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Provedor Provedor1 = new Provedor("Provedor de Alimentos", "Pachuca", "COOO123456789123", "Sucursal Norte, Ciudad De Mexico Sur");
        Sucursal Pachuca_Norte = new Sucursal("Sucursal Norte", "Pachuca", 20, "125343", 12000.0f, Provedor1);
        Provedor Provedor2 = new Provedor("Provedor de Consumibles", "Pachuca", "QUUU123456789123", "Sucursal Sur");
        Sucursal Pachuca_Sur = new Sucursal("Sucursal Sur", "Pachuca", 18, "323468", 15000.0f, Provedor2);
        Provedor Provedor3 = new Provedor("Provedor de Productos Higienicos", "Pachuca", "APAA123456789123", "Sucursal Pricipal");
        Sucursal Pachuca_Centro = new Sucursal("Sucursal Centro", "Pachuca", 25, "456852", 20000.0f, Provedor3);
        
        int caso = 0;
        
        Scanner leerInt = new Scanner(System.in);
        
        do{
            
            System.out.println("+--------------------------------------------------------------------------------+");
            System.out.println("    MENU");
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("        (1) Ver Informacion De Las Sucursales");
            System.out.println("        (2) Editar Informacion De Las Sucursales");
            System.out.println("        (3) SALIR");
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("    ELIGE UNA OPCION");
            System.out.println("+--------------------------------------------------------------------------------+");
            
            caso = leerInt.nextInt();
            
            switch(caso){                
                case 1: {
                    do{
                        
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Ver Informacion De Las Sucursales");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) "+Pachuca_Norte.getNombre());
                        System.out.println("        (2) "+Pachuca_Centro.getNombre());
                        System.out.println("        (3) "+Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch (caso) {
                            case 1:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("        Nombre: " + Pachuca_Norte.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Direccion: " + Pachuca_Norte.getDireccion());
                                System.out.println("        Numero De empleados: " + Pachuca_Norte.getNumeroEmpleados());
                                System.out.println("        Cuenta: " + Pachuca_Norte.getCuenta());
                                System.out.println("        Provedores: " + Provedor1.getRazonSocial());
                                System.out.println("                    " + Provedor1.getDireccionFiscal());
                                System.out.println("                    " + Provedor1.getRfc());
                                System.out.println("                    " + Provedor1.getCadenas());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;                                
                            } 
                            case 2:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("        Nombre: " + Pachuca_Centro.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Direccion: " + Pachuca_Centro.getDireccion());
                                System.out.println("        Numero De empleados: " + Pachuca_Centro.getNumeroEmpleados());
                                System.out.println("        Cuenta: " + Pachuca_Centro.getCuenta());
                                System.out.println("        Provedores: " + Provedor3.getRazonSocial());
                                System.out.println("                    " + Provedor3.getDireccionFiscal());
                                System.out.println("                    " + Provedor3.getRfc());
                                System.out.println("                    " + Provedor3.getCadenas());
                                System.out.println("+--------------------------------------------------------------------------------+");                                
                                break;
                            }         
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("        Nombre: " + Pachuca_Sur.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Direccion: " + Pachuca_Sur.getDireccion());
                                System.out.println("        Numero De empleados: " + Pachuca_Sur.getNumeroEmpleados());
                                System.out.println("        Cuenta: " + Pachuca_Sur.getCuenta());
                                System.out.println("        Provedores: " + Provedor2.getRazonSocial());
                                System.out.println("                    " + Provedor2.getDireccionFiscal());
                                System.out.println("                    " + Provedor2.getRfc());
                                System.out.println("                    " + Provedor2.getCadenas());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }         
                            case 4:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    VOLVIENDO A ----> MENU");
                                System.out.println("+--------------------------------------------------------------------------------+");                                
                                break;
                            }
                            default:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    OPCION INVALIDA D:");                        
                                System.out.println("+--------------------------------------------------------------------------------+");  
                            }
                        }
                        
                    }while(caso != 4);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Editar Informacion De Las Sucursales");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) "+Pachuca_Norte.getNombre());
                        System.out.println("        (2) "+Pachuca_Centro.getNombre());
                        System.out.println("        (3) "+Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch(caso){
                            case 1:{
                                
                            }
                            case 2:{
                                
                            }
                            case 3:{
                                
                            }
                            case 4:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    VOLVIENDO A ----> MENU");
                                System.out.println("+--------------------------------------------------------------------------------+");
                            }
                            default:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    OPCION INVALIDA D:");                        
                                System.out.println("+--------------------------------------------------------------------------------+"); 
                            }                                
                        }                        
                    }while(caso != 4);                    
                    break;
                }
                case 3:{
                    System.out.println("+--------------------------------------------------------------------------------+");
                    System.out.println("    ADIOS :D");
                    System.out.println("+--------------------------------------------------------------------------------+");
                    break;
                }
                default:{                    
                    System.out.println("+--------------------------------------------------------------------------------+");
                    System.out.println("    OPCION INVALIDA D:");                        
                    System.out.println("+--------------------------------------------------------------------------------+");    
                }                                              
            }
            
        }while(caso != 3);        
        
    }
    
}
