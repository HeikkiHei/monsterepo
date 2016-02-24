package fi.heikkihei.monster.creature;

/**
 * Luotava hahmo -olio.
 *
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

    /**
     * Parametritön konstruktori.
     */
    public Creature() {
        this.level = 0;
    }

    /**
     * Asetetaan hahmon voima.
     *
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
     * Asetetaan hahmon tarkkuus.
     *
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
     * Asetetaan hahmon ruumiinrakenne.
     *
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
     * Asetetaan hahmon älykkyys.
     *
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
     * Asetetaan hahmon viisaus.
     *
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
     * Asetaan hahmon karisma.
     *
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
     * Asetetaan hahmolle luokka.
     *
     * @param creatureClass String, jossa luokan tiedot.
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
     * Asetetaan hahmolle nimi.
     *
     * @param name String, jossa nimi.
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
     * Asetetaan hahmolle ase.
     *
     * @param weapon String, jossa aseen tiedot.
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
     * Asetetaan hahmolle rotu.
     *
     * @param race String, jossa rodun tiedot.
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

    @Override
    public String toString() {
        return this.name
                + "\n " + this.creatureClass + "\n " + this.race + "\n " + this.weapon + "\n " + this.level + "\n " + this.strength + "\n " + this.dexterity + "\n " + this.constitution + "\n " + this.intelligence + "\n " + this.wisdom + "\n " + this.charisma;
    }
}
