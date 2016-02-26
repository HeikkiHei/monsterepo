package fi.heikkihei.monster.userinterface;

import fi.heikkihei.monster.creature.Creature;

/**
 * Tulostin GUIn output-ruutua varten.
 *
 * @author heikkiahprint
 */
public class PrinterForGUI {

    private Creature creature;
/**
 * Konstruktori, jolle annetaan hahmo.
 * @param creature tulostettava hahmo.
 */
    public PrinterForGUI(Creature creature) {
        this.creature = creature;
    }
/**
 * Tulostin, joka tulostaa GUIn output-ruutuun hahmon tiedot nätisti.
 * @return tuloste.
 */
    public String printCreature() {
        return "NAME: \n" + this.creature.getName() + "\n \n"
                + "CLASS: \n" + this.creature.getCreatureClass() + "\n \n"
                + "RACE: \n" + this.creature.getRace() + "\n \n"
                + "WEAPON: \n" + this.creature.getWeapon() + "\n \n"
                + "LEVEL: \n" + this.creature.getLevel() + "\n \n"
                + "STATISTICS: \n \n"
                + "Strength: \n" + this.creature.getStrength() + "\n"
                + "Dexterity: \n" + this.creature.getDexterity() + "\n"
                + "Constitution: \n" + this.creature.getConstitution() + "\n"
                + "Intelligence: \n" + this.creature.getIntelligence() + "\n"
                + "Wisdom: \n" + this.creature.getWisdom() + "\n"
                + "Charisma: \n" + this.creature.getCharisma();
    }
}
