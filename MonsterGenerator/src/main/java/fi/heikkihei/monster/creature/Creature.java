package fi.heikkihei.monster.creature;

import java.util.*;

/**
 * @author HeikkiHei
 */
public class Creature {

    private String name;
    private String creatureClass;
    private String race;
    private String weapon;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int level;

    public Creature() {
    }

    /**
     * @param name hahmon nimi.
     * @param creatureClass hahmon luokka.
     * @param race hahmon rotu.
     */
    public Creature(String name, String creatureClass, String race) {
        this.name = name;
        this.creatureClass = creatureClass;
        this.race = race;
        this.weapon = "none";
        this.level = 0;
    }
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     * @param strength rajoitetaan 1-20.
     */
    public void setStrength(int strength) {
        if (strength >= 1 && strength <= 20) {
            this.strength = strength;
        }
    }

    public int getStrength() {
        return strength;
    }

    /**
     * @param dexterity rajoitetaan 1-20.
     */
    public void setDexterity(int dexterity) {
        if (dexterity >= 1 && dexterity <= 20) {
            this.dexterity = dexterity;
        }
    }

    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param constitution rajoitetaan 1-20.
     */
    public void setConstitution(int constitution) {
        if (constitution >= 1 && constitution <= 20) {
            this.constitution = constitution;
        }
    }

    public int getConstitution() {
        return constitution;
    }

    /**
     * @param intelligence rajoitetaan 1-20.
     */
    public void setIntelligence(int intelligence) {
        if (intelligence >= 1 && intelligence <= 20) {
            this.intelligence = intelligence;
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @param wisdom rajoitetaan 1-20.
     */
    public void setWisdom(int wisdom) {
        if (wisdom >= 1 && wisdom <= 20) {
            this.wisdom = wisdom;
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    /**
     * @param charisma rajoitetaan 1-20.
     */
    public void setCharisma(int charisma) {
        if (charisma >= 1 && charisma <= 20) {
            this.charisma = charisma;
        }
    }

    public int getCharisma() {
        return charisma;
    }

    /**
     * @param creatureClass asetetaan hahmolle luokka.
     */
    public void setCreatureClass(String creatureClass) {
        if (creatureClass != null) {
            this.creatureClass = creatureClass;
        }
    }

    public String getCreatureClass() {
        return creatureClass;
    }

    /**
     * @param name asetetaan hahmolle nimi.
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    /**
     * @param weapon annetaan hahmolle ase.
     */
    public void setWeapon(String weapon) {
        if (weapon != null) {
            this.weapon = weapon;
        }
    }

    public String getWeapon() {
        return weapon;
    }

    /**
     * @param race asetetaan hahmolle rotu.
     */
    public void setRace(String race) {
        if (race != null) {
            this.race = race;
        }
    }

    public String getRace() {
        return race;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

//</editor-fold>
    /**
     * @return nimi, luokka, rotu.
     */
    @Override
    public String toString() {
        return this.name
                + "\n " + this.creatureClass
                + "\n " + this.race
                + "\n " + this.level
                + "\n " + this.strength
                + "\n " + this.dexterity
                + "\n " + this.constitution
                + "\n " + this.intelligence
                + "\n " + this.wisdom
                + "\n " + this.charisma;
    }

}
