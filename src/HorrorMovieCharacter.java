
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miracibas
 */
public abstract class HorrorMovieCharacter 
{
    private String name;
    private int health;
    private Vulnerability[] vulnerability;

/**
 * Initializes a horror character with a name, health, and weaknesses.
 *
 * @param name the character's name
 * @param health the character's initial health
 * @param vulnerability the character's weaknesses
 */
    public HorrorMovieCharacter(String name, int health, Vulnerability[] vulnerability) {
        this.name = name;
        this.health = health;
        this.vulnerability = vulnerability;
    }
   
    /**
     * Attack method implemented by every character.
     */
   public abstract void attack();
   
    /**
     * Flee method implemented by every character.
     */
   public abstract void flee();

    /**
     * Returns the character's name.
     * 
     * @return The character's name.
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     * Sets the character's name.
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    
    /**
     * Returns the character's health.
     * 
     * @return The character's health.
     */
    public int getHealth() 
    {
        return health;
    }
    
    /**
     * Sets the characters health.
     */
    public void setHealth(int health) 
    {
        this.health = health;
    }

/**
 * Returns the character's weaknesses.
 *
 * @return an array of the character's vulnerabilities
 */
    public Vulnerability[] getVulnerability() 
    {
        return vulnerability;
    }

    /**
     * Returns a text description of the character.
     * 
     * @return The character's name, health, and vulnerabilities.
     */
    @Override
    public String toString() 
    {
        return "HorrorMovieCharacter{" + "name=" + name + ", health=" + health + ", vulnerability=" + Arrays.toString(vulnerability) + '}';
    }
    
    
}
