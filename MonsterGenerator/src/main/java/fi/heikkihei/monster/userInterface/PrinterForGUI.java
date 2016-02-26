package fi.heikkihei.monster.userInterface;

import fi.heikkihei.monster.creature.Creature;

/**
 * Tulostin GUIn output-ruutua varten.
 *
 * @author heikkiah
 */
public class PrinterForGUI {

    private Creature creature;

    public PrinterForGUI(Creature creature) {
        this.creature = creature;
    }

    public String printCreature() {
        return "NAME: " + this.creature.getName() + "\n"
                + "CLASS: \t" + this.creature.getCreatureClass() + "\n"
                + "RACE: \t" + this.creature.getRace() + "\n"
                + "WEAPON: \t" + this.creature.getWeapon() + "\n"
                + "LEVEL: \t" + this.creature.getLevel() + "\n \n"
                + "STATISTICS: \n"
                + "Strength: \t" + this.creature.getStrength() + "\n"
                + "Dexterity: \t" + this.creature.getDexterity() + "\n"
                + "Constitution: \t" + this.creature.getConstitution() + "\n"
                + "Intelligence: \t" + this.creature.getIntelligence() + "\n"
                + "Wisdom: \t" + this.creature.getWisdom() + "\n"
                + "Charisma: \t" + this.creature.getCharisma();

    }
}
