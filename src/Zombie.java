/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miracibas
 */
public class Zombie extends HorrorMovieCharacter
{

    public Zombie(String name, int health) 
    {
        Vulnerability[] vulnerabilites = {Vulnerability.FIRE, Vulnerability.HOLY_WATER};
        super(name, health, vulnerabilites);
    }
    
    @Override
    public void attack()
    {
        System.out.println("The Zombie Bites!");
    }
    
    @Override
    public void flee()
    {
        System.out.println("The Zombie tucks its tail and flees");
    }
    
    
}
