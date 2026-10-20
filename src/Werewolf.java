/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miracibas
 */
public class Werewolf extends HorrorMovieCharacter implements Transformable
{
    private boolean transformed = false;
    
    public Werewolf(String name, int health)
    {
        Vulnerability[] vulnerabilites = {Vulnerability.FIRE, Vulnerability.SILVER};
        super(name, health, vulnerabilites);
    }
    
    @Override
    public void attack()
    {
        if(transformed)
            System.out.println("The Werewolf mauls it's target in wolf form!");
        else
            System.out.println("The Werewolf lunges at it's target!");
    }
    
    @Override
    public void flee()
    {
        System.out.println("The Werewolf growls and pounces away!");
    }
    
    
/**
 * Switches the werewolf between its normal form and wolf form.
 */
    @Override
    public void transform()
    {
        transformed = !transformed;
    }
    
}
