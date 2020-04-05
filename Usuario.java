/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratein
 */
public class Usuario {
    private String Nombre;
    private int cedula;
    private int contrasena;
    private int edad;
    private int CantidadHijos;
    private int saldo;

    public Usuario(String Nombre, int cedula, int contrasena, int edad, int CantidadHijos, int saldo) {
        this.Nombre = Nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.edad = edad;
        this.CantidadHijos = CantidadHijos;
        this.saldo = saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getContrasena() {
        return contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantidadHijos() {
        return CantidadHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantidadHijos(int CantidadHijos) {
        this.CantidadHijos = CantidadHijos;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
