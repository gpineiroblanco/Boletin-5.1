/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg1;

/**
 *
 * @author Toshiba
 */
public class Boletin51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche parida = new Coche();
        System.out.println(parida.getVelocidade());
        parida.acelerar(30);
        System.out.println(parida.getVelocidade());        
        parida.frenar(20);
        System.out.println(parida.getVelocidade());
        
    }
    
}
