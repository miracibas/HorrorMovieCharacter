/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miracibas
 */
public class Vampire extends HorrorMovieCharacter implements Transformable
{
    private boolean transformed = false;
    
    public Vampire(String name, int health)
    {
        Vulnerability[] vulnerabilites = {Vulnerability.SUNLIGHT, Vulnerability.HOLY_WATER};
        super(name, health, vulnerabilites);
        
    }
    
    @Override
    public void attack()
    {
        if (transformed)
            System.out.println("The Vampire attacks in its bat form!");
        else
            System.out.println("The Vampire Claws!");
    }
    
    @Override
    public void flee()
    {
        System.out.println("The Vampire runs like a bat out of hell!");
    }
    
/**
 * Switches the vampire between its normal form and bat form.
 */
    @Override
    public void transform()
    {
        transformed = !transformed;
    }
 
}
