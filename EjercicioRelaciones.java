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
        
        int caso;        
        String clave;      
        float monto;
        
        Scanner leerInt = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        Scanner leerFloat = new Scanner(System.in);
        
        do{
            
            System.out.println("+--------------------------------------------------------------------------------+");
            System.out.println("    MENU");
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("        (1) Ver Informacion De Las Sucursales");
            System.out.println("        (2) Editar Informacion De Las Sucursales");
            System.out.println("        (3) Ver Informacion De Las Cuentas");
            System.out.println("        (4) Editar Informacion De Las Cuentas");
            System.out.println("        (5) Ver Informacion De Los Provedores");
            System.out.println("        (6) Editar Informacion De Los Provedores");
            System.out.println("        (7) SALIR");
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
                    caso = 0;
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
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    Datos Sucursal: " + Pachuca_Norte.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.print("        Introduce el nuevo nombre: ");
                                Pachuca_Norte.setNombre(leerString.nextLine());
                                System.out.print("        Introduce la nueva direccion: ");
                                Pachuca_Norte.setDireccion(leerString.nextLine());
                                System.out.print("        Introduce el nuevo numero de empleados: ");
                                Pachuca_Norte.setNumeroEmpleados(leerInt.nextInt());
                                System.out.println("+--------------------------------------------------------------------------------+");                                
                                System.out.println("        ¿Quieres editar los datos de la cuenta?");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Norte.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva clave: ");
                                    clave = leerString.nextLine();
                                    System.out.print("        Introduce el nuevo monto: ");
                                    monto = leerFloat.nextFloat();
                                    Pachuca_Norte.setCuenta(new CuentaBancaria(clave, monto));
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                                                                             
                                System.out.println("        ¿Quieres editar los datos del provedor? (S/N)");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");                                
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();                                
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Norte.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva razon social: ");
                                    Provedor1.setRazonSocial(leerString.nextLine());
                                    System.out.print("        Introduce la nueva direccion fiscal: ");
                                    Provedor1.setDireccionFiscal(leerString.nextLine());
                                    System.out.print("        Introduce el nuevo RFC: ");      
                                    Provedor1.setRfc(leerString.nextLine());
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                
                                caso = 0;
                                break;
                            }
                            case 2:{                                                                
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    Datos Sucursal: " + Pachuca_Centro.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.print("        Introduce el nuevo nombre: ");
                                Pachuca_Centro.setNombre(leerString.nextLine());
                                System.out.print("        Introduce la nueva direccion: ");
                                Pachuca_Centro.setDireccion(leerString.nextLine());
                                System.out.print("        Introduce el nuevo numero de empleados: ");
                                Pachuca_Centro.setNumeroEmpleados(leerInt.nextInt());
                                System.out.println("+--------------------------------------------------------------------------------+");                                
                                System.out.println("        ¿Quieres editar los datos de la cuenta?");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Centro.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva clave: ");
                                    clave = leerString.nextLine();
                                    System.out.print("        Introduce el nuevo monto: ");
                                    monto = leerFloat.nextFloat();
                                    Pachuca_Centro.setCuenta(new CuentaBancaria(clave, monto));
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                                                                             
                                System.out.println("        ¿Quieres editar los datos del provedor? (S/N)");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");                                
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();                                
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Centro.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva razon social: ");
                                    Provedor3.setRazonSocial(leerString.nextLine());
                                    System.out.print("        Introduce la nueva direccion fiscal: ");
                                    Provedor3.setDireccionFiscal(leerString.nextLine());
                                    System.out.print("        Introduce el nuevo RFC: ");      
                                    Provedor3.setRfc(leerString.nextLine());
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                
                                caso = 0;                                
                                break;
                                
                            }                            
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");
                                System.out.println("    Datos Sucursal: " + Pachuca_Sur.getNombre());
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.print("        Introduce el nuevo nombre: ");
                                Pachuca_Sur.setNombre(leerString.nextLine());
                                System.out.print("        Introduce la nueva direccion: ");
                                Pachuca_Sur.setDireccion(leerString.nextLine());
                                System.out.print("        Introduce el nuevo numero de empleados: ");
                                Pachuca_Sur.setNumeroEmpleados(leerInt.nextInt());
                                System.out.println("+--------------------------------------------------------------------------------+");                                
                                System.out.println("        ¿Quieres editar los datos de la cuenta?");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Sur.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva clave: ");
                                    clave = leerString.nextLine();
                                    System.out.print("        Introduce el nuevo monto: ");
                                    monto = leerFloat.nextFloat();
                                    Pachuca_Sur.setCuenta(new CuentaBancaria(clave, monto));
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                                                                             
                                System.out.println("        ¿Quieres editar los datos del provedor? (S/N)");
                                System.out.println("        Si, entonces presiona 1");
                                System.out.println("        No, entonces presiona 0");                                
                                System.out.print("        --------> ");
                                caso = leerInt.nextInt();                                
                                if((caso == 1)){
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                    System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Sur.getNombre());
                                    System.out.println("|--------------------------------------------------------------------------------|");
                                    System.out.print("        Introduce la nueva razon social: ");
                                    Provedor2.setRazonSocial(leerString.nextLine());
                                    System.out.print("        Introduce la nueva direccion fiscal: ");
                                    Provedor2.setDireccionFiscal(leerString.nextLine());
                                    System.out.print("        Introduce el nuevo RFC: ");      
                                    Provedor2.setRfc(leerString.nextLine());
                                    System.out.println("+--------------------------------------------------------------------------------+");
                                }                                
                                caso = 0;
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
                    caso = 0;
                    break;
                }
                case 3:{
                    do{
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Ver Informacion De Las Cuentas");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) Cuenta de "+Pachuca_Norte.getNombre());
                        System.out.println("        (2) Cuenta de "+Pachuca_Centro.getNombre());
                        System.out.println("        (3) Cuenta de "+Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch (caso){
                            case 1:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Nombre: " + Pachuca_Norte.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Resumen: " + Pachuca_Norte.getCuenta());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }   
                            case 2:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Nombre: " + Pachuca_Centro.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Resumen: " + Pachuca_Centro.getCuenta());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Nombre: " + Pachuca_Sur.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Resumen: " + Pachuca_Sur.getCuenta());
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
                    caso = 0;
                    break;
                }
                case 4:{                    
                    do{
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Editar La Informacion De Las Cuentas");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) Cuenta de "+Pachuca_Norte.getNombre());
                        System.out.println("        (2) Cuenta de "+Pachuca_Centro.getNombre());
                        System.out.println("        (3) Cuenta de "+Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch(caso){
                            case 1:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                                                
                                System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Norte.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva clave: ");
                                clave = leerString.nextLine();                                
                                System.out.print("        Introduce el nuevo monto: ");                                
                                monto = leerFloat.nextFloat();                                
                                Pachuca_Norte.setCuenta(new CuentaBancaria(clave, monto));                                    
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 2:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                    
                                System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Centro.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva clave: ");                                
                                clave = leerString.nextLine();                                
                                System.out.print("        Introduce el nuevo monto: ");                                
                                monto = leerFloat.nextFloat();                                
                                Pachuca_Centro.setCuenta(new CuentaBancaria(clave, monto));                                
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                    
                                System.out.println("    Datos Cuenta de Sucursal: " + Pachuca_Sur.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva clave: ");                                
                                clave = leerString.nextLine();                                
                                System.out.print("        Introduce el nuevo monto: ");                                
                                monto = leerFloat.nextFloat();                                
                                Pachuca_Sur.setCuenta(new CuentaBancaria(clave, monto));                                                                    
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
                    caso = 0;
                    break;
                }
                case 5:{
                    do{
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Ver Informacion De Los Provedores");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) Provedor de " + Pachuca_Norte.getNombre());
                        System.out.println("        (2) Provedor de " + Pachuca_Centro.getNombre());
                        System.out.println("        (3) Provedor de " + Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch(caso){
                            case 1:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Es provedor de: " + Pachuca_Norte.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Razon social: " + Provedor1.getRazonSocial());
                                System.out.println("        Direccion Social: " + Provedor1.getDireccionFiscal());
                                System.out.println("        RFC: " + Provedor1.getRfc());
                                System.out.println("        Cadenas de las que es provedor: ");
                                System.out.println("        " + Provedor1.getCadenas());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 2:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Es provedor de: " + Pachuca_Centro.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Razon social: " + Provedor3.getRazonSocial());
                                System.out.println("        Direccion Social: " + Provedor3.getDireccionFiscal());
                                System.out.println("        RFC: " + Provedor3.getRfc());
                                System.out.println("        Cadenas de las que es provedor: ");
                                System.out.println("        " + Provedor3.getCadenas());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");                    
                                System.out.println("        Es provedor de: " + Pachuca_Sur.getNombre());                                
                                System.out.println("|--------------------------------------------------------------------------------|");
                                System.out.println("        Razon social: " + Provedor2.getRazonSocial());
                                System.out.println("        Direccion Social: " + Provedor2.getDireccionFiscal());
                                System.out.println("        RFC: " + Provedor2.getRfc());
                                System.out.println("        Cadenas de las que es provedor: ");
                                System.out.println("        " + Provedor2.getCadenas());
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
                    caso = 0;
                    break;
                }
                case 6:{
                    do{
                        System.out.println("+--------------------------------------------------------------------------------+");
                        System.out.println("    SUBMENU ----> Ver Informacion De Los Provedores");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("        (1) Provedor de " + Pachuca_Norte.getNombre());
                        System.out.println("        (2) Provedor de " + Pachuca_Centro.getNombre());
                        System.out.println("        (3) Provedor de " + Pachuca_Sur.getNombre());
                        System.out.println("        (4) SALIR");
                        System.out.println("|--------------------------------------------------------------------------------|");
                        System.out.println("    ELIGE UNA OPCION");
                        System.out.println("+--------------------------------------------------------------------------------+");
                        
                        caso = leerInt.nextInt();
                        
                        switch(caso){
                            case 1:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                    
                                System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Norte.getNombre());                                    
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva razon social: ");                                
                                Provedor1.setRazonSocial(leerString.nextLine());                                
                                System.out.print("        Introduce la nueva direccion fiscal: ");                                
                                Provedor1.setDireccionFiscal(leerString.nextLine());                                
                                System.out.print("        Introduce el nuevo RFC: ");                                      
                                Provedor1.setRfc(leerString.nextLine());                                
                                System.out.println("        Introduce la nueva informacion sobre las cadenas:");
                                System.out.println("        ");
                                Provedor1.setCadenas(leerString.nextLine());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 2:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                    
                                System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Centro.getNombre());                                    
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva razon social: ");                                
                                Provedor3.setRazonSocial(leerString.nextLine());                                
                                System.out.print("        Introduce la nueva direccion fiscal: ");                                
                                Provedor3.setDireccionFiscal(leerString.nextLine());                                
                                System.out.print("        Introduce el nuevo RFC: ");                                      
                                Provedor3.setRfc(leerString.nextLine());                                
                                System.out.println("        Introduce la nueva informacion sobre las cadenas:");
                                System.out.println("        ");
                                Provedor3.setCadenas(leerString.nextLine());
                                System.out.println("+--------------------------------------------------------------------------------+");
                                break;
                            }
                            case 3:{
                                System.out.println("+--------------------------------------------------------------------------------+");                                    
                                System.out.println("    Datos de  Provedor de Sucursal: " + Pachuca_Sur.getNombre());                                    
                                System.out.println("|--------------------------------------------------------------------------------|");                                
                                System.out.print("        Introduce la nueva razon social: ");                                
                                Provedor2.setRazonSocial(leerString.nextLine());                                
                                System.out.print("        Introduce la nueva direccion fiscal: ");                                
                                Provedor2.setDireccionFiscal(leerString.nextLine());                                
                                System.out.print("        Introduce el nuevo RFC: ");                                      
                                Provedor2.setRfc(leerString.nextLine());                                
                                System.out.println("        Introduce la nueva informacion sobre las cadenas:");
                                System.out.println("        ");
                                Provedor2.setCadenas(leerString.nextLine());
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
                    caso = 0;
                    break;
                }
                case 7:{
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
            
        }while(caso != 7);        
        
    }
    
}
