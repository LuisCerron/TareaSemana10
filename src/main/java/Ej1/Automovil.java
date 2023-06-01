/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
public class Automovil extends Vehiculo{
    private int numAsientos;
    private double sumCombustible;
    private boolean tipo2; 

    public Automovil(int id, int numAsientos, double sumCombustible) {
        super(id);
        this.numAsientos = numAsientos;
        this.sumCombustible = sumCombustible;
    }

    @Override
    protected String obtenerTipo() {
        return "Es un automovil";
    }
    public double calcularConsumo(int horas){
        return horas* Math.random();
    }
    @Override
    public double calcularCostoAlquiler(int horas) {
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
