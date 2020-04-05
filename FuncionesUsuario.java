/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratein
 */
public class FuncionesUsuario {
    
    public int calculo( Usuario usuario){
        int saldo;
        if( usuario.getEdad<18 ){
            saldo = 0;
        }
        if (usuario.getEdad>18 && usuario.getEdad<30){
            saldo = 2000;
        }
        if (usuario.getEdad>30 && usuario.getEdad<65){
            saldo = 7000;
        }
        if (usuario.getEdad>65){
            saldo = 2000;
        }
        saldo = saldo - (saldo*0.03*usuario.getCantidadHijos);
            return saldo;
    }
    
}
