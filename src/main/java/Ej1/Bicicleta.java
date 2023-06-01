/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public class Bicicleta extends Vehiculo{

    public Bicicleta(int id) {
        super(id);
    }

    @Override
    protected String obtenerTipo() {
        return "Es una bicicleta";
    }

    @Override
    public double calcularCostoAlquiler(int horas) {
        return horas * Math.random();
    }
    
    public double calcularCalorias(int horas){
        return horas * Math.random();
    }
    @Override
    public int getAutonomia() {
        return 0;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria.....");
    }
}
