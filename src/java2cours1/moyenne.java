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
public class moyenne {
    public moyenne(String[] argv){
        
        try
        {
            int moyenne = calcul_moyenne(argv);
            System.out.println("La moyenne est " + moyenne);
        }
        catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println(e);
        }
        
        
    }
    public int calcul_moyenne(String[] argv) {
        
        int somme = 0;
        int cpt = 0;
        
        for (int i = 0; i < argv.length; i++) 
        {
            somme += Integer.parseInt(argv[i]);
            cpt++;
        }
        
        return somme / cpt;
    }
    
}
