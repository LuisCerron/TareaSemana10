/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej1;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(0,0,0);
        Motocicleta moto1 = new Motocicleta(0,"cuadrado");
        Bicicleta bici1 = new Bicicleta(2);
        
        System.out.println(auto1.calcularCostoAlquiler(2));
        System.out.println(auto1.calcularConsumo(3));
        System.out.println(auto1.obtenerTipo());
        
        System.out.println(moto1.calcularCostoAlquiler(5));
        System.out.println(moto1.obtenerTipo());
        moto1.cargarBateria();
        System.out.println(moto1.getAutonomia());
        System.out.println(moto1.calcularVelocidad());
        
        System.out.println(bici1.calcularCostoAlquiler(7));
        System.out.println(bici1.calcularCalorias(7));
        System.out.println(bici1.obtenerTipo());
    }
    
}
