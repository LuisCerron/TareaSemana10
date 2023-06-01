/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public class Motocicleta extends Vehiculo{
    private String tipoMotor;
    public Motocicleta(int id, String tipoMotor) {
        super(id);
        this.tipoMotor = tipoMotor;
    }

    @Override
    protected String obtenerTipo() {
        return "Es una moto...";
    }

    @Override
    public double calcularCostoAlquiler(int horas) {
         return horas * Math.random();
    }
    
    public double calcularVelocidad(){
        return Math.random();
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
