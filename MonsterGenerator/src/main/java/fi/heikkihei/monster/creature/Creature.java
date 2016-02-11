package fi.heikkihei.monster.creature;

import java.util.*;

/**
 *
 * @author HeikkiHei
 */
public class Creature {

    private String name;
    private String creatureClass;
    private String race;
    private String weapon;
    private int Str;
    private int Dex;
    private int Con;
    private int Int;
    private int Wis;
    private int Cha;

    /**
     *
     * @param name hahmon nimi.
     * @param creatureClass hahmon luokka.
     * @param race hahmon rotu.
     */
    public Creature(String name, String creatureClass, String race) {
        this.name = name;
        this.creatureClass = creatureClass;
        this.race = race;
        this.weapon = "none";
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     *
     * @param Str rajoitetaan 1-10.
     */
        public void setStr(int Str) {
        if (Str >= 1 && Str <= 10) {
            this.Str = Str;
        }
    }

    /**
     *
     * @return
     */
    public int getStr() {
        return Str;
    }

    /**
     *
     * @param Dex  rajoitetaan 1-10.
     */
    public void setDex(int Dex) {
        if (Dex >= 1 && Dex <= 10) {
            this.Dex = Dex;
        }
    }

    /**
     *
     * @return
     */
    public int getDex() {
        return Dex;
    }

    /**
     *
     * @param Con  rajoitetaan 1-10.
     */
    public void setCon(int Con) {
        if (Con >= 1 && Con <= 10) {
            this.Con = Con;
        }
    }

    /**
     *
     * @return
     */
    public int getCon() {
        return Con;
    }

    /**
     *
     * @param Int  rajoitetaan 1-10.
     */
    public void setInt(int Int) {
        if (Int >= 1 && Int <= 10) {
            this.Int = Int;
        }
    }

    /**
     *
     * @return
     */
    public int getInt() {
        return Int;
    }

    /**
     *
     * @param Wis  rajoitetaan 1-10.
     */
    public void setWis(int Wis) {
        if (Wis >= 1 && Wis <= 10) {
            this.Wis = Wis;
        }
    }

    /**
     *
     * @return
     */
    public int getWis() {
        return Wis;
    }

    /**
     *
     * @param Cha  rajoitetaan 1-10.
     */
    public void setCha(int Cha) {
        if (Cha >= 1 && Cha <= 10) {
            this.Cha = Cha;
        }
    }

    /**
     *
     * @return
     */
    public int getCha() {
        return Cha;
    }

    /**
     *
     * @param creatureClass asetetaan hahmolle luokka.
     */
    public void setCreatureClass(String creatureClass) {
        if (creatureClass != null) {
            this.creatureClass = creatureClass;
        }
    }

    /**
     *
     * @return
     */
    public String getCreatureClass() {
        return creatureClass;
    }

    /**
     *
     * @param name asetetaan hahmolle nimi.
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param weapon annetaan hahmolle ase.
     */
    public void setWeapon(String weapon) {
        if (weapon != null) {
            this.weapon = weapon;
        }
    }

    /**
     *
     * @param race asetetaan hahmolle rotu.
     */
    public void setRace(String race) {
        if (race != null) {
            this.race = race;
        }
    }

    /**
     *
     * @return
     */
    public String getRace() {
        return race;
    }

    /**
     *
     * @return
     */
    public String getWeapon() {
        return weapon;
    }
//</editor-fold>

    /**
     *
     * @return nimi, luokka, rotu.
     */
    @Override
    public String toString() {
        return this.name + " " + this.creatureClass + " " + this.race;
    }

}
