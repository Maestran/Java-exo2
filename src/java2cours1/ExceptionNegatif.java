/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2cours1;

/**
 *
 * @author Tristan
 */
public class ExceptionNegatif extends Exception{
    
    ExceptionNegatif()
    {
        System.out.println("Erreur, vous avez rentré un nombre négatif");
    }

    ExceptionNegatif(double operande) {
        System.out.println("Erreur, " + operande + " est négatif");
    }
    
}
