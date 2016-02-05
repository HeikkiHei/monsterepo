//MAIN -Heikki Hei
package monster.monstergenerator;

import java.io.File;
import java.util.Scanner;
import monster.userInterface.*;
import monster.randomizer.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10000; i++) {
//            RandomRace randomr = new RandomRace();
//            RandomClass randomc = new RandomClass();
//            RandomName randomn = new RandomName();
//            RandomWeapon randomw = new RandomWeapon();
//        }
//          Näitä käytettiin randomizerin testaamiseen, testit vielä tekemättä. Testasin ylisuurella määrällä, pysyykö lukemat oikeassa välissä. -Heikki Hei

        Scanner reader = new Scanner(System.in);
        TextInterface monster = new TextInterface(reader);
        monster.run();
//          Tätä käytettiin lähinnä käyttöliittymän testaamiseen. Kommentoitu pois jotta voisi testata tiedosto-lukijaa. -Heikki Hei
    }
}
