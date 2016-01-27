package monster.creature;

import java.util.*;

public class Creature {

    private String name;
    private String creatureClass;
    private String weapon; // may be changed to class -HH
    private int Str;
    private int Dex;
    private int Con;
    private int Int;
    private int Wis;
    private int Cha;

    public Creature() {
    }

    public Creature(String name, String creatureClass) {
        this.name = name;
        this.creatureClass = creatureClass;
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public void setStr(int Str) {
        this.Str = Str;
    }
    
    public int getStr() {
        return Str;
    }
    
    public void setDex(int Dex) {
        this.Dex = Dex;
    }
    
    public int getDex() {
        return Dex;
    }
    
    public void setCon(int Con) {
        this.Con = Con;
    }
    
    public int getCon() {
        return Con;
    }
    
    public void setInt(int Int) {
        this.Int = Int;
    }
    
    public int getInt() {
        return Int;
    }
    
    public void setWis(int Wis) {
        this.Wis = Wis;
    }
    
    public int getWis() {
        return Wis;
    }
    
    public void setCha(int Cha) {
        this.Cha = Cha;
    }
    
    public int getCha() {
        return Cha;
    }
    
    public void setCreatureClass(String creatureClass) {
        this.creatureClass = creatureClass;
    }
    
    public String getCreatureClass() {
        return creatureClass;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public String getWeapon() {
        return weapon;
    }
//</editor-fold>

    @Override
    public String toString() {
        return this.name + " " + this.creatureClass;
    }

    public ArrayList<Integer> Stats() {
        ArrayList<Integer> Stats = new ArrayList<>();
        Stats.add(this.Str);
        Stats.add(this.Dex);
        Stats.add(this.Con);
        Stats.add(this.Int);
        Stats.add(this.Wis);
        Stats.add(this.Cha);
        return Stats;
    }

}
