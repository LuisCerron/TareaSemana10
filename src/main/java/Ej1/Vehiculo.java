/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author LAB-USR-HUAN-A0304
 */
abstract class Vehiculo implements Alquilable, Electrico{
    protected int id;
    public Vehiculo(int id) {
        this.id = id;
    }
    protected abstract String obtenerTipo();
}
