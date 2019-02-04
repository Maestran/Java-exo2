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
public class UtiliseRacine
{
    public UtiliseRacine(String[] argv) 
    {
        try
        {
            Racine extracteur = new Racine(0.01);
            double operande= (Double.valueOf(argv[0])).doubleValue();
            double valeurRacine;    
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
        
            extracteur.setPrecision(0.00001);
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
            (valeurRacine-Math.sqrt(operande)));
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }
}