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
public class Racine{
    private double precision;
    
    Racine(double precision)
    {
        this.precision=precision;
    }
    
    double racine(double operande) throws ExceptionNegatif
    {
        if(operande < 0)
        {
            throw new ExceptionNegatif(operande);
        }
        double solution, carre, a, b;
        a=0;
        b=operande;
        solution=(a+b)/2;
    
        while(b-a>precision)    
        {
            carre=solution*solution;
            if (carre>operande) b=solution;
            else a=solution;
            solution=(a+b)/2;
        }   
    
        return solution;
    }
    
    double getPrecision() { return precision; }

    void setPrecision(double precision) { this.precision=precision; }
}