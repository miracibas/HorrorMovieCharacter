/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author miracibas
 */
public class HorrorMovieApp 
{

/**
 * Demonstrates monster attacks, fleeing, vulnerabilities,
 * transformations, and polymorphism.
 *
 * @param args command-line arguments; not used
 */
    public static void main(String args[]) 
    {
        Vampire vampire = new Vampire("Alucard", 100);
        Zombie zombie = new Zombie("Bob The Infected", 80);
        Werewolf werewolf = new Werewolf("Lawrence Talbot", 120);
        
        vampire.attack();
        zombie.attack();
        werewolf.attack();
        
        System.out.println();
        
        vampire.flee();
        zombie.flee();
        werewolf.flee();
        
        System.out.println();
        
        for (Vulnerability v : vampire.getVulnerability())
        {
            System.out.println("Vampire Vulnerabilities: " + v);
        }
        
        System.out.println();

         for (Vulnerability v : zombie.getVulnerability())
        {
            System.out.println("Zombie Vulnerabilities: " + v);
        }
         
        System.out.println();

         for (Vulnerability v : werewolf.getVulnerability())
        {
            System.out.println("Werewolf Vulnerabilities: " + v);
        }
         
        System.out.println();
        
        vampire.transform();
        vampire.attack();
        
        werewolf.transform();
        werewolf.attack();
        
        System.out.println();

        
        HorrorMovieCharacter[] characters = {vampire, werewolf, zombie};
        
        for (HorrorMovieCharacter character : characters)
        {
            System.out.println(character.getName());
            character.attack();
            System.out.println();
        }

    }
}
