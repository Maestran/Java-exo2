/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package java2cours1;
import java.util.Scanner;

/**
 *
 * @author Tristan
 */
public class Java2Cours1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Programme du premier TP de JAVA");
        System.out.println("****Par TRISTAN GORLIN ****\n\n");
        int value = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
        do
        {
            System.out.println("Que voulez vous faire ?");
            System.out.println("1) Voir le programme d'affichage de la Partie A");
            System.out.println("2) Voir le programme de moyenne Partie B exercice 1");
            System.out.println("3) Voir le programme de racine carré Partie B exercice 2");
            System.out.println("0) Quitter");
            
            value = scanner.nextInt();
            if(value != 0 && value != 1 && value != 2 && value != 3)
            { 
                System.out.println("Erreur dans votre saisie");
            }
            else if(value == 1)
            {
                System.out.println("Lancement du programme d'affichage");
                affichage();
            }
            else if(value == 2)
            {
                System.out.println("Lancement du programme de moyenne");
                if(!yesOrNo())
                {
                    System.out.println("IMPLEMENTER LA METHODE DE SAISIE");
                }
                else
                {
                     moyenne a = new moyenne(args);
                }
               
            }
            else if(value == 3)
            {
                System.out.println("Lancement du programme de racine carré");
                if(!yesOrNo())
                {
                    System.out.println("IMPLEMENTER LA METHODE DE SAISIE");
                }
                else
                {
                    UtiliseRacine b = new UtiliseRacine(args);
                }
            }
            
        }while(value != 0);
       
        System.out.println("Goodbye !");
        
    }
    
    /**
     *
     * @return 
     */
    
    public static boolean yesOrNo()
    {

        Scanner scanner;
        scanner = new Scanner(System.in);
        String test = new String("");
        do
        {
            System.out.println("Avez vous rentré vos valeurs à l'appel du programme en ligne de commande ?");
            System.out.println("Y) OUI");
            System.out.println("N) NON");
            test = scanner.nextLine();
        }while(test == "Y" || test == "N");
        
        return test == "Y";
        
    }
    public static void affichage()
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int value = 0, value2 = 0;
        System.out.println("Veuillez saisir un nombre");
        value = scanner.nextInt();
        
        System.out.println("Vous avez saisi : " + value);
        
        
        System.out.println("Veuillez saisir un autre nombre nombre");
        value2 = scanner.nextInt();
        
        System.out.println("Vous avez saisi : " + value2);
        
        System.out.println(value + " + " + value2 + " = " + (value+value2));
        System.out.println(value + " - " + value2 + " = " + (value-value2));
        System.out.println(value + " * " + value2 + " = " + (value*value2));
        try
        {
            System.out.println(value + " / " + value2 + " = " + (value/value2));
            System.out.println(value + " % " + value2 + " = " + (value%value2));   
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Erreur : Division par 0 ");
        }
    }
    
}