package monster.creature;

import java.util.*;

public class Creature {

    private String name;
    private String creatureClass;
    private String race;
    private String weapon; // may be changed to class -HH
    private int Str;
    private int Dex;
    private int Con;
    private int Int;
    private int Wis;
    private int Cha;

    public Creature(String name, String creatureClass, String race) {
        this.name = name;
        this.creatureClass = creatureClass;
        this.race = race;
        this.weapon = "none";
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public void setStr(int Str) {
        if (Str >= 1 && Str <= 10) {
            this.Str = Str;
        }
    }

    public int getStr() {
        return Str;
    }

    public void setDex(int Dex) {
        if (Dex >= 1 && Dex <= 10) {
            this.Dex = Dex;
        }
    }

    public int getDex() {
        return Dex;
    }

    public void setCon(int Con) {
        if (Con >= 1 && Con <= 10) {
            this.Con = Con;
        }
    }

    public int getCon() {
        return Con;
    }

    public void setInt(int Int) {
        if (Int >= 1 && Int <= 10) {
            this.Int = Int;
        }
    }

    public int getInt() {
        return Int;
    }

    public void setWis(int Wis) {
        if (Wis >= 1 && Wis <= 10) {
            this.Wis = Wis;
        }
    }

    public int getWis() {
        return Wis;
    }

    public void setCha(int Cha) {
        if (Cha >= 1 && Cha <= 10) {
            this.Cha = Cha;
        }
    }

    public int getCha() {
        return Cha;
    }

    public void setCreatureClass(String creatureClass) {
        if (creatureClass != null) {
            this.creatureClass = creatureClass;
        }
    }

    public String getCreatureClass() {
        return creatureClass;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setWeapon(String weapon) {
        if (weapon != null) {
            this.weapon = weapon;
        }
    }

    public void setRace(String race) {
        if (race != null) {
            this.race = race;
        }
    }

    public String getRace() {
        return race;
    }

    public String getWeapon() {
        return weapon;
    }
//</editor-fold>

    @Override
    public String toString() {
        return this.name + " " + this.creatureClass + " " + this.race;
    }

}
